import java.util.Scanner;

public class Matrix{
//import java.util.Scanner;

		public static void main(String [] args) {
		int num[][]= new int[2][2];
		Scanner input=new Scanner(System.in);
			for (int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					System.out.print ("enter the number\n" );
					num[i][j]=input.nextInt();
 		 }
		}
		         for (int i=0;i<2;i++){ 
                                for(int j=0;j<2;j++){
                                        System.out.print (num[i][j] +"\t");                			
	        }
                       System.out.println();
       }
            
  }
}
