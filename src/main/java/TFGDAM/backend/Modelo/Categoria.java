package TFGDAM.backend.Modelo;

public enum Categoria {

    TERROR,
    FANTASIA,
    MISTERIO,
    POLICIACA,
    JUVENIL;

    @Override
    public String toString() {
        return this.name();
    }

}
