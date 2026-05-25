package actividad_1_DSF.Escenario_2;

public class Confirmacion extends ModeloNotificacion {

    public Confirmacion(ModeloPlataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando confirmación: " + mensaje);
    }
    
}
