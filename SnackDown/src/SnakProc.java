import java.util.Scanner;


class Validation {
	
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
		String out = null;
		System.out.println("Enter report: ");
		try{
		String str = sc.next();
		int rslt = check(L,str);
		if(rslt == 1 || rslt == -1)
			out = "Valid";
		else
			out = "Invalid";
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return out;
	} 
}

class SnakProc {
	
	private static String output[] = null;

	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of reports: ");
		int R = sc.nextInt();
		output = new String[R];
		Validation vd = new Validation();
		for(int i = 0 ; i<R ; i++){
			 output[i] = vd.validity();				
		}
		for(int i = 0 ; i<R ; i++){
			System.out.println(output[i]);				
		}
		sc.close();
	}
}