package decorator;

import java.util.List;

public abstract class Classe {
    protected int hp;
    protected int sp;
    protected int atk;
    protected int mag;
    
    private String nome;
    protected List<String> habilidade;
    
    public int getHp() {return hp;}
    public int getSp() {return sp;}
    public int getAtk() {return atk;}
    public int getMag() {return mag;}
    public String getNome() {return nome;}
    public List<String> getHabilidades() {return habilidade;};

}
