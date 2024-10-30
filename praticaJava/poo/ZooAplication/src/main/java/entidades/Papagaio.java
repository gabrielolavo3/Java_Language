package entidades;

public class Papagaio extends Animal
{
    public Papagaio(String nome, String tipo, String habitat) {
        super(nome, tipo, habitat);
    }

    @Override
    public String emitirSom()
    {
        return String.format("Crrác crrác");
    }
    
    @Override
    public String exibirDados()
    {        
        return String.format("\nNome: %s\nTipo: %s\nHabitat: %s", nome, tipo, habitat);
    }    

}
