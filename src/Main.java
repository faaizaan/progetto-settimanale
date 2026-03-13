import entities.Immagine;
import entities.Multimediale;
import entities.RegistrazioneAudio;
import entities.RegistrazioneVideo;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        RegistrazioneAudio audio1 = new RegistrazioneAudio("sono un audio", 3, 3);
//        audio1.Play();

        RegistrazioneVideo video1 = new RegistrazioneVideo("sono un video", 4, 5, 3);
//        video1.Play();

        Immagine img1 = new Immagine("sono in immagine", 5);
//        img1.show();

        Multimediale[] multimediali = {audio1, video1, img1};

        for (Multimediale multimediale : multimediali) {
            if (multimediale instanceof RegistrazioneAudio) {
                RegistrazioneAudio a = (RegistrazioneAudio) multimediale;
                a.Play();
            } else if (multimediale instanceof Immagine) {
                Immagine img = (Immagine) multimediale;
                img.show();
            } else if (multimediale instanceof RegistrazioneVideo) {
                RegistrazioneVideo v = (RegistrazioneVideo) multimediale;
                v.Play();
            }
        }

        Scanner scanner = new Scanner(System.in);
        Multimediale[] multimedia = new Multimediale[5];




        for (int i = 0; i < 5; i++) {
            System.out.println("che elemento vuoi creare? digita: ('1' per immagine,  '2' per registrazione audio,  '3' per registrazione video)");
            int elementoScelto = scanner.nextInt();

            switch (elementoScelto) {
                case 1:
                    System.out.println("hai scelto IMMAGINE: ora inserisci il titolo del immagine");
                    String titoloImmagine = scanner.next();
                    System.out.println("hai scelto IMMAGINE: ora inserisci la luminosità del immagine con un valore numerico");
                    int luminositaImmagine = scanner.nextInt();
                    Immagine img = new Immagine(titoloImmagine, luminositaImmagine);
                    multimedia[i] = img;
                    break;
                case 2:
                    System.out.println("hai scelto Registrazione Audio inserisci il suo titolo = ");
                    String titoloAudio = scanner.next();
                    System.out.println("inserisci la durata in numero intero");
                    int durataAudio = scanner.nextInt();
                    System.out.println("inserisci il volume in numero intero");
                    int volumeAudio = scanner.nextInt();
                    RegistrazioneAudio audio = new RegistrazioneAudio(titoloAudio, durataAudio, volumeAudio);
                    multimedia[i] = audio;
                    break;
                case 3:
                    System.out.println("hai scelto la Registrazione Video inserisci il titolo = ");
                    String titoloVideo = scanner.next();
                    System.out.println("inserisci la durata in numero intero ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("inserisci il volume in numero intero");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("ora inserisci la luminosità del video con un valore numerico");
                    int luminositaVideo = scanner.nextInt();
                    RegistrazioneVideo video = new RegistrazioneVideo(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
                    multimedia[i] = video;
                    break;
                default:
                    System.out.println("opzione scelta non valida o non esistente");
            }
        }

        System.out.println(multimedia[2]);

        boolean exit = true;
        while (exit) {
            System.out.println("quale elemento vuoi eseguire scegli da (1 a 5) digita 0 se vuoi finire");
            int scelta = scanner.nextInt();

            if (scelta == 0){
                exit = false;
            } else if (scelta == 1 || scelta ==2 || scelta ==3 || scelta ==4 || scelta ==5) {
                int sceltaAttuale = scelta - 1;
                if (multimedia[sceltaAttuale] instanceof RegistrazioneVideo) {
                    RegistrazioneVideo v = (RegistrazioneVideo) multimedia[sceltaAttuale];
                    v.Play();
                } else if (multimedia[sceltaAttuale] instanceof RegistrazioneAudio) {
                    RegistrazioneAudio a = (RegistrazioneAudio) multimedia[sceltaAttuale];
                    a.Play();
                } else if (multimedia[sceltaAttuale] instanceof Immagine) {
                    Immagine img = (Immagine) multimedia[sceltaAttuale];
                    img.show();
                }
            }else {
                System.out.println("il numero che hai digitato non e valido");
            }


//            switch (scelta) {
//
//
//
//                case 0:
//                    exit = false;
//                    break;
//                case 1:
//                    if (multimedia[0] instanceof RegistrazioneVideo) {
//                        RegistrazioneVideo v = (RegistrazioneVideo) multimedia[0];
//                        v.Play();
//                    } else if (multimedia[0] instanceof RegistrazioneAudio) {
//                        RegistrazioneAudio a = (RegistrazioneAudio) multimedia[0];
//                        a.Play();
//                    } else if (multimedia[0] instanceof Immagine) {
//                        Immagine img = (Immagine) multimedia[0];
//                        img.show();
//                    }
//                    break;
//                case 2:  if (multimedia[1] instanceof RegistrazioneVideo) {
//                    RegistrazioneVideo v = (RegistrazioneVideo) multimedia[1];
//                    v.Play();
//                } else if (multimedia[1] instanceof RegistrazioneAudio) {
//                    RegistrazioneAudio a = (RegistrazioneAudio) multimedia[1];
//                    a.Play();
//                } else if (multimedia[1] instanceof Immagine) {
//                    Immagine img = (Immagine) multimedia[1];
//                    img.show();
//                }
//                    break;
//                case 3:
//                    if (multimedia[2] instanceof RegistrazioneVideo) {
//                        RegistrazioneVideo v = (RegistrazioneVideo) multimedia[2];
//                        v.Play();
//                    } else if (multimedia[2] instanceof RegistrazioneAudio) {
//                        RegistrazioneAudio a = (RegistrazioneAudio) multimedia[2];
//                        a.Play();
//                    } else if (multimedia[2] instanceof Immagine) {
//                        Immagine img = (Immagine) multimedia[2];
//                        img.show();
//                    }
//                    break;
//                case 4 :
//                    if (multimedia[3] instanceof RegistrazioneVideo) {
//                        RegistrazioneVideo v = (RegistrazioneVideo) multimedia[3];
//                        v.Play();
//                    } else if (multimedia[3] instanceof RegistrazioneAudio) {
//                        RegistrazioneAudio a = (RegistrazioneAudio) multimedia[3];
//                        a.Play();
//                    } else if (multimedia[3] instanceof Immagine) {
//                        Immagine img = (Immagine) multimedia[3];
//                        img.show();
//                    }
//                    break;
//                case 5 :
//                    if (multimedia[4] instanceof RegistrazioneVideo) {
//                        RegistrazioneVideo v = (RegistrazioneVideo) multimedia[4];
//                        v.Play();
//                    } else if (multimedia[4] instanceof RegistrazioneAudio) {
//                        RegistrazioneAudio a = (RegistrazioneAudio) multimedia[4];
//                        a.Play();
//                    } else if (multimedia[4] instanceof Immagine) {
//                        Immagine img = (Immagine) multimedia[4];
//                        img.show();
//                    }
//                    break;
//                default:
//                    System.out.println("il numero digitato non e valido");
//            }

        }


    }


    }

