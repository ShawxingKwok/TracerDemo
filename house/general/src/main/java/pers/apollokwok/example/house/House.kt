package pers.apollokwok.example.house

import pers.apollokwok.example.bedroom.*

class House{
    val masterBedroom: Bedroom
    val secondaryBedroom: Bedroom
    val door: Door
    val livingRoom: LivingRoom

    init {
        // this part is quite long, changeable, and error-prone in a big project
        val wifiRouter = WifiRouter()
        door = Door()

        fun buildBedroom(): Bedroom {
            val pillows = Pillow() to Pillow()
            val window = Window(door, pillows)
            val quilt = Quilt()
            val bed = Bed(pillows, quilt, wifiRouter, window)
            return Bedroom(wifiRouter, window, bed)
        }
        masterBedroom = buildBedroom()
        secondaryBedroom = buildBedroom()
        livingRoom = LivingRoom(masterBedroom, secondaryBedroom, door, wifiRouter)

        // solves dependency injection(LivingRoom and WifiRouter need each other)
        wifiRouter.livingRoom = livingRoom
    }
}