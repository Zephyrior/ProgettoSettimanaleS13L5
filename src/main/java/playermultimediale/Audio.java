package playermultimediale;

public class Audio extends Files implements Riproducibile {

    private int durata;
    private int volume = 0;

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }


    public int alzaVolume(int volume) {
        this.volume += volume;
        return this.volume;
    }
    public int abassaVolume(int volume) {
        this.volume -= volume;
        return this.volume;
    }

    @Override
    public void play() {
        System.out.println("L'audio: " + this.getTitolo() + " è in riproduzione");
        String[] volume = new String[this.volume];
//        String volumeLunghezza;
        for(int i = 0; i < this.volume; i++) {
//            volumeLunghezza = volumeLunghezza + "!";
            volume[i] = "!";
        }
        String volumeLunghezza = String.join("", volume);

        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.getTitolo() + volumeLunghezza);
        }
    }
}
