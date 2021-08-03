public class PojoClass {
    public static void main(String[] args) {
        Employee obj =new Employee();
        obj.setName("xxx");
        obj.setId(11);
        obj.setSalary(10000.00);
        obj.setAge(25);
        obj.setCity("Karaikudi");
        System.out.println(obj.toString());
    }
}
