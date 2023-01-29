package constructionFirm;

//Creating PermanentEmployee class and inheriting the Employee class
public class PermanentEmployee extends Employee{
    private double basicPay;
    private double hra;
    private double experience;

//    Defining constructor of PermanentEmployee class
    public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, double experience) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

//    Method defining the logic for variable pay
    double getVariableComponent(){
        if(experience<3){
            return 0;
        }else if(experience>=3 && experience<5){
            return .05*basicPay;
        } else if (experience>=5 && experience<10) {
            return .07*basicPay;
        }else{
            return .12*basicPay;
        }
    }

//    Method to calculate the monthly salary of permanent employees
    public void calculateMonthlySalary(){
        double variableComponent = getVariableComponent();

//        Defining logic for salary calculation of permanent employee
        double salary = basicPay + hra + variableComponent;

        System.out.println("The salary of the worker is: " + Math.round(salary));
    }
}
