/* Assignment_1
 * registration id =JIRSS2120
 * name = G.GitaPriya
 * Accept student id, name and marks of 6 subjects using CommandLine Arguments and Scanner.
Calculate total marks and average.
Print Student Id, Student Name, Six subject marks, total marks and average.
 */
import java.util.*;
public class StudentRecord {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int student_id;
		String student_name;
		int total_marks,average_marks;
		int english,science,maths,hindi,social,history;
		System.out.println("Enter student_id");
		student_id=in.nextInt();
		System.out.println("student_name");
		student_name=in.next();
		System.out.println("Enter English marks");
		english=in.nextInt();
		System.out.println("Enter Science marks");
		science=in.nextInt();
		System.out.println("Enter Maths marks");
		maths=in.nextInt();
		System.out.println("Enter Hindi marks");
		hindi=in.nextInt();
		System.out.println("Enter Social marks");
		social=in.nextInt();
		System.out.println("Enter History marks");
		history=in.nextInt();
		total_marks=english+science+maths+hindi+social+history;
		average_marks=total_marks/6;
		System.out.println("Marks in English :" +english);
		System.out.println("Marks in Science :" +science);
		System.out.println("Marks in Maths:" +maths);
		System.out.println("Marks in Hindi :" +hindi);	
		System.out.println("Marks in Social :" +social);
		System.out.println("Marks in History :" +history);
		System.out.println("___________________________________");
		System.out.println("Student ID :" +student_id);
		System.out.println("student name :" +student_name);
		System.out.println("total mark of the student :" +total_marks);
		System.out.println("average mark of the student" +average_marks);
		
	}

}
