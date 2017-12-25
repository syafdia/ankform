package com.github.syafdia.ankform.form

import android.content.Context

interface Form {

    val context: Context

    val key: String

    val label: String

    var value: String

    var errorMessage: String?

    fun render()
}