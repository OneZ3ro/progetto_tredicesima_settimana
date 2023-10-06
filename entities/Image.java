package entities;

public class Image extends ElementoMultimediale implements Brightness{
    private int brightness; // deve essere maggiore di 0
    public Image(String titolo, int brightness) {
        super(titolo);
        if (brightness >= 0 && brightness <= 10) {
            this.brightness = brightness;
        } else {
            System.out.println("Uno dei valori che hai inserito è non rispetta gli standard! Riprova");
            this.brightness = -1;
        }
    }
    public void show(){
        System.out.print("Nome dell'immagine: " + this.titolo + ", luminosità: ");
        for (int i = 0; i < this.brightness; i++) {
            System.out.print('*');
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
    public int getBrightness() {
        return brightness;
    }
}
