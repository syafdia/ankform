package com.github.syafdia.ankform

import com.github.syafdia.ankform.form.FormType
import com.github.syafdia.ankform.validation.Validation

class Configuration(
        private val key: String,

        private val label: String,

        private val formType: FormType,

        private var beforeDisplay: ((v: String) -> String?)? = null,

        private var beforeSave: ((v: String) -> String?)? = null,

        private var validationRules: List<Validation>? = null
)