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
public class EstrategiaPorcentajeDescuento implements EstrategiaPreciosVenta {

    Float porcentaje = 0.10f;

    public Float obtenerTotal(Venta unaVenta) {
        Float pdt;
        pdt = unaVenta.obtenerTotalAntesDesc();
        return pdt - (pdt * porcentaje);
    }

}
