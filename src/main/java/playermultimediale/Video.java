package playermultimediale;

public class Video extends Audio implements Riproducibile {
  private int luminosità = 0;

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    public int alzaLuminosità(int luminosità) {
        this.luminosità += luminosità;
        return this.luminosità;
    }

    public int abassaLuminosità(int luminosità) {
        this.luminosità -= luminosità;
        return this.luminosità;
    }

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo, durata, volume);
        this.luminosità = luminosità;
    }


    @Override
    public void play() {
        System.out.println("Il video: " + this.getTitolo() + " è in riproduzione");
        String[] volume = new String[this.getVolume()];
        for(int i = 0; i < this.getVolume(); i++) {
            volume[i] = "!";
        }
        String volumeLunghezza = String.join("", volume);

        String[] luminosità = new String[this.getLuminosità()];
        for(int i = 0; i < this.getLuminosità(); i++){
            luminosità[i] = "*";
        }
        String luminositàLunghezza = String.join("", luminosità);


        for(int i = 0; i < this.getDurata(); i++) {
            System.out.println(getTitolo() + volumeLunghezza + luminositàLunghezza);
        }
    }
}
