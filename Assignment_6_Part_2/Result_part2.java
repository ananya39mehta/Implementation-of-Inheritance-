package Assignment_6.Assignment_6_Part_2;

public class Result_part2 extends Student_part2 implements Exam
{
    double percentage;
    public Result_part2(String name, int roll_no, double mark1, double mark2)
    {

        super(name, roll_no, mark1, mark2);
// TODO Auto-generated constructor stub
    }
    @Override
    public void Percent_cal() {
// TODO Auto-generated method stub
        this.percentage = (mark1 + mark2) /2;
    }
    public String display()
    {
        Percent_cal();
        return toString();
    }
    @Override
    public String toString() {
        return "Result [percentage=" + percentage + ", name=" + name + ", roll_no=" + roll_no + ", mark1=" + mark1

                + ", mark2=" + mark2 + "]";

    }

}
