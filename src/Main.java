import entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionarios> list = new ArrayList<>();

        System.out.print("How many employees will be registered: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Funcionarios func = new Funcionarios(id, name, salary);
            list.add(func);
        }

        System.out.print("Enter the employee id to increase his salary: ");
        int idsalary = sc.nextInt();
        Integer pos = position(list, idsalary);
        if (pos == null){
            System.out.println("This id does not exist");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees");
        for(Funcionarios emp : list){
            System.out.println(emp);
        }

        sc.close();
    }
    public static Integer position(List<Funcionarios> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}