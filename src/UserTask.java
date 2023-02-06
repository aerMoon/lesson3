import java.util.Date;

public class UserTask {
    String title;
    String text;
    Date date;


    UserTask(String title, String text){
        this.date = new Date();
        this.text = text;
        this.title = title;
    }

    void print(){
        System.out.println(title+ "\n" +text +"\n"+date);
    }
}
