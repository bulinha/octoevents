package tech.jaya.webhook


import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import tech.jaya.model.Event
import tech.jaya.service.EventService
import tech.jaya.service.IEventService

@RestController
@RequestMapping("/")
open class WebHookController (val eventService: IEventService) {

    @PostMapping(consumes = arrayOf(MediaType.APPLICATION_FORM_URLENCODED_VALUE))
    fun post(@RequestParam payload: Event):String {
        eventService.saveEvent(payload)
        print("chamou o payload " + payload)
        return "eita porra"
    }

}