import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D2P2 {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\9258830\\IdeaProjects\\aoc\\src\\resources\\day2.txt");
        Scanner scan = new Scanner(input);

        int score = 0;
        while (scan.hasNextLine()){
            String s = scan.nextLine();
            if (s.length() == 3){
                // Rock
                if (s.charAt(2) == 'X') score += 1;
                // Paper
                if (s.charAt(2) == 'Y') score += 2;
                // Scissor
                if (s.charAt(2) == 'Z') score += 3;


                if (s.charAt(2) == 'X') score += 0;
                if (s.charAt(2) == 'Y') score += 3;
                if (s.charAt(2) == 'Z') score += 6;


            }
        }
        System.out.println(score);
    }
}
