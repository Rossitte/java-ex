package calculater;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class Doublenumber {
	public static void main(String args[]) {
		int x=0;//��һ����
		int y=0;//�ڶ�����
		int ans=0;//���
		int number=0;//��Ŀ����
		int wrongNum=0;//������Ŀ����
		int rightNum=0;//��ȷ��Ŀ����
		int times=0;//�������
		System.out.print("��������ϰ����=");
		Scanner sc = new Scanner(System.in);
	    number= sc.nextInt(); 
	    System.out.println("//////���⿪ʼ��\\\\\\\\\\\\");
	for(int i=0;i<number;i++) {
		x=(int)(Math.random()*90)+10;
		y=(int)(Math.random()*90)+10;
	    	int sum1 = sum(x,y);
	    	ans =sc.nextInt();
			if(check(sum1,ans)){
				rightNum++;
				System.out.println("���������ȷ��");
				continue;
			}
			else {
				wrongNum++;
				System.out.println("��Ŷ������ˣ������԰�");
				System.out.println("�Ƿ���������1/2��1��������2��������");					
				int word = sc.nextInt();
			     if (word==1) {
			    	 System.out.print(x+"+"+y+"=");
			    	 ans=sc.nextInt();
			    	 if(check(sum1,ans)){
							rightNum++;
							System.out.println("���������ȷ��");
						}
			    	 else {
			    		 times++;
			    		 if(times==3) {
			    			 System.out.println("���������������ˣ�������һ���");
			    		 }
			    		 System.out.println("��Ŷ������ˣ������԰�");
			    		 System.out.print(x+"+"+y+"=");
				    	 ans=sc.nextInt();
				    	 if(check(sum1,ans)){
								rightNum++;
								System.out.println("���������ȷ��");
				    	 }
			    	 }
			     }
			     else {
			    	wrongNum++;
			    	continue;
			     }
			    
			}
		}
	 System.out.println("�����������������ĳɼ��ɣ�");
     System.out.println("��"+number+"����"+"��һ�������"+rightNum+"����,"+"�����"+wrongNum+"���⣬"+"��������"+times+"����");
     if(rightNum>(double)(number*0.6)) {
    	 System.out.println("�ոռ��񣬻�������");
     }
     else if(rightNum>(double)(number*0.7)) {
    	 System.out.println("�ɼ����ã���������");
     }
     else if(rightNum>(double)(number*0.8)) {
    	 System.out.println("�ɼ������");
     }
     else if(rightNum==number) {
    	 System.out.println("��ϲ�㣡ȫ������");
     }
     else{
    	 System.out.println("�ɼ������񣬿�ؼ������");
     }
	}
	public static int sum(int x,int y) {
		int sum1=0;
		sum1=x+y;
		System.out.print(x+"+"+y+"=");
		return sum1;
	}
	public static boolean check(int sum,int ans){
		if(sum==ans){
			return true;
		}
		return false;
	}
}