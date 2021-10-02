package capitolio

import item.FactoriaItem

object FactoriaCapitolio {

    private val maxItem = 100

    fun factoriaCapitoli(): Capitolio {

        var items = FactoriaItem.generarNumeroItems(maxItem)
        var capitolio: Capitolio = Capitolio(items)

        return capitolio
    }
}