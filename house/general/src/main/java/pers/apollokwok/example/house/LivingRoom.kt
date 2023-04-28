package pers.apollokwok.example.house

import pers.apollokwok.example.bedroom.Bedroom

class LivingRoom(
    private val masterBedroom: Bedroom,
    private val secondaryBedroom: Bedroom,
    private val door: Door,
    private val wifiRouter: WifiRouter,
)