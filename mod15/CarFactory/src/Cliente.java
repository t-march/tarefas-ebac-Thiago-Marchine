public class Cliente {

    private String categoria;
    private boolean isEmpresa;

    public Cliente(String categoria, boolean isEmpresa) {
        this.categoria = categoria;
        this.isEmpresa = isEmpresa;
    }

    public boolean isEmpresa() {
        return isEmpresa;
    }

    public String getCategoria() {
        return categoria;
    }
}
