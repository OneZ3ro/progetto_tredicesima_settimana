import entities.Image;
import entities.Player;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player();
        System.out.println("Che cosa vuoi creare?");
        System.out.println("[1]: Immagine  -  [2]: Video  -  [3]: Registrazione Audio  -  [0]: Termina programma");
        int choose1 = Integer.parseInt(input.nextLine());
        switch (choose1) {
            case 1:
                System.out.println("\nInserisci il nome della tua immagine");
                String nomeImg = input.nextLine();
                System.out.println("\nInserisci la tua attuale luminosità (min: 0, max: 10)");
                int lumImg = Integer.parseInt(input.nextLine());
                Image img = new Image(nomeImg, lumImg);
                int checkImg = img.getBrightness();
                if (checkImg != -1) {
                    player1.setImg(img);
                    break;
                } else {
                    return;
                }
            case 2:
                System.out.println("\nInserisci il nome del tuo video");
                String nomeVid = input.nextLine();
                System.out.println("\nInserisci la durata del tuo video");
                int durataVid = Integer.parseInt(input.nextLine());
                System.out.println("\nInserisci il tuo attuale volume (min: 0, max: 10)");
                int volumeVid = Integer.parseInt(input.nextLine());
                System.out.println("\nInserisci la tua attuale luminosità (min: 0, max: 10)");
                int lumVid = Integer.parseInt(input.nextLine());
                Video vid = new Video(nomeVid, durataVid, volumeVid, lumVid);
                int checkVid = vid.getDurata();
                if (checkVid != -1) {
                    player1.setVid(vid);
                    break;
                } else {
                    return;
                }

            case 3:
                System.out.println("\nInserisci il nome della tua registrazione audio");
                String nomeRegAudio = input.nextLine();
                System.out.println("\nInserisci la durata della tua registrazione audio");
                int durataRegAudio = Integer.parseInt(input.nextLine());
                System.out.println("\nInserisci il tuo attuale volume (min: 0, max: 10)");
                int volumeRegAudio = Integer.parseInt(input.nextLine());
                RegistrazioneAudio regAudio = new RegistrazioneAudio(nomeRegAudio, durataRegAudio, volumeRegAudio);
                int checkRegAudio = regAudio.getDurata();
                if (checkRegAudio != -1) {
                    player1.setRegAudio(regAudio);
                    break;
                } else {
                    return;
                }
            case 0:
                System.out.println("\nProgramma terminato con successo");
                return;
            default:
                System.out.println("\nNon hai inserito una delle possibili scelte. Forzato arresto programma");
                return;
        }

        switch (choose1) {
            case 1:
                int n = 12;
                while (n != 0) {
                    System.out.println("\nChe cosa vuoi fare con la tua immagine?");
                    System.out.println("[1]: show()  -  [2]: increaseBrightness()  -  [3]: decreaseBrightness()  -  [0]: Termina programma");
                    int chooseImg = Integer.parseInt(input.nextLine());
                    if (chooseImg == 0) {
                        System.out.println("\nProgramma terminato con successo");
                        n = 0;
                    } else if (chooseImg == 1){
                        Image img = player1.getImg();
                        img.show();
                        System.out.println("\n---------------------------------------------------");
                    } else if (chooseImg == 2 || chooseImg == 3) {
                        System.out.println("\nScegli di quanto modificare la liminosità (min: 0, max: 10)");
                        int brightness = Integer.parseInt(input.nextLine());
                        funzioneImg(chooseImg, player1, brightness);
                    } else {
                        System.out.println("\nNon hai inserito una delle possibili scelte. Forzato arresto programma");
                        n = 0;
                    }
                }
                break;

            case 2:
                int x = 12;
                while (x != 0) {
                    System.out.println("\nChe cosa vuoi fare con il tuo video?");
                    System.out.println("[1]: play()  -  [2]: alzaVolume()  -  [3]: abbassaVolume()   -  [4]: increaseBrightness()  -  [5]: decreaseBrightness()  -  [0]: Termina programma");
                    int chooseVid = Integer.parseInt(input.nextLine());
                    if (chooseVid == 0) {
                        System.out.println("\nProgramma terminato con successo");
                        x = 0;
                    } else if (chooseVid == 1) {
                        Video vid = player1.getVid();
                        vid.play();
                        System.out.println("\n---------------------------------------------------");
                    } else if (chooseVid == 2 || chooseVid == 3){
                        System.out.println("\nScegli di quanto modificare il volume (min: 0, max: 10)");
                        int volume = Integer.parseInt(input.nextLine());
                        funzioneVid(chooseVid, player1, volume);
                    } else if (chooseVid == 4 || chooseVid == 5) {
                        System.out.println("\nScegli di quanto modificare la liminosità (min: 0, max: 10)");
                        int brightness = Integer.parseInt(input.nextLine());
                        funzioneVid(chooseVid, player1, brightness);
                    } else {
                        System.out.println("\nNon hai inserito una delle possibili scelte. Forzato arresto programma");
                        x = 0;
                    }
                }
                break;

            case 3:
                int y = 12;
                while (y != 0) {
                    System.out.println("\nChe cosa vuoi fare con la tua registrazione audio?");
                    System.out.println("[1]: play()  -  [2]: alzaVolume()  -  [3]: abbassaVolume()  -  [0]: Termina programma");
                    int chooseVid = Integer.parseInt(input.nextLine());
                    if (chooseVid == 0) {
                        System.out.println("\nProgramma terminato con successo");
                        y = 0;
                    } else if (chooseVid == 1) {
                        RegistrazioneAudio regAudio = player1.getRegAudio();
                        regAudio.play();
                        System.out.println("\n---------------------------------------------------");
                    } else if (chooseVid == 2 || chooseVid == 3){
                        System.out.println("\nScegli di quanto modificare il volume (min: 0, max: 10)");
                        int volume = Integer.parseInt(input.nextLine());
                        funzioneRegAudio(chooseVid, player1, volume);
                    } else {
                        System.out.println("\nNon hai inserito una delle possibili scelte. Forzato arresto programma");
                        y = 0;
                    }
                }
                break;
        }
        input.close();
    }

    public static void funzioneImg(int chooseImg, Player player1, int brightness) {
        Image img = player1.getImg();
        switch (chooseImg) {
            case 2:
                System.out.println("\nLa tua liminosità precedente: " + img.getBrightness());
                img.increaseBrightness(brightness);
                System.out.println("La tua liminosità attuale: " + img.getBrightness());
                break;
            case 3:
                System.out.println("\nLa tua liminosità precedente: " + img.getBrightness());
                img.decreaseBrightness(brightness);
                System.out.println("La tua liminosità attuale: " + img.getBrightness());
                break;
        }
        System.out.println("\n---------------------------------------------------");
    }

    public static void funzioneVid(int chooseVid, Player player1, int brightnessOrVolume) {
        Video vid = player1.getVid();
        switch (chooseVid) {
            case 2:
                System.out.println("\nIl tuo volume precedente: " + vid.getVolume());
                vid.alzaVolume(brightnessOrVolume);
                System.out.println("Il tuo volume attuale: " + vid.getVolume());
                break;
            case 3:
                System.out.println("\nIl tuo volume precedente: " + vid.getVolume());
                vid.abbassaVolume(brightnessOrVolume);
                System.out.println("Il tuo volume attuale: " + vid.getVolume());
                break;
            case 4:
                System.out.println("\nLa tua liminosità precedente: " + vid.getBrightness());
                vid.increaseBrightness(brightnessOrVolume);
                System.out.println("La tua liminosità attuale: " + vid.getBrightness());
                break;
            case 5:
                System.out.println("\nLa tua liminosità precedente: " + vid.getBrightness());
                vid.decreaseBrightness(brightnessOrVolume);
                System.out.println("La tua liminosità attuale: " + vid.getBrightness());
                break;
        }
        System.out.println("\n---------------------------------------------------");
    }

    public static void funzioneRegAudio(int chooseRegAudio, Player player1, int volume) {
        RegistrazioneAudio regAudio = player1.getRegAudio();
        switch (chooseRegAudio) {
            case 2:
                System.out.println("\nIl tuo volume precedente: " + regAudio.getVolume());
                regAudio.alzaVolume(volume);
                System.out.println("Il tuo volume attuale: " + regAudio.getVolume());
                break;
            case 3:
                System.out.println("\nIl tuo volume precedente: " + regAudio.getVolume());
                regAudio.abbassaVolume(volume);
                System.out.println("Il tuo volume attuale: " + regAudio.getVolume());
                break;
        }
        System.out.println("\n---------------------------------------------------");
    }
}
