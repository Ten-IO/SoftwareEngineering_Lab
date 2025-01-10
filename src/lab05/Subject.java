package lab05;
// import lombok.Getter;
// import lombok.Setter;

// @Getter @Setter
public class Subject {
    private String subjectName; // e.g. Intero to SE
    private int subjectCode; // e.g. 1
    private int numberOfCredits = 1;

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
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public int getSubjectCode() {
        return subjectCode;
    }
    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
}
