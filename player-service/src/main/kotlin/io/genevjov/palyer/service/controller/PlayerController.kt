package io.genevjov.palyer.service.controller

import io.genevjov.palyer.service.domain.Player
import io.genevjov.palyer.service.service.PlayerService
import org.springframework.core.convert.ConversionService
import org.springframework.http.HttpStatus.*
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import player.service.Request.CreatePlayerRequest
import java.util.*


@RestController
@RequestMapping("api")
class PlayerController(
        private val conversionService: ConversionService,
        private var playerService: PlayerService) {

    @GetMapping("/player/{playerId}")
    fun getPlayer(@PathVariable("playerId") playerId: UUID): ResponseEntity<Player>? {
        val player = playerService.getById(playerId)
        if (player != null) {

            return ResponseEntity.ok(player)
        }
        return ResponseEntity(NOT_FOUND)
    }

    @PutMapping("/player")
    fun createPlayer(createPlayerRequest: CreatePlayerRequest): ResponseEntity<Player> {
        val player = conversionService.convert(createPlayerRequest, Player::class.java)
        if (player != null) {
            playerService.addPlayer(player)
            return ResponseEntity(player, CREATED)
        }
        return ResponseEntity(BAD_REQUEST)
    }
}