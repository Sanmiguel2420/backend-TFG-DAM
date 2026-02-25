package TFGDAM.backend.Modelo;

public enum TipoLibro {

    BOLSILLO,
    TAPA_DURA,
    TAPA_BLANDA;

    @Override
    public String toString()
    {
        return name();
    }
}
