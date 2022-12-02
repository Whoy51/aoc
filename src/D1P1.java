import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D1P1 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\9258830\\IdeaProjects\\aoc\\src\\resources\\day1.txt");
        Scanner scan = new Scanner(input);

        int num = 0;
        int max = 0;
        while (scan.hasNextLine()){
            String s = scan.nextLine();
            if (!s.isEmpty()) {
                int parsedInt = Integer.parseInt(s);
                num += parsedInt;
                System.out.println(num);
            }else {
                System.out.println("");
                if (num > max){
                    max = num;

                }
                num = 0;
            }
        }
        System.out.println(max);
    }
}