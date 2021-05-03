package lesson5;

public class worker {

    private String name;
    private String surname;
    private String position;
    private String email;
    private int number;
    private int salary;
    private int age;

    public void Worker(String name, String surname, String position, String email, int number, int salary, int age) {
        this.name=name;
        this.surname=surname;
        this.position=position;
        this.email=email;
        this.number=number;
        this.salary=salary;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.name=surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position=position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number=number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary=salary;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Worker:"+ "name="+name+",surname="+surname+",position="+position+",email="+email+",number="+number+",salary="+salary+",age="+age;
    }

}
