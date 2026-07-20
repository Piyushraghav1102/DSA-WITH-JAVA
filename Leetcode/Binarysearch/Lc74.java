public class Lc74 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;        // for the row 
        int m=matrix[0].length;     // for the colums

        int low=0;
        int high=(n*m-1);

    while(low<=high){
        int mid=low+(high-low)/2;

        int row=mid/m;                  //Totally optimize
        int col=mid%m;

        if(matrix[row][col]==target)
        return true;
        else if(matrix[row][col]<=target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return false;
    
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };

        System.out.print(searchMatrix(arr, 34));


    }
}