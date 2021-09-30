package capitolio

import item.Item
import tributos.Tributo

class Capitolio(var tributos:  ArrayList<Tributo?>, var items: ArrayList<Item>)  {

    fun addTributo(t: Tributo){
        this.tributos.add(t)
    }

    fun addItems(i: Item){
        this.items.add(i)
    }
}