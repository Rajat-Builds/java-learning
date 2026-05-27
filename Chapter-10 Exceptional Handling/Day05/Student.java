public class Student {
  private int marks;
  public void setMarks(int marks) throws InvalidMarksException{
    if (marks > 100 || marks <0 ) {
        throw new InvalidMarksException("Marks must be between 0 and 100");
    }
    this.marks = marks;
  }
  public int getMarks() {
      return marks;
  }
}
