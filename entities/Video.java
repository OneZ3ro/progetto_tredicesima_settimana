package entities;

public class Video extends ElementoMultimediale implements Play{
    private int durata; // deve essere maggiore di 0
    private int volume; // deve essere maggiore di 0

    public Video(String titolo) {
        super(titolo);
    }

    public void play(){
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.titolo);
            for (int j = 0; j < this.volume; j++) {
                System.out.println('!');
            }
        }
    };
    public void alzaVolume(){};
    public void abbassaVolume(){};
}
