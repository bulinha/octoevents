package tech.jaya.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import tech.jaya.model.Event
import tech.jaya.model.Issue
import java.util.*

@Repository
interface IssueRepository: CrudRepository<Issue, Long> {
    @Query("""
           select i from Issue i
                left join fetch i.user iu
                where i.id = :idIssue
            """)
    fun findIssue(@Param("idIssue") idIssue: Long): Optional<Issue>
}