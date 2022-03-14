package com.sbkt.demographql.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Author(@Id val authorId: Int, val firstName: String, val lastName: String, val email: String)