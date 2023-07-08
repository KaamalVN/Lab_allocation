package Lab_allocation;
import java.util.*;
public class Allocation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int z=scanner.nextInt();
		int n=scanner.nextInt();
		int result=0;
		int allocations[]={x,y,z};
		Arrays.sort(allocations);
		for(int i=0;i<3;i++){
		    if(n<=allocations[i]){
		        result=allocations[i];
		        break;
		    }
		}
		if(result==x){
		    System.out.print("L1");
		}
		else if(result==y){
		    System.out.print("L2");
		}
		else{
		    System.out.print("L3");
		}

	}

}
