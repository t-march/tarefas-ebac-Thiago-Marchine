public class Musica {

    private String nomeBanda;
    private String nomeMusica;
    private double duracao;

    private String getNomeBanda() {
        return nomeBanda;
    }

    private void setNomeBanda(String nomeBanda) {
        this.nomeBanda = nomeBanda;
    }

    private String getNomeMusica() {
        return nomeMusica;
    }

    private void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    private double getDuracao() {
        return duracao;
    }

    private void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void cadastrarMusica(String nomeBanda,String nomeMusica, double duracao){
        setNomeBanda(nomeBanda);
        setNomeMusica(nomeMusica);
        setDuracao(duracao);
    }

    public void imprimirMusica(){
        System.out.println("Banda: " + getNomeBanda() + ", Musica: " +
                getNomeMusica() + ", Duração: " + getDuracao());
    }
}
