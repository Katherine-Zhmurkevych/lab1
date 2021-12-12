package edu.labs.lab2.task4;

import edu.labs.lab2.task3.Mark;
import edu.labs.lab2.task3.Student;
import edu.labs.lab2.task3.Subject;

import java.util.*;

public class App {

    private static List<Student> students;
    private static List<Subject> subjects;
    private static List<Mark> marks;

    public static void prepareMarks() {
        final Student tom = new Student("021", "Tom", "Watson", 19);
        final Student mary = new Student("023", "Mary", "Keen", 19);
        final Student susan = new Student("024", "Susan", "Stark", 21);
        final Student pete = new Student("022", "Peter", "Rogers", 20);
        students = Arrays.asList(tom, pete, mary, susan);
        final Subject math = new Subject("12345", "Math", "Mr. Ivanov");
        final Subject physics = new Subject("34512", "Physics", "Mr. Petrov");
        final Subject english = new Subject("12567", "English", "Mr. Green");
        subjects = new ArrayList<Subject>() {
            {
                add(physics);
                add(math);
                add(english);
            }
        };
        marks = new ArrayList<>();
        marks.add(new Mark(tom, math, 25));
        marks.add(new Mark(tom, physics, 30));
        marks.add(new Mark(tom, english, 42));
        marks.add(new Mark(mary, math, 51));
        marks.add(new Mark(mary, physics, 37));
        marks.add(new Mark(mary, english, 48));
        marks.add(new Mark(susan, math, 52));
        marks.add(new Mark(susan, physics, 39));
        marks.add(new Mark(susan, english, 35));
        marks.add(new Mark(pete, math, 27));
        marks.add(new Mark(pete, physics, 35));
        marks.add(new Mark(pete, english, 54));
    }

    public static int getRandomMark() {
        int min = 10;
        int max = 50;
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void addNewSubjectToAllStudents(final Subject subject) {
        subjects.add(subject);
        for (Student student : students) {
            marks.add(new Mark(student, subject, getRandomMark()));
        }
    }

    public static List<Mark> findMarkByStudent(final Student student) throws Exception {
        List<Mark> result = new ArrayList<>();
        for (Mark mark : marks) {
            if (mark.getStudent().getId().equals(student.getId())) {
                result.add(mark);
            }
        }
        if (result.isEmpty()) {
            throw new Exception("Unsuccessful marks search");
        }
        return result;
    }

    public static void printAllStudentsReport() throws Exception {
        for (Student student : students) {
            List<Mark> marks = findMarkByStudent(student);
            for (Mark mark : marks) {
                System.out.println("Student " + student + " " + mark.getSubject() + " " + mark.getScore());
            }
        }
    }

    public static Map<String, List<Mark>> buildMapMarks() throws Exception {
        final Map<String, List<Mark>> result = new HashMap<>();
        for (Student student : students) {
            result.put(student.getId(), findMarkByStudent(student));
        }
        return result;
    }

    public static Map<String, Double> buildAverageMarksMap() throws Exception {
        final Map<String, List<Mark>> allMarksMap = buildMapMarks();
        final Map<String, Double> result = new HashMap<>();
        Set<String> studentIDs = allMarksMap.keySet();
        double average;
        for (String id : studentIDs) {
            List<Mark> marks = allMarksMap.get(id);
            double sum = 0;
            int index = 0;
            for (Mark mark : marks) {
                sum += mark.getScore();
                index++;
            }
            average = sum / index;
            result.put(id, average);
        }
        return result;
    }

    public static Student getStudentWithMaxAverageMarks(final Map<String, Double> averageMarksMap) throws Exception {
        Student result = null;
        List<Double> markList = new ArrayList<>(averageMarksMap.values());
        Double max = markList.get(0);
        for (Double score : markList) {
            if (max < score) {
                max = score;
            }
        }
        for (String id : averageMarksMap.keySet()) {
            if (averageMarksMap.get(id) == max) {
                result = getStudentById(id);
            }
        }
        return result;
    }

    private static Student getStudentById(String id) throws Exception {
        Student result = null;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                result = student;
            }
        }
        if (result == null) {
            throw new Exception("Unsuccessful student search");
        }
        return result;
    }

    public static Map<String, List<Mark>> getMapMarksBySubject(final Subject subject) throws Exception {
        List<Mark> marksBySubject = findMarksBySubject(subject);
        Map<String, List<Mark>> result = new HashMap<>();
        for (Mark mark : marksBySubject) {
            String studentId = mark.getStudent().getId();
            List<Mark> studentMarksBySubject = new ArrayList<>();
            for (Mark markBySubject : marksBySubject) {
                if (markBySubject.getStudent().getId().equals(studentId)) {
                    studentMarksBySubject.add(markBySubject);
                }
            }
            result.put(studentId, studentMarksBySubject);
        }
        return result;
    }

    public static List<Mark> findMarksBySubject(final Subject subject) throws Exception {
        List<Mark> result = new ArrayList<>();
        for (Mark mark : marks) {
            if (mark.getSubject().getId().equals(subject.getId())) {
                result.add(mark);
            }
        }
        if (result.isEmpty()) {
            throw new Exception("Unsuccessful marks search");
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        prepareMarks();
        printAllStudentsReport();
        System.out.println("___________________________");
        addNewSubjectToAllStudents(new Subject("12098", "Geography", "Ms. Bolton"));
        printAllStudentsReport();
        final Student studentWithMaxAverageMarks = getStudentWithMaxAverageMarks(buildAverageMarksMap());
        System.out.println("The student with the greatest average mark is " + studentWithMaxAverageMarks);
        System.out.println("Student's marks for " + subjects.get(0) + " subject:\n" + getMapMarksBySubject(subjects.get(0)));
    }
}
