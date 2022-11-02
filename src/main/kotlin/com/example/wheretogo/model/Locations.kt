package com.example.wheretogo.model

import org.springframework.data.annotation.Id


data class Locations(

    @Id
    val id: Long,
    val name: String,
    val cathegory: String

)
