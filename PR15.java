// Write a java program that read data of students (rollno, name, marks of three subjects) 
// from a text file and calculate percentage. where the data is organized as one line per 
// record and each field of a record is separated by tab(\t). 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PR15 {

    public static void main(String[] args) {
        String filePath = "std1.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
               
                String[] fields = line.split("\t");
               
                if (fields.length == 5) {
                    String rollno = fields[0];
                    String name = fields[1];
                    try {
                        int marks1 = Integer.parseInt(fields[2]);
                        int marks2 = Integer.parseInt(fields[3]);
                        int marks3 = Integer.parseInt(fields[4]);

                        double percentage = calculatePercentage(marks1, marks2, marks3);

                        System.out.println("Roll No: " + rollno + ", Name: " + name +
                                ", Marks: [" + marks1 + ", " + marks2 + ", " + marks3 + "]" +
                                ", Percentage: " + percentage + "%");
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid marks format in the file for student " + name);
                    }
                } else {
                    System.err.println("Invalid record format: " + line);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static double calculatePercentage(int marks1, int marks2, int marks3) {
        int totalMarks = marks1 + marks2 + marks3;
        return (totalMarks / 3.0);
    }
}
