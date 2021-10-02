package capitolio

import item.Item
import tributos.Tributo

class Capitolio(var items: ArrayList<Item>)  {

    var tributos:  ArrayList<Tributo?>? = null

    fun addTributo(t: Tributo){
        this.tributos?.add(t)
    }

    fun addItems(i: Item){
        this.items.add(i)
    }

    //elimina por posicion
    fun delItems(i: Int){
        this.items.removeAt(i)
    }

    //elimina por item
    fun delItems(i: Item){
        this.items.remove(i)
    }
}