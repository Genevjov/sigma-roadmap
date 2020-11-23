package io.genevjov.palyer.service.converter

import io.genevjov.palyer.service.domain.Contacts
import io.genevjov.palyer.service.domain.Player
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component
import player.service.Request.CreatePlayerRequest
import player.service.Request.CreatePlayerRequest.CreateContacts
import java.util.*

@Component
class CreatePlayerRequest2PlayerConverter : Converter<CreatePlayerRequest, Player> {

    override fun convert(source: CreatePlayerRequest): Player? {
        val contacts = convertContacts(source.contacts)
        return Player(UUID.randomUUID(), source.firstName, source.secondName,
                source.middleName, source.login, contacts)
    }

    private fun convertContacts(source: CreateContacts): Contacts {

        val addressLine = source.index.plus(", ")
                .plus(source.country).plus(", ")
                .plus(source.city).plus(", ")
                .plus(source.street).plus(", ")
                .plus(source.roomNumber)

        return Contacts(UUID.randomUUID(), source.email, source.mobilePhoneNumber, addressLine)
    }
}