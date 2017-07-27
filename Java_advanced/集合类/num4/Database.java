package num4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Database {
    Student s;
    static Map<Integer, Student> map;
   
    Database(){
       map =new HashMap<Integer, Student>();
    }
    public  void select(){
       System.out.print("输入要查询学生的学号：");
       int i =Uitl.in.nextInt();
       if(map.get(i)==null){
           System.out.println("没有这个学生");
          
       }else{
           System.out.println("学号："+map.get(i).getId()+"\t姓名:"+map.get(i).getName()+"\t年龄:"+map.get(i).getAge());
       }
      
    }
    public  void selectAll(){
      
       System.out.println("学号：\t姓名:\t年龄:");
       System.out.println("-------------------");
       Set<Integer> set = map.keySet();
       for(Object n:set){
           System.out.println("学号："+map.get(n).getId()+"\t姓名:"+map.get(n).getName()+"\t年龄:"+map.get(n).getAge());
       }
    }
    public  void insert(){
       s = new Student();
       s.setId(getId());
       System.out.println("请输入姓名：");
       s.setName(Uitl.in.next());
       System.out.println("请输入年龄：");
       s.setAge(Uitl.in.nextInt());
       map.put(s.getId(), s);
       System.out.println("成功添加一条记录");
    }
    public  void update(){
       System.out.print("输入要修改学生的学号：");
       int i =Uitl.in.nextInt();
       if(map.get(i)==null){
           System.out.println("没有这个学生");
          
       }else{
           System.out.println("请输入姓名：");
           s.setName(Uitl.in.next());
           System.out.println("请输入年龄：");
           s.setAge(Uitl.in.nextInt());
           System.out.println("学号："+map.get(i).getId()+"\t姓名:"+map.get(i).getName()+"\t年龄:"+map.get(i).getAge());
           System.out.println("成功修改一条记录");
       }
    }
    public  void delete(){
       System.out.print("输入要删除学生的学号：");
       int i =Uitl.in.nextInt();
       if(map.get(i)==null){
           System.out.println("没有这个学生");
          
       }else{
           map.remove(i);
           System.out.println("成功删除一条记录");
       }
    }
    public int getId(){
       Set<Integer> set = map.keySet();
       Object[] o= set.toArray();
       if(o.length==0){
           return 1;
       }else{
           return o.length;
       }
      
    }
}
 
