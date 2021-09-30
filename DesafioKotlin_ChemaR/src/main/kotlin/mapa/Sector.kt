package mapa

import item.Item
import tributos.Tributo

class Sector {
    var tributos: ArrayList<Tributo>? = null
    var item: Item? = null

    constructor()

    constructor(tributo: Tributo){
        this.tributos?.add(tributo)
    }

    constructor(item: Item){
        this.item = item
    }

    constructor(tributo: Tributo, item: Item){
        this.tributos?.add(tributo)
        this.item = item
    }

    fun addTributo(tributo: Tributo){
        this.tributos?.add(tributo)
    }

    fun addItem(item: Item){
        this.item = item
    }
}