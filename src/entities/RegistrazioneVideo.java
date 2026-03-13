package entities;

import interfaces.Play;

public class RegistrazioneVideo extends Multimediale implements Play {
    private int luminosita;

    public RegistrazioneVideo(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void Play() {

    }

    @Override
    public int abbassaVolume() {
        return 0;
    }

    @Override
    public int alzaVolume() {
        return 0;
    }
}
