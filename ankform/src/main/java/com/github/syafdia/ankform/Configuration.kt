package com.github.syafdia.ankform

import com.github.syafdia.ankform.form.FormType
import com.github.syafdia.ankform.validation.Validation

data class Configuration(
        val key: String,
        val label: String,
        val formType: FormType,
        var beforeDisplay: ((v: String) -> String?)? = null,
        var beforeSave: ((v: String) -> String?)? = null,
        var validationRules: List<Validation>? = null
)