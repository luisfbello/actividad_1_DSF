package actividad_1_DSF.Escenario_2;

public class Mensaje extends ModeloNotificacion {

    public Mensaje(ModeloPlataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje);
    }
    
}
