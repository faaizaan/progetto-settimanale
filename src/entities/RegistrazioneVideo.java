package entities;

import interfaces.Luminosita;
import interfaces.Play;

public class RegistrazioneVideo extends Multimediale implements Play, Luminosita {
    private int durata;
    private int volume;
    private int luminosita;

    public RegistrazioneVideo(String titolo,  int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }


    public int getDurata(){
        return durata;
    }

    public int getVolume(){
        return volume;
    }
    public int setVolume(int volume){

        return this.volume = volume;
    }

    @Override
    public int getLuminosita(){
        return luminosita;
    }
    @Override
    public int setLuminosita(int luminosita){
        return this.luminosita = luminosita;
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
    public void Play() {
        int durata = getDurata();
        int volume = getVolume();
        int luminosita = getLuminosita();
        for (int i = 0; i<durata; i++){
            System.out.print(getTitolo());
            for (int j = 0; j<volume;j++){
                System.out.print("!");
            }
            for(int m = 0; m<luminosita; m++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    @Override
    public int abbassaVolume() {
        int volumeAttuale = getVolume();
        return setVolume(volumeAttuale - 1);
    }

    @Override
    public int alzaVolume() {
        int volumeAttuale = getVolume();
        return setVolume(volumeAttuale + 1);
    }


}
