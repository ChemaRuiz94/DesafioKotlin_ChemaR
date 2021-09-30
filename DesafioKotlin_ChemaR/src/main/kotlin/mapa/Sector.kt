package mapa

import item.Item
import tributos.Tributo

class Sector {
    var tributos: ArrayList<Tributo>? = null
    var item: Item? = null

    constructor()

    constructor(tributos: ArrayList<Tributo>?){
        this.tributos = tributos
    }

    constructor(item: Item){
        this.item = item
    }

    constructor(tributos: ArrayList<Tributo>, item: Item){
        this.tributos = tributos
        this.item = item
    }

    fun addTributo(tributo: Tributo){
        this.tributos?.add(tributo)
    }

    fun addItem(item: Item){
        this.item = item
    }
}