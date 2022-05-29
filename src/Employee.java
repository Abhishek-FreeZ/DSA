public class Employee {
    private String name;
    private String company;
    private int age;
    public void display(){
        System.out.println("Name is : "+name);
        System.out.println("Company is : "+company);
        System.out.println("Age is : "+age );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Employee(String name, String company, int age){
        System.out.println("Parameterized Constructor");
        this.name = name;
        this.company = company;
        this.age = age;
    }
    Employee(Employee e2){
        System.out.println("Copy Constructor");
        this.name = e2.getName();
        this.age = e2.getAge();
        this.company = e2.getCompany();
    }
}

class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee("Abhishek","Cognizant",21);
        e1.display();

        Employee e2 = new Employee(e1);
        e2.display();
    }
}