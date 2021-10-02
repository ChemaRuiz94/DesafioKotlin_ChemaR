package capitolio

import item.FactoriaItem

object FactoriaCapitolio {

    fun factoriaCapitolio(): Capitolio {

        val items = FactoriaItem.generarItems()

        return Capitolio(items)
    }
}