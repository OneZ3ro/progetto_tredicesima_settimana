package entities;

public class Image extends ElementoMultimediale implements Brightness{
    private int brightness; // deve essere maggiore di 0
    public Image(String titolo, int brightness) {
        super(titolo);
        this.brightness = brightness;
    }
    public void show(){
        System.out.print(this.titolo + ' ');
        for (int i = 0; i < this.brightness; i++) {
            System.out.println('*');
        }
    };
    public void increaseBrightness(){};
    public void decreaseBrightness(){};
}
