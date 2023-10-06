package entities;

public class Video extends ElementoMultimediale implements Play, Brightness{
    private int durata; // deve essere maggiore di 0
    private int volume; // deve essere maggiore di 0
    private int brightness; // deve essere maggiore di 0

    public Video(String titolo, int durata, int volume, int brightness) {
        super(titolo);
        if ((durata >= 0 && volume >= 0 && brightness >= 0)  && (volume <= 10 && brightness <= 10)) {
            this.durata = durata;
            this.volume = volume;
            this.brightness = brightness;
        } else {
            System.out.println("\nUno dei valori che hai inserito è non rispetta gli standard! Riprova");
            this.durata = -1;
        }
    }

    public void play(){
        for (int i = 0; i < this.durata; i++) {
            System.out.print((i + 1) + ") Nome del video: " + this.titolo + ", volume: ");
            for (int j = 0; j < this.volume; j++) {
                System.out.print('!');
            }
            System.out.print(" - luminosità: ");
            for (int j = 0; j < this.brightness; j++) {
                System.out.print('*');
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
    public void increaseBrightness(int x){
        if(x >= 10 || x + this.brightness >= 10) {
            this.brightness = 10;
        } else {
            this.brightness += x;
        }
    };
    public void decreaseBrightness(int x){
        if (this.brightness <= x){
            if (x >= 10 || this.brightness - x <= 0) {
                this.brightness = 0;
            }
        } else {
            this.brightness -= x;
        }
    };

    public int getDurata() {
        return durata;
    }
    public int getVolume() {
        return volume;
    }
    public int getBrightness() {
        return brightness;
    }
}
