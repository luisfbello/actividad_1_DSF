package actividad_1_DSF.Escenario_3;

import java.util.ArrayList;
import java.util.List;

public class SalaChat implements MediadorChat {
    private List<Usuario> usuarios;

    public SalaChat() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u != usuario) {
                u.recibirMensaje(mensaje);
            }
        }
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
}
