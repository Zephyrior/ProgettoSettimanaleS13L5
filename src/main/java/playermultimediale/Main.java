package playermultimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo dell'audio e premi invio.");
        String titoloAudio = scanner.nextLine();
        System.out.println("Inserisci la durata dell'audio e premi invio.");
        int durataAudio = scanner.nextInt();
        System.out.println("Imposta il volume dell'audio e premi invio.");
        int volumeAudio = scanner.nextInt();
        Audio audio = new Audio(titoloAudio, durataAudio, volumeAudio);
        audio.play();

        System.out.println("Inserisci il titolo del video e premi invio.");
        String titoloVideo = scanner.nextLine();
        System.out.println("Inserisci la durata del video e premi invio.");
        int durataVideo = scanner.nextInt();
        System.out.println("Imposta il volume del video e premi invio.");
        int volumeVideo = scanner.nextInt();
        System.out.println("Imposta la luminosità del video e premi invio.");
        int luminositaVideo = scanner.nextInt();
        Video video = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
        video.play();

        System.out.println("Inserisci il titolo dell'immagine e premi invio.");
        String titoloImmagine = scanner.nextLine();
        System.out.println("Imposta la luminosità dell'immagine e premi invio.");
        int luminositaImmagine = scanner.nextInt();
        Immagine immagine = new Immagine(titoloImmagine, luminositaImmagine);
        immagine.show();
    }
}
