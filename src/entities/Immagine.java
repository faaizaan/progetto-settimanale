package entities;

import interfaces.Luminosita;

public class Immagine extends Multimediale implements Luminosita {
    private int luminosita;
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita=luminosita;
    }

    @Override
    public int aumentaLuminosita(){
        int luminositaAttuale = getLuminosita();
        return setLuminosita(luminositaAttuale + 1);
    }
    @Override
    public int abbassaLuminosita(){
        int luminositaAttuale = getLuminosita();
        return setLuminosita(luminositaAttuale - 1);
    }

    @Override
    public int getLuminosita() {
        return luminosita;
    }

    @Override
    public int setLuminosita(int luminosita) {
        return this.luminosita = luminosita;
    }

    public void show(){
            System.out.print(getTitolo());
        for (int i = 0; i<luminosita; i++){
           System.out.print("*");

        }
        System.out.println();
    };
}
