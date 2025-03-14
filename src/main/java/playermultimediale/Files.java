package playermultimediale;

public abstract class Files {
    protected String titolo;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Files(String titolo) {
        this.titolo = titolo;
    }

}
