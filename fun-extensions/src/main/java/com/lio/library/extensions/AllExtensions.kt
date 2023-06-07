package com.lio.library.extensions

fun String.isInvalidEmail() = this != "@" && this != "-" && this != "_"