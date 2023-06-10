
package employeetest;

class employee{
    String fname, lname;
    double salary;
    employee(String f,String l, double msal){
        fname = f;
        lname = l;
        salary = msal;
    }
    double ysal(){
        if(salary<0){
            salary = 0.0;
        }
        return salary*12;
    }
    double rise(){
        if(salary<0){
            salary = 0.0;
        }
        return (salary*12)*1.1;
    }
}   
public class Employeetest {

    
    public static void main(String[] args) {
        employee empl1 = new employee("Marion", " Vutagwa ", 70000);
        employee empl2 = new employee("Faith", " Mokeira ", 75000);
        double yearly = empl1.ysal();
        double payrise1 = empl1.rise();
        double yearly2 = empl2.ysal();
        double payrise2 = empl2.rise();
        System.out.println("Employee name: " +empl1.fname.concat(empl1.lname)+ "Your anual salary is: "+yearly);
        System.out.println("Employee name: " +empl1.fname.concat(empl1.lname)+ "Your anual salary is: "+payrise1);
        System.out.println("Employee name: " +empl2.fname.concat(empl2.lname)+ "Your anual salary is: "+yearly2);
        System.out.println("Employee name: " +empl2.fname.concat(empl2.lname)+ "Your anual salary is: "+payrise2);
    }
    
}
