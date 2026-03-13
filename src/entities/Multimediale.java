package entities;

public abstract class Multimediale {

    private String titolo;

    public Multimediale(String titolo){
        this.titolo = titolo;
    }


    public String getTitolo(){
        return titolo;
    }
}
