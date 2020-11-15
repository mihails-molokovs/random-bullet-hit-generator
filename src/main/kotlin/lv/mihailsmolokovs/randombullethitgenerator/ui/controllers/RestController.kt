package lv.mihailsmolokovs.randombullethitgenerator.ui.controllers

import lv.mihailsmolokovs.randombullethitgenerator.shared.Coordinates
import lv.mihailsmolokovs.randombullethitgenerator.shared.generateIntervalInSeconds
import lv.mihailsmolokovs.randombullethitgenerator.shared.generateRandomCoordinates
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class RestController {

    @GetMapping(value = ["/hits"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun generateBulletHits(): Flux<Coordinates> =
            Flux.interval(generateIntervalInSeconds()).map { generateRandomCoordinates() }
}