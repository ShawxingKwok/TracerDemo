package pers.apollokwok.example.bedroom

import pers.apollokwok.example.house.`__WifiRouter_˚House_LivingRoom_wifiRouter`

context (BedroomTracer)
class Bed{
    // own elements
    val pillows = Pillow() to Pillow()
    val quilt = Quilt()

    // elements outside 'Bedroom'
    private val wifiRouter get() = `__WifiRouter_˚House_LivingRoom_wifiRouter`

    // elements inside `Bedroom`
    private val window get() = _Window_Bedroom_window

    // functions
    fun foo(){}
    fun bar(){}
}