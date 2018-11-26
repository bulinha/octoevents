package tech.jaya.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import tech.jaya.model.Event
import java.util.*

@Repository
interface EventRepository : CrudRepository<Event, Long> {
    @Query("""
           select e from Event e
                left join fetch e.comment c
                left join fetch e.issue i
                left join fetch e.repository  r
                left join fetch e.sender u
                left join fetch c.user cu
                left join fetch i.user iu
                left join fetch r.owner ro
                where i.id = :idIssue
            """)
    fun findByIssue(@Param("idIssue") idIssue: Long): Optional<List<Event>>
}