package entities;

public class Video extends Audio implements ElementoMultimediale, Luminosita {
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo, durata, volume);
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

    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            String puntiEsclamativi = new String(new char[getVolume()]).replace("\0", "!");
            String asterischi = new String(new char[luminosità]).replace("\0", "*");
            System.out.println(getTitolo() + " " + puntiEsclamativi + " " + asterischi);
        }
    }
}
