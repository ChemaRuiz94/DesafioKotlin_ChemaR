package mapa

import item.Item
import tributos.Tributo

class Sector {
    private var ocupado = false //lo usamos para la incializacion
    private var ocupadoItem = false //en la inicializacion
    private var tributos: Tributo? = null
    private var item: Item? = null

    fun addTributo(tributo: Tributo) {
        tributos = tributo
        ocupado = true
    }

    fun addItem(i: Item) {
        item = i
        ocupadoItem = true
    }

    fun getItem(): Item? {
        if (item == null) {
            return null
        }
        return item
    }

    fun getTributos(): Tributo? {
        return tributos
    }

    fun getOcupado(): Boolean {
        return ocupado
    }

    fun getOcupadoItems(): Boolean {
        return ocupadoItem
    }

    fun delTributo() {
        this.tributos = null
        this.ocupado = false
    }

    fun delItem() {
        this.item = null
        this.ocupadoItem = false
    }

    fun accederSector(tributo: Tributo): Boolean {
        var acces: Boolean

        if (ocupadoItem) {
            println("HAY ITEM ${tributo.getFila()} ${tributo.getColumna()}")
            tributo.actuarItems(item!!)
            delItem()
            acces = comprobarTributoVivo(tributo)

        } else {
            if (ocupado) {

                tributo.pelear(tributos!!)

                acces = comprobarTributoVivo(tributo)
                println("HAY TRIBUTOS Y PELEAN ${tributo.getFila()} ${tributo.getColumna()}")
            } else {
                println("NO HAY NADA ")
                acces = true
                addTributo(tributo)
            }
        }
        return acces
    }

    fun comprobarTributoVivo(tributo: Tributo): Boolean {
        return if (tributo.vida > 0) {
            delTributo()
            addTributo(tributo)
            true
        } else {
            false
        }
    }

    override fun toString(): String {
        return ("Item: $this.item ")
    }
}