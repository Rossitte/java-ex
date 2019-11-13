package calculater;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class Doublenumber {
	public static void main(String args[]) {
		int x=0;//第一个数
		int y=0;//第二个数
		int ans=0;//结果
		int number=0;//题目数量
		int wrongNum=0;//错误题目数量
		int rightNum=0;//正确题目数量
		int times=0;//作答次数
		System.out.print("请输入练习次数=");
		Scanner sc = new Scanner(System.in);
	    number= sc.nextInt(); 
	    System.out.println("//////答题开始！\\\\\\\\\\\\");
	for(int i=0;i<number;i++) {
		x=(int)(Math.random()*90)+10;
		y=(int)(Math.random()*90)+10;
	    	int sum1 = sum(x,y);
	    	ans =sc.nextInt();
			if(check(sum1,ans)){
				rightNum++;
				System.out.println("真棒！答案正确！");
				continue;
			}
			else {
				wrongNum++;
				System.out.println("啊哦，答错了，再试试吧");
				System.out.println("是否重新作答（1/2）1重新做答，2放弃做答");					
				int word = sc.nextInt();
			     if (word==1) {
			    	 System.out.print(x+"+"+y+"=");
			    	 ans=sc.nextInt();
			    	 if(check(sum1,ans)){
							rightNum++;
							System.out.println("真棒！答案正确！");
						}
			    	 else {
			    		 times++;
			    		 if(times==3) {
			    			 System.out.println("笨蛋，错了三次了，继续下一题吧");
			    		 }
			    		 System.out.println("啊哦，答错了，再试试吧");
			    		 System.out.print(x+"+"+y+"=");
				    	 ans=sc.nextInt();
				    	 if(check(sum1,ans)){
								rightNum++;
								System.out.println("真棒！答案正确！");
				    	 }
			    	 }
			     }
			     else {
			    	wrongNum++;
			    	continue;
			     }
			    
			}
		}
	 System.out.println("答题结束咯！看看你的成绩吧！");
     System.out.println("共"+number+"道题"+"你一共答对了"+rightNum+"道题,"+"答错了"+wrongNum+"道题，"+"重新作答"+times+"道题");
     if(rightNum>(double)(number*0.6)) {
    	 System.out.println("刚刚及格，还不错呦");
     }
     else if(rightNum>(double)(number*0.7)) {
    	 System.out.println("成绩良好，继续保持");
     }
     else if(rightNum>(double)(number*0.8)) {
    	 System.out.println("成绩真棒！");
     }
     else if(rightNum==number) {
    	 System.out.println("恭喜你！全做对了");
     }
     else{
    	 System.out.println("成绩不及格，快回家做题吧");
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