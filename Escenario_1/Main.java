package actividad_1_DSF.Escenario_1;

public class Main {
    public static void main(String[] args) {
        AutomovilBuilder automovilBuilderDeportivo = new AutomovilBuilder();
        Director director = new Director(automovilBuilderDeportivo);
        
        automovilBuilderDeportivo.construirMotor("V8")
                                .construirSistemaNavegacion(true)
                                .construirCantidadRuedas(4)
                                .construirColor("Rojo")
                                .construirSistemaSonido(true);
        
        Auto auto = director.construirAuto();
        System.out.println(auto);
    }
    
}
