package entities;

public class Immagine extends Titolo implements Luminosita {
    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        setTitolo(titolo);
        this.luminosità = luminosità;
    }

    @Override
    public int getLuminosita() {
        return luminosità;
    }

    @Override
    public void setLuminosita(int luminosità) {
        this.luminosità = luminosità;
    }

    @Override
    public void aumentaLuminosita() {
        this.luminosità++;
    }

    @Override
    public void diminuisciLuminosita() {
        this.luminosità--;
    }

    public void show() {
        String asterischi = new String(new char[luminosità]).replace("\0", "*");
        System.out.println(getTitolo() + " " + asterischi);
    }
}