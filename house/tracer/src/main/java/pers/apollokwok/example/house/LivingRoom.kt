package pers.apollokwok.example.house

context (HouseTracer)
class LivingRoom{
    val wifiRouter = WifiRouter()

    private val masterBedroom get() = _Bedroom_House_masterBedroom
    private val secondaryBedroom get() = _Bedroom_House_secondaryBedroom
    private val door get() = _Door_House_door
}