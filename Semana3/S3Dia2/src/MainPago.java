public class MainPago {
    public static void main(String [] args){

        Pago tarjeta = new PagoTarjeta();
        Pago PayPal = new PagoPayPal();

        tarjeta.procesarPago();
        PayPal.procesarPago();

    }
}
