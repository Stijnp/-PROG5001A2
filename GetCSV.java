
/**
 * A simple program to query student marks.
 *
 * @author Stijn Potums
 * @version 0.1
 */

import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GetCSV {

    static double totalMark(double mark1, double mark2, double mark3) {
        return mark1 + mark2 + mark3;
    }

    static String showAllMarks(Scanner sc, int threshold) {

        String unitName;
        String studentName;
        int studentID;
        double mark1, mark2, mark3;
        List<Double> totalMarks = new ArrayList<Double>();

        // parsing a CSV file into Scanner class constructor
        unitName = sc.nextLine();

        System.out.println(unitName);

        sc.nextLine(); // Skip the column names
        while (sc.hasNext()) // returns a boolean value
        {
            String row = sc.nextLine();
            String columns[] = new String[6];

            columns = row.split(",", -1);

            studentName = columns[0] + " " + columns[1];
            studentID = Integer.parseInt(columns[2]);

            // If empty, then replace with 0.0
            mark1 = (columns[3] == "") ? 0.0 : Float.parseFloat(columns[3]);
            mark2 = (columns[4] == "") ? 0.0 : Float.parseFloat(columns[4]);
            mark3 = (columns[5] == "") ? 0.0 : Float.parseFloat(columns[5]);

            double totalmark = totalMark(mark1, mark2, mark3);

            totalMarks.add(totalmark);

            if (totalmark < threshold) {
                System.out.println(
                        studentName + " | ID: " + studentID + " | Marks: "
                        + mark1 + ", " + mark2 + ", " + mark3 + " | Total Mark: "
                        + totalmark);
            }

        }
        sc.close(); // closes the scanner

        return "";
    }

    public static void main(String[] args) throws Exception {

        int threshold = 1000;

        Scanner sc = new Scanner(new File("./prog5001_students_grade_2022.csv"));

        int menuSelection;

        Scanner menuScanner = new Scanner(System.in);

        System.out.println("Welcome to studentMarks, please select your option below:");
        System.out.println("Press 1 for a complete list of students and their marks");
        System.out.println("Press 2 for a list of students and their marks below a specified threshold");
        System.out.println("Press 3 for a list of students with the highest and lowest marks respectively");

        menuSelection = menuScanner.nextInt();
        if (menuSelection > 3) {
            do {
                System.out.println("Please enter a valid menu option (1-3)");
                menuSelection = menuScanner.nextInt();
            } while (menuSelection > 3);
        }
        // menuScanner.close();

        switch (menuSelection) {
            case 1:
                showAllMarks(sc, threshold);
                break;
            case 2:
                Scanner thresholdScanner = new Scanner(System.in);
                System.out.println("Please enter threshold, only use whole numbers");
                threshold = thresholdScanner.nextInt();
                showAllMarks(sc, threshold);
                break;
            case 3:
                break;
        }

    }
}
