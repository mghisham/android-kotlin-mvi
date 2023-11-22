package com.mybank.ui

fun interface Reducer<S> {
    fun reduce(state: S): S
}