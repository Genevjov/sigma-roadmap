package io.genevjov.palyer.service.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "players", schema = "player_service")
data class Player(

        @Id
        @Column(name = "id")
        var id: UUID,
        @Column(name = "first_name")
        var firstName: String,
        @Column(name = "second_name")
        var secondName: String,
        @Column(name = "middle_name")
        var middleName: String,
        @Column(name = "username")
        var login: String,
        @OneToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "contacts_data_ref", nullable = false)
        var contacts: Contacts) {
}