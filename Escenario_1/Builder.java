package actividad_1_DSF.Escenario_1;

public interface Builder {
    public Builder construirMotor(String tipo);
    public Builder construirSistemaNavegacion(Boolean sistemaNavegacion);
    public Builder construirCantidadRuedas(Integer cantidad);
    public Builder construirColor(String tipo);
    public Builder construirSistemaSonido(Boolean sistemaSonido);
    public void reiniciar();
    public Auto getAuto();
}
