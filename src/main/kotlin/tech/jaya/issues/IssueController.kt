package tech.jaya.issues

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tech.jaya.model.Event
import tech.jaya.model.Issue
import tech.jaya.repository.EventRepository
import tech.jaya.repository.IssueRepository
import tech.jaya.repository.UserRepository

@RestController
@RequestMapping("/issue")
open class IssueController(
        val eventRepository: EventRepository,
        val issueRepository: IssueRepository) {

    @GetMapping("/")
    fun  listIssue(): ResponseEntity<MutableIterable<Issue>>? {
        return ResponseEntity.ok(issueRepository.findAll())
    }

    @GetMapping("/{idIssue}")
    fun  getIssue(@PathVariable("idIssue") idIssue:Long): ResponseEntity<Issue>? {
        return issueRepository.findIssue(idIssue).map { issue ->
            ResponseEntity.ok(issue)
        }.orElse(ResponseEntity.notFound().build())
    }


    @GetMapping("/{idIssue}/events")
    fun  listEventsFromIssue(@PathVariable("idIssue") idIssue:Long): ResponseEntity<List<Event>>? {
        return eventRepository.findByIssue(idIssue).map {
            lst -> ResponseEntity.ok(lst)
        }.orElse(ResponseEntity.notFound().build())
    }

}