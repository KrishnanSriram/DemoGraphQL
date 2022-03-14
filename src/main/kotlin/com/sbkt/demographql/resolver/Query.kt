package com.sbkt.demographql.resolver
import com.sbkt.demographql.model.Author
import com.sbkt.demographql.repository.AuthorRepository
import graphql.kickstart.tools.GraphQLQueryResolver
import org.slf4j.LoggerFactory

class Query(val authorRepository: AuthorRepository): GraphQLQueryResolver {
    private val log = LoggerFactory.getLogger(Query::class.java)

    init {
        log.info("Query intiialized successfully")
    }
    fun findAllAuthors(): MutableList<Author> {
        return authorRepository.findAll()
    }

    fun countAuthors(): Int {
        return authorRepository.count().toInt()
    }
}