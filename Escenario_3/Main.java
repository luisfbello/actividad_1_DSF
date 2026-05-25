package actividad_1_DSF.Escenario_3;

public class Main {
    public static void main(String[] args) {
        MediadorChat salaChat = new SalaChat();

        Usuario usuario1 = new Usuario("Alice", salaChat);
        Usuario usuario2 = new Usuario("Bob", salaChat);
        Usuario usuario3 = new Usuario("Charlie", salaChat);

        salaChat.agregarUsuario(usuario1);
        salaChat.agregarUsuario(usuario2);
        salaChat.agregarUsuario(usuario3);

        usuario1.enviarMensaje("Hola a todos!");
        usuario2.enviarMensaje("¡Hola Alice!");
        usuario3.enviarMensaje("¡Hola Alice y Bob!");
    }
}
