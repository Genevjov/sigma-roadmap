package io.genevjov.palyer.service.domain

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "contact_data", schema = "player_service")
data class Contacts(

        @Id
        @Column(name = "id")
        var contactsId: UUID,
        @Column(name = "email")
        var email: String,
        @Column(name = "mobile_phone_number")
        var mobilePhoneNumber: String,
        @Column(name = "address")
        var address: String
)