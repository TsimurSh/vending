package pl.tsimur.vending.model

import javax.persistence.*

@Table
@Entity
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int = 0,
    val password : String = "SECRET"
)
