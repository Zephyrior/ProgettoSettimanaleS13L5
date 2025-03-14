package playermultimediale;

public class Immagine extends Files implements Irriproducibile{

    private int luminosità = 0;

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    @Override
    public void show() {
        System.out.println("L'immagine: " + this.getTitolo() + " è in visualizzazione");
        String[] luminosità = new String[this.luminosità];
        for(int i = 0; i < this.luminosità; i++){
            luminosità[i] = "*";
        }
        String luminositàLunghezza = String.join("", luminosità);
        System.out.println(this.getTitolo() + luminositàLunghezza);
    }
}
