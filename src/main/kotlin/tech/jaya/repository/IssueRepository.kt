package tech.jaya.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import tech.jaya.model.Event
import tech.jaya.model.Issue

@Repository
interface IssueRepository: CrudRepository<Issue, Long> {
    @Query("""
           select i from Issue i
                left join fetch e.repository  r
                left join fetch e.sender u
                left join fetch c.user cu
                left join fetch i.user iu
                left join fetch r.owner ro
                where i.id = :idIssue
            """)
    fun findIssue(@Param("idIssue") idIssue: Long): Issue
}