public class Employee{
    private String name;
    private int id;
    private double salary;
    private int age;
    private String city;
    public Employee(String name,int id,double salary,int age ,String city){
        this.name=name;
        this.id =id;
        this.salary=salary;
        this.age=age;
        this.city=city;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void print() {
        System.out.println("name is: " + name+", "+"id is: "+id+", "+"salary is : "+salary+", "+"age is: "+age+", "+"city is: "+city);
    }
}
