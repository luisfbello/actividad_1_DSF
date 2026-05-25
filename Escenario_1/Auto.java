package actividad_1_DSF.Escenario_1;

public class Auto {
    private String motor;
    private Boolean sistemaNavegacion;
    private Integer CantidadRuedas;
    private String color;
    private Boolean sistemaSonido;

    public void setMotor(String motor) {
        this.motor = motor;
    }
    public void setSistemaNavegacion(Boolean sistemaNavegacion) {
        this.sistemaNavegacion = sistemaNavegacion;
    }
    public void setCantidadRuedas(Integer CantidadRuedas) {
        this.CantidadRuedas = CantidadRuedas;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSistemaSonido(Boolean sistemaSonido) {
        this.sistemaSonido = sistemaSonido;
    }
     
    public String getMotor() {
        return motor;
    }
    public Boolean getSistemaNavegacion() {
        return sistemaNavegacion;
    }
    public Integer getCantidadRuedas() {
        return CantidadRuedas;
    }
    public String getColor() {
        return color;
    }
    public Boolean getSistemaSonido() {
        return sistemaSonido;
    }

        @Override
    public String toString() {
        return "Auto{" + "motor=" + motor + ", sistemaNavegacion=" + sistemaNavegacion + ", CantidadRuedas=" + CantidadRuedas + ", color=" + color + ", sistemaSonido=" + sistemaSonido + '}';
    }

}