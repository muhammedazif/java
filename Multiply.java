import java.util.Scanner;
public class Multiply{

	public static void main (String[] args){
		Scanner input = new Scanner(System.in); 
		int first[][] = new int[2][2];
		int second[][]= new int[2][2];
		
		for (int i=0;i < 2; i++){
			for (int j=0;j<2;j++){
				System.out.print("Enter the numbers of first matrix ");
				first[i][j]= input.nextInt();

			}
		}

		for (int i=0;i < 2; i++){
                        for (int j=0;j<2;j++){
                                System.out.print("Enter the numbers of seconf matrix");
                                second[i][j]= input.nextInt();

                        }
                }

// start of multiplication
		int[][] result = new int[first.length][second[0].length];
		for  (int i=0;i<first.length;i++){
			for (int j=0; j < second[0].length ; j++ ){
			    result[i][j]=0 ;
			  for(int k=0;k <first[0].length;k++){
				result[i][j] +=first[i][k]*second[k][j];
				}
			}
		}

*/
     // Print the resulting matrix
           System.out.println("Resultant Matrix:");

              for (int i=0 ; i< result.length;i++ ){
                   for (int j=0; j<result[0].length; j++){
                      System.out.print (result[i][j]+ " " );
                    }
                  System.out.println();
                }


        }
}


