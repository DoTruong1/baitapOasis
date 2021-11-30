
public class Student extends Person {
    private String program;
    private double fee;
    private int year;

    Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.year = year;
        this.fee = fee;
        this.program = program;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return this.fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + this.getProgram()
                + ",year=" + this.getYear() + ",fee=" + this.getFee() + "]";
    }

    
}
