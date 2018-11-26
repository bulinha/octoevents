package tech.jaya.issues

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
    fun  listIssue():Iterable<Issue> {
        return issueRepository.findAll()
    }

    @GetMapping("/{idIssue}")
    fun  getIssue(@PathVariable("idIssue") idIssue:Long):Issue {
        return issueRepository.findIssue(idIssue)
    }


    @GetMapping("/{idIssue}/events")
    fun  listEventsFromIssue(@PathVariable("idIssue") idIssue:Long):List<Event> {
        return eventRepository.findByIssue(idIssue)
    }

}