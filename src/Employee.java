public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYears;
    int tax;
    int bonus;

    int totalSalary = salary-tax+bonus;

    int raisedSalary ;

    Employee(String name , int salary , int workHours , int hireYears){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    public void tax(){
        if (this.salary > 1000){
            this.tax = salary/33;
        }
        else {
            this.tax = 0;
        }

    }

    public void bonus(){
        if (this.workHours > 40){
            bonus = (this.workHours-40)*30;
        }
    }

    public void raiseSalary(){
        if (2021- this.hireYears < 10){
            raisedSalary = this.salary += this.salary/20 ;
        }
        else if (2021- this.hireYears > 10 && 2021- this.hireYears < 20){
            raisedSalary = this.salary += this.salary/10 ;
        }
        else {
            raisedSalary = this.salary += this.salary/5 ;
        }

        System.out.println(raisedSalary);
    }

    public void toPrint(){
        System.out.println("Ismi \t:  " + this.name );
        System.out.println("Maasi \t:  " + this.salary );
        System.out.println("Calisma Saati \t:  " + this.workHours );
        System.out.println("Baslangic \t:  " + this.hireYears );
        System.out.println("Vergiler \t: " + this.tax );
        System.out.println("Bonus \t:  " + this.bonus );
        System.out.println("Zamli Maas \t:  " + this.raisedSalary );
        System.out.println("Toplam Maas \t:  " + this.totalSalary );
    }





}
