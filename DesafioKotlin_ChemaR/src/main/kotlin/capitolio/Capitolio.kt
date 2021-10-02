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
}