package entities;

public class Image extends ElementoMultimediale implements Brightness{
    public Image(String titolo) {
        super(titolo);
    }
    public void increaseBrightness(){};
    public void decreaseBrightness(){};
}
