package pers.apollokwok.example.house

import pers.apollokwok.example.bedroom.Bedroom
import pers.apollokwok.tracer.common.annotations.Tracer

@Tracer.Root
class House : HouseTracer {
    val masterBedroom = Bedroom(_House)
    val secondaryBedroom = Bedroom(_House)
    val door = Door()
    val livingRoom = LivingRoom()

    override val _House: House get() = this
}




