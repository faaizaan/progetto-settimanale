package entities;

import interfaces.Play;

public class RegistrazioneAudio extends Multimediale implements Play {

    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata=durata;
        this.volume=volume;
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
    public int abbassaVolume() {
        int volumeAttuale = getVolume();
        return setVolume(volumeAttuale - 1);
    }

    @Override
    public int alzaVolume() {
        int volumeAttuale = getVolume();
        return setVolume(volumeAttuale + 1);
    }

    @Override
    public void Play() {
        int durata = this.getDurata();
        int volume = this.getVolume();
        for (int i = 0; i < durata; i++){
            System.out.print(getTitolo());
            for (int j = 0; j < volume; j++){
                System.out.print("!");
            }
            System.out.println();

        }
    }


}
