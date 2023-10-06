package entities;

public class Video extends ElementoMultimediale implements Play, Brightness{
    private int durata; // deve essere maggiore di 0
    private int volume; // deve essere maggiore di 0
    private int brightness; // deve essere maggiore di 0

    public Video(String titolo, int durata, int volume, int brightness) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.brightness = brightness;
    }

    public void play(){
        for (int i = 0; i < this.durata; i++) {
            System.out.print(this.titolo);
            for (int j = 0; j < this.volume; j++) {
                System.out.print(" ! ");
            }
            for (int j = 0; j < this.brightness; j++) {
                System.out.print('*');
            }
            System.out.println(' ');
        }
    };
    public void alzaVolume(){};
    public void abbassaVolume(){};
    public void increaseBrightness(){};
    public void decreaseBrightness(){};
}
