package io.genevjov.palyer.service.service

import io.genevjov.palyer.service.domain.Player
import io.genevjov.palyer.service.repository.PlayerRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
open class PlayerService(private val playerRepository: PlayerRepository) {

    fun getById(id: UUID): Player? {
        val playerOptional = playerRepository.findById(id)
        if (playerOptional.isPresent) {
            return playerOptional.get();
        }
        return null;
    }

    fun addPlayer(player: Player) {
        playerRepository.save(player)
    }
}
