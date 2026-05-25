package actividad_1_DSF.Escenario_1;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Auto construirAuto() {
        return builder.getAuto();
    }
}
