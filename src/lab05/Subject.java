package lab05;
// import lombok.Getter;
// import lombok.Setter;

// @Getter @Setter
public class Subject {
    private String subjectName = "Introduction to Software Engineering"; // e.g. Intro to SE
    private int subjectCode = 015; // e.g. 1
    private int numberOfCredits = 100;
    private final String season = "S2";

    public Subject() {
        super();
    }
    public Subject(String subjectName, int subjectCode, int numberOfCredits) {
        super();
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.numberOfCredits = numberOfCredits;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) throws IllegalArgumentException {
        if (subjectName == null || subjectName.isEmpty()) {
            throw new IllegalArgumentException("Subject name was not assigned!");
        }
        this.subjectName = subjectName;
    }
    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }
    public int getSubjectCode() {
        return subjectCode;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    public final String getSeason() {
        return season;
    }
    public void setName(String name) throws IllegalArgumentException {

    }
    
}
