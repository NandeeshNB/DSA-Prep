package LeetCode;

public class search_2DMatrix_74 {
    public static boolean searchMatrix(int[][] matrix, int target){
        int top=0;
        int bot=matrix.length-1;

        while(top<=bot){
            int mid=(top+bot)/2;
            if(matrix[mid][0]<=target && matrix[mid][matrix[mid].length-1]>=target){
                break;
            }else if(matrix[mid][0]>target){
                bot=mid-1;
            }
            else{
                top=mid+1;
            }
        }
            // finding the target  in only single row
            int row=(top+bot)/2;
            int left=0;
            int right=matrix[row].length-1;

             while(left<=right){
                int mid1=left+(right-left)/2;
                if(matrix[row][mid1]==target) return true;
                else if(matrix[row][mid1] < target) left=mid1+1;
                else right=mid1-1;
             }
             return false;
        }
        public static void main(String[] args) {
            int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
            int target = 3;
            System.out.println(searchMatrix(matrix, target));
        }
    }

