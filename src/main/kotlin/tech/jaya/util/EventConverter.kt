package tech.jaya.util

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component
import tech.jaya.model.Event

@Component
class EventConverter(val objectMapper: ObjectMapper) :Converter<String, Event>{

    override fun convert(source: String?): Event {
        return objectMapper.readValue(source, Event::class.java)
    }

}