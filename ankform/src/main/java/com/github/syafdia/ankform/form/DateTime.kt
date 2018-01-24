package com.github.syafdia.ankform.form

import android.content.Context
import android.widget.DatePicker

class DateTime(
        override val context: Context,
        override val key: String,
        override val label: String
) : Form {

    override var value: String = ""

    override var errorMessage: String? = null

    override fun render(): DatePicker {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}