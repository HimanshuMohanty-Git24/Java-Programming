package Lab10.Marketing;

import Lab10.General.*;

public class Sales extends employee {
    public Sales(int empid, String ename) {
        super(empid, ename);
    }

    public double tallowance(double basic) {
        double totalEarnings = earnings(basic);
        return 0.05 * totalEarnings;
    }
}
