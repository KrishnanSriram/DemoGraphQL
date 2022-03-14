package com.sbkt.demographql.repository

import com.sbkt.demographql.model.Author
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository: JpaRepository<Author, Int> {
}