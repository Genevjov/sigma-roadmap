package io.genevjov.palyer.service.repository

import io.genevjov.palyer.service.domain.Player
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PlayerRepository : CrudRepository<Player, UUID> {
}