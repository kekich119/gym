import java.time.Year;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("��� ������ �������� �� ������ ����� ����: ");
        String gymArr [] = {"�� ����", "�� ����", "�� �����"};
        for (int i = 0; i<gymArr.length; i++){
            System.out.print(gymArr[i] + ", ");
        }

        System.out.println("�������� <��>, ��� �� ������");
        String yes = in.nextLine();
        if (yes.equals("��") ){
            ifo();
        }


     }

     public static int getRandom(){
         return (int) (Math.random() * 3) +1 ;
     }

     public static void ifo(){
         int x = getRandom();
         String gymArr [] = {"�� ����", "�� ����", "�� �����"};
         String lengGym [] = {"�������", "��� �� ���"}; //��������
         String pres [] = {"�����������", "�������� ��� �� �������"};
         String hend [] = {"������������", "���������"};
        if (x == 1) {   //��� �� ����
            System.out.println("������� ������� : " + gymArr[0]);
            System.out.println("������:");
            for (int i = 0; i < lengGym.length; i++) {

                System.out.println(lengGym[i]);
            }
        }
        if (x == 2) {  //�� ����

            System.out.println("������� �������: " + gymArr[1]);
            System.out.println("������:");
            for (int i = 0; i < hend.length; i++) {
                System.out.println(hend[i]);
            }
        }
        if (x == 3) {  //�����
            System.out.println("������� �������: " + gymArr[2]);
            System.out.println("������:");
            for (int i = 0; i < pres.length; i++) {
                System.out.println(pres[i]);
            }
        }






     }
}