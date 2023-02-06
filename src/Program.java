import java.util.ArrayList;
import java.util.*;

class Program {

    public static void main(String[] args){
        //создание списка задач (пустой)
        ArrayList<UserTask> taskList = new ArrayList<UserTask>();

        UserTask task1 = new UserTask("заголовок", "текст заметки/задачи");

        taskList.add(task1); //добавление одного элемента
        Scanner in = new Scanner(System.in);

        //в цикле, пока не введут пустую строку добавляются
        //новые задачи в список
        do {
            System.out.println("Введите заголовок заметки>>");
            String title = in.nextLine();
            System.out.println("Введите текст заметки>>");
            String text = in.nextLine();
            taskList.add(new UserTask(title, text));
        }
        while (in.nextLine()!="");
        in.close();

        for(UserTask task : taskList){
            task.print();

        }
        System.out.println("после удаления 1 заметки>>");
        taskList.remove(1);
        for(UserTask task : taskList){
            task.print();

        }
    }
}
