package num4;

import java.util.Scanner;

public class Uitl {
    static Scanner in = new Scanner(System.in);
    static Database data =new Database();
    public static void show(){
       while(true){
           System.out.println("------------------");
           System.out.println("1���������ֵ");
           System.out.println("2����ѯ����ֵ");
           System.out.println("3���޸ı���ֵ");
           System.out.println("4��ɾ������ֵ");
           System.out.println("�����˳�");
          
           int i = in.nextInt();
           switch(i){
           case 1:data.insert();
           break;
           case 2:select();
           break;
           case 3:data.update();
           break;
           case 4:data.delete();
           break;
           default:System.exit(0);
       }
      
       }
      
    }
    public static void select(){
       System.out.println("ѡ���ѯ��ʽ��1.���в�ѯ 2��ѯȫ��");
       int i = in.nextInt();
       switch(i){
       case 1:data.select();
       break;
       case 2:data.selectAll();
       break;
       default:System.exit(0);
       }
    }
   
}
 
