package org.himanshu.stream;

/**
 * @Author: Himanshu Singh Java 8 Examples
 */

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {
    private static List<Student> studentList=null;
    static {
        studentList= new ArrayList<>();
        Random random=new Random();
        String initialNumber="98754326";

        // Using Loop to create a List of Random Student

        for(int i=1; i<=10; i++){
            String gender="Male";
            if(i % 5 ==0 || i % 3 ==0){
                gender="Other";
            } else if (i % 2==0 && i % 4==0) {
                gender="Female";
            }
            studentList.add(
                    new Student(random.nextInt(1000,1030),
                            "Student"+random.nextInt(1,30),
                            random.nextInt(11,20),
                            random.nextInt(50),
                            List.of(
                                    initialNumber+random.nextInt(10,99),
                                    initialNumber+random.nextInt(20, 89)
                            ),
                            gender
                    )
            );
        }

    }
    public static void main(String[] args) {
        System.out.println("1. Sort the Student based on first name");
        List<Student> sortedFirstName= studentList.stream().sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
        System.out.println(sortedFirstName);

        System.out.println("\n2. List Students whom age is greater than 15 ");
        List<Student> studentAge=studentList.stream().filter((student)->student.getAge()>17).collect(Collectors.toList());
        System.out.println(studentAge);

        System.out.println("\n3. Sort based on Highest Rank");
        Student student=studentList.stream().min(Comparator.comparing(Student::getRank)).get();
        System.out.println(student);

        System.out.println("\n4. Group Student By Gender");
        Map<String, List<Student>> groupedByGender= studentList.stream().collect(Collectors.groupingBy(Student::getGender));
        System.out.println(groupedByGender);

        System.out.println("\n5. Group Student By Gender and Then Sort them using their rank");
        Map<String, List<Student>> collect = studentList.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.groupingBy(Student::getGender));
        System.out.println(collect);


    }
}
