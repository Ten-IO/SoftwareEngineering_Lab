package lab05;

/**
 * Describe about Current-Subjects in Class.
 * @author Ten
 * @version 1.1
 * @modified 13-01-2025
 */
public class App {
    public static void main(String[] args) {
        Subject se = new Subject();
        System.out.println("Initial Credit: " + se.getNumberOfCredits());
        se.setNumberOfCredits(90);
        System.out.println("After credit: " + se.getNumberOfCredits());
        System.out.println("Season: " + se.getSeason());
    }
}
