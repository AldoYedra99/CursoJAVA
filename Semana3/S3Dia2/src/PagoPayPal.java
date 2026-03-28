public class PagoPayPal implements Pago{

    @Override
    public void procesarPago(){
        System.out.println("Procesando pago con PayPal");
    }
}
