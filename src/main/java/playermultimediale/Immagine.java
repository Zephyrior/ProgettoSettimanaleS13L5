package playermultimediale;

public class Immagine implements Irriproducibile{
    private String titolo;
    private int luminosità = 0;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    public Immagine(String titolo, int luminosità) {
        this.titolo = titolo;
        this.luminosità = luminosità;
    }
    @Override
    public void show() {
        System.out.println("L'immagine: " + this.titolo + " è in visualizzazione");
        String[] luminosità = new String[this.luminosità];
        for(int i = 0; i < this.luminosità; i++){
            luminosità[i] = "*";
        }
        String luminositàLunghezza = String.join("", luminosità);
        System.out.println(this.titolo + luminositàLunghezza);
    }
}
