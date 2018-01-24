package com.github.syafdia.ankformexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.syafdia.ankform.AnKForm
import com.github.syafdia.ankform.Configuration
import com.github.syafdia.ankform.form.FormType
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val configurations = listOf(
                Configuration(
                        key = "username",
                        label = "Username",
                        formType = FormType.TEXT
                ),
                Configuration(
                        key = "email",
                        label = "Email",
                        formType = FormType.TEXT
                )
        )

        val anKForm = AnKForm(
                linearLayout_main_anKFormContainer,
                this,
                configurations,
                JSONObject()
        )

        anKForm.render()
    }
}
