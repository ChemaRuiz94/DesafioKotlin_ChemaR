package capitolio

import item.Item
import tributos.Tributo

class Capitolio(var items: ArrayList<Item>)  {

    private var muertos:  ArrayList<Tributo> = ArrayList()

    fun getSizeMuertos(): Int{
        return muertos.size
    }

    fun getMuertos(): ArrayList<Tributo>{
        return muertos
    }

    fun addMuerto(t: Tributo){
        this.muertos.add(t)
    }

    //elimina por item
    fun delItems(i: Item){
        this.items.remove(i)
    }

    fun enviarItems():Item{
        val it : Item = items[0]
        items.removeAt(0)
        return it
    }
}