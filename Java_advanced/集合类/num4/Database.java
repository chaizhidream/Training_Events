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
       System.out.print("����Ҫ��ѯѧ����ѧ�ţ�");
       int i =Uitl.in.nextInt();
       if(map.get(i)==null){
           System.out.println("û�����ѧ��");
          
       }else{
           System.out.println("ѧ�ţ�"+map.get(i).getId()+"\t����:"+map.get(i).getName()+"\t����:"+map.get(i).getAge());
       }
      
    }
    public  void selectAll(){
      
       System.out.println("ѧ�ţ�\t����:\t����:");
       System.out.println("-------------------");
       Set<Integer> set = map.keySet();
       for(Object n:set){
           System.out.println("ѧ�ţ�"+map.get(n).getId()+"\t����:"+map.get(n).getName()+"\t����:"+map.get(n).getAge());
       }
    }
    public  void insert(){
       s = new Student();
       s.setId(getId());
       System.out.println("������������");
       s.setName(Uitl.in.next());
       System.out.println("���������䣺");
       s.setAge(Uitl.in.nextInt());
       map.put(s.getId(), s);
       System.out.println("�ɹ����һ����¼");
    }
    public  void update(){
       System.out.print("����Ҫ�޸�ѧ����ѧ�ţ�");
       int i =Uitl.in.nextInt();
       if(map.get(i)==null){
           System.out.println("û�����ѧ��");
          
       }else{
           System.out.println("������������");
           s.setName(Uitl.in.next());
           System.out.println("���������䣺");
           s.setAge(Uitl.in.nextInt());
           System.out.println("ѧ�ţ�"+map.get(i).getId()+"\t����:"+map.get(i).getName()+"\t����:"+map.get(i).getAge());
           System.out.println("�ɹ��޸�һ����¼");
       }
    }
    public  void delete(){
       System.out.print("����Ҫɾ��ѧ����ѧ�ţ�");
       int i =Uitl.in.nextInt();
       if(map.get(i)==null){
           System.out.println("û�����ѧ��");
          
       }else{
           map.remove(i);
           System.out.println("�ɹ�ɾ��һ����¼");
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
 
