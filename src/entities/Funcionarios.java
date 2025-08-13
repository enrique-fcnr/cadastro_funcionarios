package entities;

public class Funcionarios {
    private Integer id;
    private String name;
    private double salary;


    //CONSTRUTORES
    public Funcionarios(){
    }
    public Funcionarios(Integer id, String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    //GETTERS AND SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        salary += salary * percentage / 100;
    }

    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }


}