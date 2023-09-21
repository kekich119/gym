import java.time.Year;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Это список нагрузок на разный части тела: ");
        String gymArr [] = {"На ноги", "На руки", "На пресс"};
        for (int i = 0; i<gymArr.length; i++){
            System.out.print(gymArr[i] + ", ");
        }

        System.out.println("Напишите <да>, что бы начать");
        String yes = in.nextLine();
        if (yes.equals("да") ){
            ifo();
        }


    }

    public static int getRandom(){
        return (int) (Math.random() * 3) +1 ;
    }

    public static void ifo(){
        int x = getRandom();
        String gymArr [] = {"На ноги", "На руки", "На пресс"};
        String lengGym [] = {"Приседы", "что то ещё"}; //доделать
        String pres [] = {"Скручивание", "Поднятие ног на турнике"};
        String hend [] = {"Подтягивание", "Отжимание"};
        if (x == 1) {   //тут на ноги
            System.out.println("Сегодня делаете : " + gymArr[0]);
            System.out.println("Список:");
            for (int i = 0; i < lengGym.length; i++) {

                System.out.println(lengGym[i]);
            }
        }
        if (x == 2) {  //на руки

            System.out.println("Сегодня делаете: " + gymArr[1]);
            System.out.println("Список:");
            for (int i = 0; i < hend.length; i++) {
                System.out.println(hend[i]);
            }
        }
        if (x == 3) {  //пресс
            System.out.println("Сегодня делаете: " + gymArr[2]);
            System.out.println("Список:");
            for (int i = 0; i < pres.length; i++) {
                System.out.println(pres[i]);
            }
        }






    }
}