/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.patrones.proyecto.operaciones;

/**
 *
 * @author ELI ZACARIAS
 */
public class EstrategiaDescuentoSobreUmbral implements EstrategiaPreciosVenta {
    Float descuento = 0.1f;
    Float umbral = 100f;

    public Float obtenerTotal(Venta unaVenta) {
        Float pdt;
        pdt = unaVenta.obtenerTotalAntesDesc();
        if (pdt < umbral)
            return pdt;
        else
            return pdt - (pdt*descuento);
    }
}
