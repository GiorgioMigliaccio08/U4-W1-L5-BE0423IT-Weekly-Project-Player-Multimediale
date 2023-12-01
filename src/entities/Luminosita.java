package entities;
/* La luminosità rappresenta un'altra interfaccia perche esse è comune
a più classi come l'immagine ed il video */
public interface Luminosita {
     int getLuminosita();
     void setLuminosita(int luminosita);
     void aumentaLuminosita();
     void diminuisciLuminosita();

}
