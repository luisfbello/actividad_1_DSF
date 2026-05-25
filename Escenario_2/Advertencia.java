package actividad_1_DSF.Escenario_2;

public class Advertencia extends ModeloNotificacion {

    public Advertencia(ModeloPlataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando advertencia: " + mensaje);
    }
    
}
