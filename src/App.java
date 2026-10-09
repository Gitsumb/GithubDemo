import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hewo new member to my sewver! Just wemember no memes in #general!");
        String message = scanner.nextLine();
        if (message.equals("Hello")){
            discordMod.Hello();
        }
        else if (message.equals("I just posted a meme in #general")){
            discordMod.Goodbye();
        }
        else if (message.equals("Do you like One Piece?")){
            discordMod.Happiness();
        }
        else{
            discordMod.Confusion();
        }   
    }
}
