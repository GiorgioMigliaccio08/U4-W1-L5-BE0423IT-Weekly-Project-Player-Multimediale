package entities;
/* La luminosità rappresenta un'altra interfaccia perche esse è comune
a più classi come l'immagine ed il video */
public interface Luminosita {
    public int getLuminosita();
    public void setLuminosita(int luminosita);
    public void aumentaLuminosita();
    public void diminuisciLuminosita();


}
