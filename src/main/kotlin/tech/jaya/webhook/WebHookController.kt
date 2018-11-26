package tech.jaya.webhook


import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import tech.jaya.model.Event
import tech.jaya.service.IEventService

@RestController
@RequestMapping("/")
open class WebHookController (val eventService: IEventService) {

    @PostMapping(consumes = arrayOf(MediaType.APPLICATION_FORM_URLENCODED_VALUE))
    fun post(@RequestParam payload: Event): ResponseEntity<String>? {
        eventService.saveEvent(payload)
        return ResponseEntity.ok("")
    }

}