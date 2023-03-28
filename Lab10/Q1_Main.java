package Lab10;

import Lab10.Marketing.*;
import Lab10.General.*;

class Q1_Main {
    public static void main(String[] args) {
        Sales salesPerson = new Sales(719, "John Smith");
        double basicSalary = 5000.0;
        double totalEarnings = salesPerson.earnings(basicSalary);
        double travelAllowance = salesPerson.tallowance(basicSalary);
        salesPerson.empid();
        System.out.println("Total Earnings: " + totalEarnings);
        System.out.println("Travel Allowance: " + travelAllowance);
    }
}
