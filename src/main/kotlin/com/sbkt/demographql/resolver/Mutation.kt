package com.sbkt.demographql.resolver

import com.sbkt.demographql.model.Author
import com.sbkt.demographql.repository.AuthorRepository
import graphql.kickstart.tools.GraphQLMutationResolver
import java.util.Random

class Mutation(val authorRepository: AuthorRepository): GraphQLMutationResolver {
    fun newAuthor(firstName: String, lastName: String, email: String): Author {
        val id = Random().nextInt(Int.MAX_VALUE)
        val author = Author(authorId = id, firstName = firstName, lastName = lastName, email = email)
        return authorRepository.save(author)
    }

}