import java.text.DateFormat;
import java.util.Date;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary < 1000){
            return 0;
        }else if(this.salary > 1000){
            return this.salary*0.03;
        }
        return 0;
    }

    int bonus(){
        if(this.workHours > 40){
           return (workHours - 40)*30;
        }else {
            return 0;
        }
    }
    double raiseSalary(){
        if(2021 -this.hireYear < 10){
            return this.salary*0.05;
        }else if(2021 - this.hireYear > 9 && 2021 - this.hireYear < 20){
            return this.salary*0.10;
        }else{
            return this.salary*0.15;
        }
    }

    @Override
    public String toString() {
        String info =
                "Employe Info : \n" +
                "Name : "+this.name +"\n" +
                "Salary : "+this.salary +"\n"+
                "Work Hours : "+this.workHours+"\n"+
                "Start Year : "+this.hireYear+"\n"+
                "Tax : "+tax()+"\n"+
                "Bonus : "+bonus()+"\n"+
                "Salary Increase : "+raiseSalary()+"\n"+
                "Salary with Tax and Bonus : "+(this.salary + bonus() - tax())+"\n"+
                "Total Salary : "+(this.salary + (bonus()+raiseSalary()) - tax());

        return info;
    }
}
