import mart.EmployeeMart;

public class MainApp {
    public static void main(String[] args) {

        EmployeeMart employeeMart = new EmployeeMart();
        employeeMart.location = "Karawang";
        employeeMart.identityNum = "059910892";
        employeeMart.contactNum = "081100938847";
        employeeMart.entityNum = "PT.Syntechsia Sejahtera";
        System.out.println("Mart Identity");
        System.out.println("Locatin         : " + employeeMart.location);
        System.out.println("Identity Number : " + employeeMart.identityNum);
        System.out.println("Contact Number  : " + employeeMart.contactNum);
        System.out.println("Entity Name     : " + employeeMart.entityNum);
        System.out.println("==========================================");
        employeeMart.name = "Petruk Silailai";
        employeeMart.position = "Manager";
        employeeMart.sallary = "50000000";
        System.out.println("Employee of PT.Syntechsia Sejahtera");
        System.out.println("Name     : " + employeeMart.name);
        System.out.println("Position : " + employeeMart.position);
        System.out.println("Sallary  : " + employeeMart.sallary);
        employeeMart.employee();
    }
}
