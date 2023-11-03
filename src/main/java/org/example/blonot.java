package org.example;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class blonot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        List<String> zadachi1=new ArrayList<>();
        List<String> zadachi= new ArrayList<>();
        while (true) {
            System.out.println(
                    "Добро пожаловать в приложение учета задач!" + "\n" +
                            "Выберите действие:" + "\n" + "\n" +
                            "1. Добавить задачу" + "\n" +
                            "2. Просмотреть задачи" + "\n" +
                            "3. Удалить задачу\n" +
                            "4. Выход");
            int vi = sc.nextInt();
            if (vi == 1) {
                zadachi1.clear();
                System.out.println("Введите название задачи");
                String naz=sc1.nextLine();
                System.out.println("Введите описание ");
                String opis= sc1.nextLine();
                int chet=1;
                String result=(": "+naz+"\n"+ LocalDate.now()+" и "+ LocalTime.now()+ "\n"+opis);
                zadachi.add(result+"\n");
                for (String z:zadachi) {
                    z="Задача "+chet + z;
                    zadachi1.add(z);
                    chet++;
                }
            }else if (vi==2){
                System.out.println(zadachi1);
            }else if (vi==3){
                System.out.println("Какую задучу хоите удалить ?");
                int nom=sc.nextInt()-1;
                zadachi1.remove(nom);
            }else if(vi==4){
                break;
            }
        }
    }
}