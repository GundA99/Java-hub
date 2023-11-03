package Tester;

import static utils.StudentCollectionUtils.*;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

public class Test {

	public static void main(String[] args) {

		Map<String, Student> studmap = populateMap(populateList());

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the choise");

			boolean Exit = false;
			while (!Exit) {
				try {
					System.out.println(
							"1: Display all\n2: Cancel Addmition\n3: Sorted by CGPA\n4: Average of SP subject\n5: Topper\n6 Subject wise avg\n7: failed student\n8:remove details of students by subject");
					switch (sc.nextInt()) {
					case 1:// Display All data from map
						studmap.forEach((k, v) -> System.out.println(v));
						break;
					case 2:// remove student
						System.out.println("Enter the roll no");
						String roll = sc.next();
						studmap.remove(roll);
						System.out.println("------after------");
						studmap.forEach((k, v) -> System.out.println(v));
						break;
					case 3:// sorted as per GPA
						studmap.values().stream().sorted((p1, p2) -> ((Double) p1.getGpa()).compareTo(p2.getGpa()))
								.forEach(System.out::println);
						break;
					case 4:// average of gpa of students for the specified course/subject
						System.out.println("Enter Course name");
						Subject sub = Subject.valueOf(sc.next().toUpperCase());
						double avg = studmap.values().stream().filter(i -> i.getSubject() == sub)
								.mapToDouble(i -> i.getGpa()).average().orElseThrow();
						System.out.println(avg);
						break;

					case 5: // Topper
						Student st = studmap.values().stream()
								.max((p1, p2) -> ((Double) p1.getGpa()).compareTo(p2.getGpa())).orElseThrow();
						System.out.println(st);
						break;

					case 6: // Subject
						for (Subject s : Subject.values()) {
							System.out.println(s);
						}
						System.out.println("Enter the course");
						Subject s = Subject.valueOf(sc.next().toUpperCase());
						double avg1 = studmap.values().stream().filter(i -> i.getSubject() == s)
								.mapToDouble(i -> i.getGpa()).average().orElseThrow();
						System.out.println(avg1);
						break;

					case 7:// show failed student from sp course
						System.out.println("Enter subject");
						Subject s1 = Subject.valueOf(sc.next().toUpperCase());
						studmap.values().stream().filter(i -> i.getSubject() == s1 && i.getGpa() < 8)
								.forEach(i -> System.out.println(i));
						break;

					case 8: // remove details of all students , enrolled in that course
						System.out.println("Enter subject");
						Subject sub1 = Subject.valueOf(sc.next().toUpperCase());
						studmap.values().removeIf(std -> std.getSubject() == sub1);
						break;

					case 10:
						System.out.println("---Exiting---");
						Exit = true;
						break;

					default:
						System.out.println("Enter valid choise");
						break;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}
		}
	}
}