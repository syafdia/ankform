package com.github.syafdia.ankform

import android.content.Context
import org.json.JSONObject

class AnKForm(
        private val context: Context,
        private val configurations: List<Configuration>
) {

    private var dataSource: JSONObject? = null

    constructor(
            context: Context,
            configurations: List<Configuration>,
            dataSource: JSONObject) : this(context, configurations
    ) {
        this.dataSource = dataSource
    }

    fun render() {

    }
}