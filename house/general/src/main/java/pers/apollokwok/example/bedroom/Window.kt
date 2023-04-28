package pers.apollokwok.example.bedroom

import pers.apollokwok.example.house.Door

class Window(
    private val door: Door,
    private val pillows: Pair<Pillow, Pillow>,
)