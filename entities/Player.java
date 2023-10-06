package entities;

public class Player {
    private Image img;
    private Video vid;
    private RegistrazioneAudio regAudio;

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public Video getVid() {
        return vid;
    }

    public void setVid(Video vid) {
        this.vid = vid;
    }

    public RegistrazioneAudio getRegAudio() {
        return regAudio;
    }

    public void setRegAudio(RegistrazioneAudio regAudio) {
        this.regAudio = regAudio;
    }
}
