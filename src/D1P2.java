import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class D1P2 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\9258830\\IdeaProjects\\aoc\\src\\resources\\day1.txt");
        Scanner scan = new Scanner(input);

        int num = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (scan.hasNextLine()){
            String s = scan.nextLine();
            if (!s.isEmpty()) {
                num += Integer.parseInt(s);
            }else{
                list.add(num);
                num = 0;
            }
        }

        // Sort through list
        int one = 0;
        int two = 0;
        int three = 0;
        //
        for (Integer i : list){
            if (i > one){
                one = i;
            }
        }
        System.out.println(one);

        for (Integer i : list){
            if (i > two && one != i){
                two = i;
            }
        }
        System.out.println(two);

        for (Integer i : list){
            if (i > three && one != i && two != i){
                three = i;
            }
        }
        System.out.println(three);

        System.out.println(one + two + three);
    }
}
