package pers.apollokwok.example.bedroom

import pers.apollokwok.example.house.House
import pers.apollokwok.example.house.`__WifiRouter_˚House_LivingRoom_wifiRouter`
import pers.apollokwok.tracer.common.annotations.Tracer

@Tracer.Nodes(House::class)
class Bedroom(override val __House: House) : BedroomTracer {
    val window = Window()
    val bed = Bed()

    private val wifiRouter get() = `__WifiRouter_˚House_LivingRoom_wifiRouter`

    override val _Bedroom: Bedroom get() = this
}




