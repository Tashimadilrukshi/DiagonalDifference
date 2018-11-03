import java.util.Scanner;

class DiagonalDifference{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    
    int n= s.nextInt();
    
    int[][] arr = new int[n][n];
    
    for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
     }

  
  
  }
  
  
  static void diagonalDifference(int[][] arr) {
        int sum1=0,sum2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    sum1+=arr[i][j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                if(i==(arr.length-1-j)){
                    sum2+=arr[i][j];
                }
            }
        }
                   
        System.out.println("Diagonal Difference is "+Math.abs(sum1-sum2) );

    }


}
