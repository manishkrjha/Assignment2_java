package constructionFirm;

//Tester class to test our program
public class Tester {
    public static void main(String[] args){
//        Creating an object for contract employee
        ContractEmployee con = new ContractEmployee(101, "Jon", 2100, 11.5f);
        con.calculateSalary();

//        Creating an object for permanent employee
        PermanentEmployee pe = new PermanentEmployee(111, "Jetha", 15000, 2000, 4);
        pe.calculateMonthlySalary();
    }
}
