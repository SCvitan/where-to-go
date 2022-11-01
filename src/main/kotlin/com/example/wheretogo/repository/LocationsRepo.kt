package com.example.wheretogo.repository

import com.example.wheretogo.model.Locations
import org.springframework.data.repository.CrudRepository

interface LocationsRepo: CrudRepository<Locations, Long> {
}