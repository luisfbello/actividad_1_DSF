package actividad_1_DSF.Escenario_1;

public class AutomovilBuilder implements Builder {

    private Auto auto = new Auto();

    public AutomovilBuilder() {
        reiniciar();
    }

    @Override
    public Builder construirMotor(String tipo) {
        auto.setMotor(tipo);
        return this;
    }

    @Override
    public Builder  construirSistemaNavegacion(Boolean sistemaNavegacion) {
        auto.setSistemaNavegacion(sistemaNavegacion);
        return this;
    }

    @Override
    public Builder construirCantidadRuedas(Integer cantidad) {
        auto.setCantidadRuedas(cantidad);
        return this;
    }

    @Override
    public Builder construirColor(String tipo) {
        auto.setColor(tipo);
        return this;
    }

    @Override
    public Builder construirSistemaSonido(Boolean sistemaSonido) {
        auto.setSistemaSonido(sistemaSonido);
        return this;
    }

    @Override
    public void reiniciar() {
        auto = new Auto();
    }

    @Override
    public Auto getAuto() {
        return auto;
    }
}
