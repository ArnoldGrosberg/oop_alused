import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // List of subjects
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("OOP");
        subjects.add("Inheritance");
        subjects.add("Encapsulation");
        subjects.add("Composition");
        // Create teacher
        Teacher teacher = new Teacher("Anna");

        // Create group
        ArrayList<Student> ita21 = new ArrayList<>();
        Student mati = new Student("Mati");
        Student kati = new Student("Kati");
        ita21.add(mati);
        ita21.add(kati);

        // Teacher teaches subjects to the group
        education(subjects, ita21, teacher);

        // Exam after teaching
        knowledgeExamination(ita21);
        // After a week Mati forgets encapsulation
        mati.forget("Encapsulation");
        // Check again the knowledge of the group
        knowledgeExamination(ita21);
        // Mati learns again encapsulation subjects
        mati.learn("Encapsulation");
        // Check again the knowledge of the group
        knowledgeExamination(ita21);


    }

    public static void knowledgeExamination(ArrayList<Student> group) {
        for (Student student : group) {
            System.out.println("Student " + student.getName() + " knowledge:");
            for (String knowledge : student.getKnowledge()) {
                System.out.println(knowledge);
            }
            System.out.println();
        }
    }

    public static void education(ArrayList<String> subjects, ArrayList<Student> group, Teacher teacher) {
        for (String subject : subjects) {
            for (Student student : group) {
                teacher.teaches(student, subject);
            }
        }
    }
}