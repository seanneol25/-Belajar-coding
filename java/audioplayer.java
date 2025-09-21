import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.FileNotFoundException; 

public class audioplayer {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String filepath = "java\\song\\mejikubihiniu.aiff"; //file path variable

        File file = new File(filepath); //file object

        try{
            AudioInputStream AudioStream = AudioSystem.getAudioInputStream(file); //try catch block for exception handling
            Clip clip = AudioSystem.getClip(); //clip object
            clip.open(AudioStream); //open audio stream

            String response = ""; //Initiallize response variable

            //loop too keep the program running until user decide to quit
             while (!response.equals("Q")){
                //display menu options
                System.out.println("P = Play");            
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter Your Choice: ");

                response = scanner.next().toUpperCase(); //get user input and convert to uppercase

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice.");

                }
             }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found. Please check the file path.");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio line is not available.");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported.");
        }
        catch (IOException e) {
            System.out.println("Something went wrong. Please try again.");
        }
        finally{
            System.out.println("Bye!");
            scanner.close();
        }
    }
        

}

