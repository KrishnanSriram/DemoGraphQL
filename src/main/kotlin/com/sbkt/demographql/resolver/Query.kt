package com.sbkt.demographql.resolver

import com.sbkt.demographql.model.Author
import com.sbkt.demographql.repository.AuthorRepository
import graphql.kickstart.tools.GraphQLQueryResolver

class Query(val authorRepository: AuthorRepository): GraphQLQueryResolver {
    fun findAllAuthors(): MutableList<Author> {
        return authorRepository.findAll()
    }

    fun countAuthors(): Long {
        return authorRepository.count()
    }
}