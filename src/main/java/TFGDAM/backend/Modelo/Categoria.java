package TFGDAM.backend.Modelo;

public enum Categoria {

    TERROR,
    FANTASIA,
    MISTERIO,
    POLICIACO,
    JUVENIL;

    @Override
    public String toString() {
        return this.name();
    }

}
