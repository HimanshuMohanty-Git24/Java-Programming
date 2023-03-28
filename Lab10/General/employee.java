package Lab10.General;

public class employee {
    protected int empid;
    private String ename;

    public employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public void empid() {
        System.out.println("Employee ID: " + empid);
    }

    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic);
    }
}
