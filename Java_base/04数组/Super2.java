import javax.swing.JOptionPane;  
  
public class Super2 {  
  
      
    public static void main(String[] args) {  
  
        String num=JOptionPane.showInputDialog("��������������ε�������");  
        int n=Integer.valueOf(num);  
        int[] a=new int[n];  
        a[0]=1;  
        for(int i=1;i<n;i++)  
            a[i]=0;  
        for(int i=0;i<n;i++)  
        {  
            for(int j=i;j>0;j--)  
                a[j]+=a[j-1];  
                                          
            //��ӡ�ո�  
            for(int p=0;p<n-i;p++)  
                System.out.print("  ");  
            //��ӡ����  
            for(int k=0;k<=i;k++)  
                System.out.printf("%4d",a[k]);  
            System.out.print(" ");  
            //����      
            System.out.println();  
  
        }  
    }  
  
}  