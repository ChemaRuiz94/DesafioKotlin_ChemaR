package capitolio

import item.Item
import tributos.Tributo

class Capitolio(var items: ArrayList<Item>)  {

    private var muertos:  ArrayList<Tributo> = ArrayList<Tributo>()

    fun addMuerto(t: Tributo){
        this.muertos.add(t)
    }



    //elimina por item
    fun delItems(i: Item){
        this.items.remove(i)
    }
}