public class PagoTarjeta implements Pago{

    @Override
    public void procesarPago(){
        System.out.println("Procesando pago con tarjeta");
    }
}
