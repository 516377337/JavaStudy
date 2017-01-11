package stalary;
import java.util.*;
public class HuiWen {

	public static void main(String[] args) {
		System.out.println("input you want to judge number");
		Scanner n=new Scanner(System.in);
		String a=n.next();
		char []temp=new char[a.length()];
		for(int i=0;i<a.length();i++){
			temp[i]=a.charAt(a.length()-1-i);
		}
		int flag=0;
        for(int i=0;i<a.length();i++){
        	if(temp[i]==temp[temp.length-1-i])
        		flag=1;
        	else
        		flag=0;
        }        if(flag==0)
        	System.out.println("not huiwen");
        else
        	System.out.println("huiwen");
	}

}
