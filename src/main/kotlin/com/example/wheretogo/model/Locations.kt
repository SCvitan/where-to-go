package com.example.wheretogo.model

import javax.persistence.Id

data class Locations(

    @Id
    val id: Long,
    val name: String,
    val cathegory: String

)
