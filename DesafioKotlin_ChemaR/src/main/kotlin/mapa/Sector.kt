package mapa

import item.Item
import tributos.Tributo

class Sector {
    private var ocupado = false
    private var tributos = ArrayList<Tributo>()
    private var item: Item? = null

    fun addTributo(tributo: Tributo){
        tributos.add(tributo)
        ocupado = true
    }

    fun addItem(i: Item){
        item = i
        ocupado = true
    }

    fun getItem(): Item?{
        if (item == null) {
            return null
        }
        return item
    }

    fun getTributos(): ArrayList<Tributo>{
        return tributos
    }

    fun getOcupado(): Boolean{
        return ocupado
    }

    override fun toString(): String {
        return ("Item: $this.item " )
    }
}