package com.mybank.domain

abstract class UseCase<I, O> {
    abstract suspend fun execute(input: I): O
}