package com.github.syafdia.ankform.form

import android.content.Context

class Text(
        override val context: Context,
        override val key: String,
        override val label: String
) : Form {

    override var value: String = ""

    override var errorMessage: String? = null

    override fun render() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}