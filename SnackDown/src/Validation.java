import java.util.Scanner;

public class Validation {
	
	Scanner sc=new Scanner(System.in);
	
	int check(int length, String str){

		int flag = -1;
		for(int i = 0 ; i<length ; i++){
			char ch = str.charAt(i);
			if(ch == 'H'){
					if(flag == -1 || flag == 1){
						flag = 0;
						continue;
					}	
					else {
						flag = 0;
						break;
					}
			}		
			else if(ch == '.')
					continue;
			else {
				if(flag == 1 || flag == -1){
					flag = 0;
					break;
				}	
				else {
					flag = 1;
					continue;
				}
			}	
		}
		return flag;
	}
	
	public String validity() {
		
		System.out.println("Enter length of report: ");
		int L = sc.nextInt();
		System.out.println("Enter report: ");
		String str = sc.next();
		String out = null;
		int rslt = check(L,str);
		if(rslt == 1 || rslt == -1)
			out = "Valid";
		else
			out = "Invalid";
		return out;
	} 
}
