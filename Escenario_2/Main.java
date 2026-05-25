package actividad_1_DSF.Escenario_2;

public class Main {
    public static void main(String[] args) {
        ModeladoEscritorio escritorio = new ModeladoEscritorio();
        ModeladoMovil movil = new ModeladoMovil();
        ModeladoWeb web = new ModeladoWeb();

        ModeloNotificacion mensaje = new Mensaje(escritorio);
        ModeloNotificacion alerta = new Alerta(escritorio);
        ModeloNotificacion advertencia = new Advertencia(escritorio);
        ModeloNotificacion confirmacion = new Confirmacion(escritorio);

        ModeloNotificacion mensajeMovil = new Mensaje(movil);
        ModeloNotificacion alertaMovil = new Alerta(movil);
        ModeloNotificacion advertenciaMovil = new Advertencia(movil);
        ModeloNotificacion confirmacionMovil = new Confirmacion(movil);

        ModeloNotificacion mensajeWeb = new Mensaje(web);
        ModeloNotificacion alertaWeb = new Alerta(web);
        ModeloNotificacion advertenciaWeb = new Advertencia(web);
        ModeloNotificacion confirmacionWeb = new Confirmacion(web);

        mensaje.enviar("Este es un mensaje de prueba escritorio.");
        alerta.enviar("Este es un alerta de prueba escritorio.");
        advertencia.enviar("Este es un advertencia de prueba escritorio.");
        confirmacion.enviar("Este es un confirmación de prueba escritorio.");

        mensajeMovil.enviar("Este es un mensaje de prueba móvil.");
        alertaMovil.enviar("Este es un alerta de prueba móvil.");
        advertenciaMovil.enviar("Este es un advertencia de prueba móvil.");
        confirmacionMovil.enviar("Este es un confirmación de prueba móvil.");

        mensajeWeb.enviar("Este es un mensaje de prueba web.");
        alertaWeb.enviar("Este es un alerta de prueba web.");
        advertenciaWeb.enviar("Este es un advertencia de prueba web.");
        confirmacionWeb.enviar("Este es un confirmación de prueba web.");
        
    }
}
