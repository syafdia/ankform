package com.github.syafdia.ankform.form

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class Text(
        override val context: Context,
        override val key: String,
        override val label: String
) : Form {

    override var value: String = ""

    override var errorMessage: String? = null

    override fun render(): View {
        val textView = TextView(context)
        val editText = EditText(context)
        val layoutParams =  LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
                )

        val linearLayout = LinearLayout(context)

        textView.text = label
        editText.layoutParams = layoutParams

        linearLayout.addView(textView)
        linearLayout.addView(editText)
        linearLayout.orientation = LinearLayout.VERTICAL

        return linearLayout
    }

}