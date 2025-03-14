package playermultimediale;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                    /*------------Prove--------------*/
//        System.out.println("Inserisci il titolo dell'audio e premi invio.");
//        String titoloAudio = scanner.nextLine();
//        System.out.println("Inserisci la durata dell'audio e premi invio.");
//        int durataAudio = scanner.nextInt();
//        System.out.println("Imposta il volume dell'audio e premi invio.");
//        int volumeAudio = scanner.nextInt();
//        Audio audio = new Audio(titoloAudio, durataAudio, volumeAudio);
//        audio.play();
//
//        System.out.println("Inserisci il titolo del video e premi invio.");
//        String titoloVideo = scanner.nextLine();
//        System.out.println("Inserisci la durata del video e premi invio.");
//        int durataVideo = scanner.nextInt();
//        System.out.println("Imposta il volume del video e premi invio.");
//        int volumeVideo = scanner.nextInt();
//        System.out.println("Imposta la luminosità del video e premi invio.");
//        int luminositaVideo = scanner.nextInt();
//        Video video = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
//        video.play();
//
//        System.out.println("Inserisci il titolo dell'immagine e premi invio.");
//        String titoloImmagine = scanner.nextLine();
//        System.out.println("Imposta la luminosità dell'immagine e premi invio.");
//        int luminositaImmagine = scanner.nextInt();
//        Immagine immagine = new Immagine(titoloImmagine, luminositaImmagine);
//        immagine.show();
                    /*------------Fine prove--------------*/
        System.out.println("Carica 5 file di tipo audio, video o immagine:");

        Files[] files = new Files[5];

        for (int i = 0; i < files.length; i++) {

            System.out.println("Specifica il tipo di file da caricare: audio, video o immagine.");
            String tipoFile = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (tipoFile.equals("audio")) {
                System.out.println("Inserisci il titolo dell'audio e premi invio.");
                String titoloAudio = scanner.nextLine();
                System.out.println("Inserisci la durata dell'audio e premi invio.");
                int durataAudio = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Imposta il volume dell'audio e premi invio.");
                int volumeAudio = scanner.nextInt();
                scanner.nextLine();
                files[i] = new Audio(titoloAudio, durataAudio, volumeAudio);

            } else if (tipoFile.equals("video")) {
                System.out.println("Inserisci il titolo del video e premi invio.");
                String titoloVideo = scanner.nextLine();
                System.out.println("Inserisci la durata del video e premi invio.");
                int durataVideo = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Imposta il volume del video e premi invio.");
                int volumeVideo = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Imposta la luminosità del video e premi invio.");
                int luminositaVideo = scanner.nextInt();
                scanner.nextLine();
                files[i] = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
            } else if (tipoFile.equals("immagine")) {
                System.out.println("Inserisci il titolo dell'immagine e premi invio.");
                String titoloImmagine = scanner.nextLine();
                System.out.println("Imposta la luminosità dell'immagine e premi invio.");
                int luminositaImmagine = scanner.nextInt();
                scanner.nextLine();
                files[i] = new Immagine(titoloImmagine, luminositaImmagine);
            } else {
                System.out.println("Tipo di file non valido. Riprova.");
                i--;
            }
        }
        System.out.println("Digita un numero da 1 a 5 per riprodure il file selezionato, 0 per terminare.");

        int numeroFile;
        do {
            numeroFile = scanner.nextInt();
            if (numeroFile >= 1 && numeroFile <= 5) {
                if (files[numeroFile - 1] instanceof Audio) {
                    ((Audio) files[numeroFile - 1]).play();
                } else if (files[numeroFile - 1] instanceof Video) {
                    ((Video) files[numeroFile - 1]).play();
                } else if (files[numeroFile - 1] instanceof Immagine) {
                    ((Immagine) files[numeroFile - 1]).show();
                }
            } else if(numeroFile < 0 || numeroFile > 5) {
                System.out.println("Numero non valido. Riprova.");
            };
        } while (numeroFile != 0);
        System.out.println("Riproduzione terminata");
    }
}
