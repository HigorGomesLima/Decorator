package decorator;

public class Voar extends Habilidade{
    
    public void adicionarHabilidade(Classe personagem){
        personagem.habilidade.add("Voar");
    }
}
