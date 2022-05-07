import java.util.*;
public class StringCount
{
	public static void main(String[] args) {
		int w=0, ch=0, no=0;
		Scanner h = new Scanner(System.in);
		String str = h.nextLine();
		str = str.trim();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>= '0' && str.charAt(i)<='9'){
				no=no+1;
			}
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z'){
				ch=ch+1;
			}
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
				w=w+1;
			}
		}
			
		System.out.println(no+" for number");
		System.out.println(ch+" for character");
		if(no!=0 || ch != 0){
			w += 1;
		}
		System.out.println(w+" for word");
	}
}