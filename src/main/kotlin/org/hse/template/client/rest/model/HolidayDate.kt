package org.hse.template.client.rest.model

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Праздничная дата")
class HolidayDate (
    @Schema(description = "Iso")
    val iso: String,

    @Schema(description = "Дата")
    val datetime: HolidayDateTime
)