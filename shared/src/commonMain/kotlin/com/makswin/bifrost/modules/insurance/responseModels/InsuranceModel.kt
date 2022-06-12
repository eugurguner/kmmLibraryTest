package com.makswin.bifrost.modules.insurance.responseModels

import com.makswin.fizbot.fragment.FragmentInsurance

data class InsuranceModel(
    var urlDask: String = "",
    var urlResidencial: String = "",
) {

    constructor(data: FragmentInsurance) : this() {
        this.urlDask = data.url_dask ?: ""
        this.urlResidencial = data.url_konut ?: ""
    }

}