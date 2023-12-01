package entities;
/* Creo l'interfaccia per l'Elemento multimediale perchè sarà quello
* ad avere elementi comuni per le classi che verranno create in seguito. */
public interface ElementoMultimediale {
    public int getDurata();

    void setDurata(int durata);

    public void play();
}
