package lab05;

/**
 * Describe about Current-Subjects in Class.
 * @author Prachna
 * @version 1.5
 * @modified 14-01-2025
 */
public class App {
    public static void main(String[] args) {
        Subject se = new Subject();
        Session schedule = new Session();
        // Quick Check
        System.out.println("\rSubject : " + se.getSubjectName());
        System.out.println("Code : " + se.getSubjectCode());
        System.out.println("Initial Credit: " + se.getNumberOfCredits());
        System.out.println("Season: " + se.getSeason() + "\n");
        // Modified
        se.setNumberOfCredits(90);
        se.setSubjectCode(001);
        se.setSubjectName("Malware");
        // Re-check
        System.out.println("Subject : " + se.getSubjectName());
        System.out.println("Code : " + se.getSubjectCode());
        System.out.println("After credit: " + se.getNumberOfCredits());
        System.out.println("Season: " + se.getSeason());
        // null test
        se.setSubjectName("");
        // Session implementation
        System.out.println("Class: " + schedule.getSessionTitle());
        System.out.println("Session start: " + schedule.getSessionStart());
        System.out.println("Session end: " + schedule.getSessionEnd());
        // modified
        schedule.setDuration(1, 2);
        schedule.setSessionTitle("Godly Class");
    }
}
