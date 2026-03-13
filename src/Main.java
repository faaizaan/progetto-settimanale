import entities.Immagine;
import entities.Multimediale;
import entities.RegistrazioneAudio;
import entities.RegistrazioneVideo;

public class Main {
    static void main(String[] args) {

        RegistrazioneAudio audio1 = new RegistrazioneAudio("malibu" , 3, 5);
        audio1.Play();

        RegistrazioneVideo video1 = new RegistrazioneVideo("bavaro", 4,7,3);
        video1.Play();

        Immagine img1 = new Immagine("romeo" , 12);
        img1.show();

      



    }
}
