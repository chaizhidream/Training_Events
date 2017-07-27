package num4;

import java.util.Scanner;

public class Uitl {
    static Scanner in = new Scanner(System.in);
    static Database data =new Database();
    public static void show(){
       while(true){
           System.out.println("------------------");
           System.out.println("1。插入表中值");
           System.out.println("2。查询表中值");
           System.out.println("3。修改表中值");
           System.out.println("4。删除表中值");
           System.out.println("其他退出");
          
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
       System.out.println("选择查询方式：1.单行查询 2查询全表");
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
 
