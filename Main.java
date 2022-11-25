import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("/ASK-TASK1 /Reshenie zadachi 1y po StringLesson");
        String firstName="Иван";
        String middleName="Иванович";
        String lastName="Иванов";
        String separator=" ";
        String fullName1= String.join(separator, lastName, firstName, middleName);
        String fullName2= lastName+separator+firstName+separator+middleName;
        String fullName3= lastName.concat(separator).concat(firstName).concat(middleName);
        System.out.println("ФИО сотрудника "+fullName1+".");
        System.out.println("ФИО сотрудника "+fullName2+".");
        System.out.println("ФИО сотрудника "+fullName3+".");

        System.out.println("/ASK-TASK2 /Reshenie zadachi 2y po StringLesson");
        String fullName="Иванов Иван Иванович";
        System.out.println("Данные сотрудника для заполнения отчёта "+ fullName.toUpperCase());

        System.out.println("/ASK-TASK3 /Reshenie zadachi 3y po StringLesson");

        String taskName="Иванов Семён Семёнович".replace("ё","е");
        String[]names= taskName.split(separator);
        System.out.println(taskName);
        System.out.println(Arrays.toString(names));
        for (int i=0;i<names.length;i++){
            String name = names[i];
            if (name.contains("ё")){
                names[i]=name.substring(0,name.indexOf('ё'))+'e'+name.substring(name.indexOf('ё')+1);
            }
        }

    }
}
