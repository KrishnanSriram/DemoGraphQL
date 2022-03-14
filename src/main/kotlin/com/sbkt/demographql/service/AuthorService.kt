package com.sbkt.demographql.service

import com.sbkt.demographql.model.Author
import com.sbkt.demographql.repository.AuthorRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class AuthorService(val repository: AuthorRepository) {
    fun addAuthor(firstName: String, lastName: String, email: String): Author {
        val id = Random().nextInt(Int.MAX_VALUE)
        val author = Author(id, firstName, lastName, email)
        return repository.save(author)
    }

    fun listAllAuthors(): MutableList<Author> {
        return repository.findAll()
    }

    fun fundAuthorById(authorId: Int): Optional<Author> {
        return repository.findById(authorId)
    }
}