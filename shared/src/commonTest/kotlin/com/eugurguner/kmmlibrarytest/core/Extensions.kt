package com.makswin.bifrost.core

import com.makswin.bifrost.core.models.BaseResponseModel
import com.makswin.bifrost.core.models.ResponseStatus

fun <T> BaseResponseModel<T>.isFailed(): Boolean {
    return this.status == ResponseStatus.Error
}