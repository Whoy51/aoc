import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D2P1 {
    /*
    Completed in one attempt
     */
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

                String opponent = "";
                String you = "";

                if (s.charAt(0) == 'A') opponent = "R";
                if (s.charAt(0) == 'B') opponent = "P";
                if (s.charAt(0) == 'C') opponent = "S";

                if (s.charAt(2) == 'X') you = "R";
                if (s.charAt(2) == 'Y') you = "P";
                if (s.charAt(2) == 'Z') you = "S";

                if (opponent.equals(you) ) score += 3;

                if (opponent.equals("R")  && you.equals("P") ) {
                    score += 6;
                }
                else if (opponent.equals("P")  && you.equals("S") ){
                    score += 6;
                }
                else if (opponent.equals("S") && you.equals("R")){
                    score += 6;
                }else {
                    System.out.println("You lost" + opponent + you);
                }

            }
        }
        System.out.println(score);
    }
}
