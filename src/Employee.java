public class Employee {
    String name;
    int workHourse,hireYears,bonus;
    double salary;
    Employee(String name,double salary,int workHourse,int hireYears){
        this.name=name;
        this.salary=salary;
        this.workHourse=workHourse;
        this.hireYears=hireYears;
    }
    public double tax () {
        double tax = 0;
        if (salary > 1000) {
            tax += (salary * 3) / 100;
        }
        else {
            tax = 0;
        }
        return tax;
    }
    public double bonus () {

        double bonusFee ;
        if (workHourse > 40) {
            bonusFee = (workHourse - 40) * 30;
        }
        else {
            bonusFee = 0;
        }
        return bonusFee;
    }
    double raiseSalary(){
        int nowYears=2021;
        int seniority=nowYears-this.hireYears;
        if (seniority<10)
            return this.salary*0.05;
        if (seniority>9&&seniority<20)
            return  this.salary*0.10;
        if (seniority>19)
            return this.salary*0.15;

        return 1;
    }
    public void print(){
        System.out.println("Personel Adi :"+this.name);
        System.out.println("Personel Maasi :"+this.salary);
        System.out.println("Mesai Saati :"+this.workHourse);
        System.out.println("ise Baslangic Yili :"+this.hireYears);
        System.out.println("Vergi Masrafi :"+tax());
        System.out.println("Mesai Ucreti :"+bonus());
        System.out.println("Kidem Maasi :"+raiseSalary());
        System.out.println(sumSalary());


    }
    double sumSalary(){
        double extra=(this.raiseSalary()+this.bonus())-this.tax();
        double sumSalary=this.salary+extra;
        System.out.println("Toplam Maas :"+sumSalary);

    return 0;
    }

}
