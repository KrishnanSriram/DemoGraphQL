package com.sbkt.demographql

import com.sbkt.demographql.model.Author
import com.sbkt.demographql.repository.AuthorRepository
import com.sbkt.demographql.resolver.Mutation
import com.sbkt.demographql.resolver.Query
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoGraphQlApplication {
    private val log = LoggerFactory.getLogger(DemoGraphQlApplication::class.java)

    @Bean
    fun query(repository: AuthorRepository): Query {
        log.info("Record count - ${repository.count()}")
        return Query(repository)
    }

    @Bean
    fun mutation(repository: AuthorRepository): Mutation {
        return Mutation(repository)
    }

    @Bean
    fun init(repository: AuthorRepository) = CommandLineRunner {
        log.info("Add new Author")
        var author = Author(123, "Krishnan", "Sriram", "krishnan.sriram@hotmail.com")
        repository.save(author)
        log.info("1 author added")
    }
}

fun main(args: Array<String>) {
    runApplication<DemoGraphQlApplication>(*args)
}
