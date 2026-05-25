package actividad_1_DSF.Escenario_2;

public abstract class ModeloNotificacion {

    protected ModeloPlataforma plataforma;

    public ModeloNotificacion(ModeloPlataforma plataforma) {
        this.plataforma = plataforma;
    }
    public abstract void enviar(String mensaje);
}
