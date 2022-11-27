package myjava;
import java.util.*;

public class pallindromeprint {
	 public static int palindrom(int n) {
		String s1= n+"";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2+=s1.charAt(i)+"";
		}
		if(s2.equals(s1))
			return Integer.parseInt(s2);
		else return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		ArrayList<Integer> l = new ArrayList<>();
		System.out.println(palindrom(a)); 
		for(int i=1;i>0;i++) {
			
		if(palindrom(a)!=0){
			String s3=palindrom(a)+"";
			if(s3.length()<b) {
				l.add(palindrom(a));
			}
			else break;
			
		}
		else 
			{
				String h=(a+1)+"";
				if(h.length()<b)
				palindrom(a+1);
				else break;
				
			}
		}
		System.out.println(l);

	
		
		}

}
