package actividad_1_DSF.Escenario_2;

public class Alerta extends ModeloNotificacion {

    public Alerta(ModeloPlataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando alerta: " + mensaje);
    }
    
}
