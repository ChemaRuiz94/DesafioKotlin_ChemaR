package capitolio

import item.FactoriaItem

object FactoriaCapitolio {

    fun factoriaCapitolio(): Capitolio {

        return Capitolio(FactoriaItem.generarItems()
        )
    }
}