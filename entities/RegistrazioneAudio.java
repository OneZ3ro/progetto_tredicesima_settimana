package entities;

public class RegistrazioneAudio extends ElementoMultimediale implements Play{
    private int durata; // deve essere maggiore di 0
    private int volume; // deve essere maggiore di 0

    public RegistrazioneAudio(String titolo) {
        super(titolo);
    }

    public void play(){};
    public void alzaVolume(){};
    public void abbassaVolume(){};
}
