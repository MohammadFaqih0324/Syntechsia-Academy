import mart.EmployeeMart;

public class MainApp {
    public static void main(String[] args) {

        EmployeeMart employeeMart = new EmployeeMart();
        employeeMart.location = "Karawang";
        employeeMart.identityNum = "059910892";
        employeeMart.contactNum = "081100938847";
        employeeMart.entityNum = "PT.Syntechsia Sejahtera";
        System.out.println("Mart Identity");
        System.out.println("Locatin         : " .concat(employeeMart.location));
        System.out.println("Identity Number : " .concat(employeeMart.identityNum));
        System.out.println("Contact Number  : " .concat(employeeMart.contactNum));
        System.out.println("Entity Name     : " .concat(employeeMart.entityNum));
        System.out.println("==========================================");
        employeeMart.name = "Petruk Silailai";
        employeeMart.position = "Manager";
        employeeMart.sallary = "50000000";
        System.out.println("Employee of PT.Syntechsia Sejahtera");
        System.out.println("Name     : " .concat(employeeMart.name));
        System.out.println("Position : " .concat(employeeMart.position));
        System.out.println("Sallary  : " .concat(employeeMart.sallary));
        employeeMart.employee();
    }
}