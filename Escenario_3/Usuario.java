package actividad_1_DSF.Escenario_3;

public class Usuario {
    private String nombre;
    private MediadorChat mediador;

    public Usuario(String nombre, MediadorChat mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public String getNombre() {
        return nombre;
    }

    public void enviarMensaje(String mensaje) {
        mediador.enviarMensaje(mensaje, this);
    }
    
    public void recibirMensaje(String mensaje) {
        System.out.println(nombre + " recibió: " + mensaje);
    }
}
