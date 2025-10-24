/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Maximiliano
 */
public class TarjetaCredito implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta procesado: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9; // 10% de descuento
    }
}
