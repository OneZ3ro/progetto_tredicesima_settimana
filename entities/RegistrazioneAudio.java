package entities;

public class RegistrazioneAudio extends ElementoMultimediale implements Play{
    private int durata; // deve essere maggiore di 0
    private int volume; // deve essere maggiore di 0

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        if (durata > 0 && volume > 0) {
            this.durata = durata;
            this.volume = volume;
        } else {
            System.out.println("Uno dei valori che hai inserito è minore di 0! Riprova");
        }
    }

    public void play(){
        for (int i = 0; i < this.durata; i++) {
            System.out.print(this.titolo);
            for (int j = 0; j < this.volume; j++) {
                System.out.print('!');
            }
            System.out.println(' ');
        }
    };
    public void alzaVolume(int x){
        if(x >= 10 || x + this.volume >= 10) {
            this.volume = 10;
        } else {
            this.volume += x;
        }
    };
    public void abbassaVolume(int x){
        if (this.volume <= x){
            if (x >= 10 || this.volume - x <= 0) {
                this.volume = 0;
            }
        } else {
            this.volume -= x;
        }
    };

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }
}
