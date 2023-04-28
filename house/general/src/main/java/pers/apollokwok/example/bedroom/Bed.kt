package pers.apollokwok.example.bedroom

import pers.apollokwok.example.house.WifiRouter

class Bed(
    private val pillows: Pair<Pillow, Pillow>,
    private val quilt: Quilt,
    private val wifiRouter: WifiRouter,
    private val window: Window,
)