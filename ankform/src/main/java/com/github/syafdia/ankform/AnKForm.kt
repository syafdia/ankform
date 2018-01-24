package com.github.syafdia.ankform

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import com.github.syafdia.ankform.form.FormType
import com.github.syafdia.ankform.form.Text
import org.json.JSONObject

class AnKForm(
        private val rootContainer: LinearLayout,
        private val context: Context,
        private val configurations: List<Configuration>
) {

    private var dataSource: JSONObject? = null

    private var components: Map<String, View>? = null

    constructor(
            rootContainer: LinearLayout,
            context: Context,
            configurations: List<Configuration>,
            dataSource: JSONObject
    ) : this(rootContainer, context, configurations) {
        this.dataSource = dataSource
    }

    fun render() {
        val components = configurations.map { conf -> run {
            when (conf.formType) {
                FormType.TEXT -> {
                    val text = Text(context, conf.key, conf.label).render()
                    Pair(conf.key, text)
                }
                FormType.DATE_TIME -> {
                    TODO()
                }
            }
        }}.toMap()

        components.forEach { rootContainer.addView(it.value) }

        this.components = components
    }
}