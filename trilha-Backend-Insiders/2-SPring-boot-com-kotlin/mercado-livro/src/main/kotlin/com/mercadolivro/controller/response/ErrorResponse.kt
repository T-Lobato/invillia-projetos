package com.mercadolivro.controller.response

data class ErrorResponse(
    var httpcode: Int,
    var message: String,
    var internalCode: String,
    var erros: List<FieldErrorResponse>?
)