package problems;

public class RotateImage {
public void rotate(int[][] matrix) {
        
        //transpose
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<i;j++){ //to avoid inplace  collision
               int temp = matrix[i][j]; 
                matrix[i][j] =  matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }

	public static void main(String[] args){
		RotateImage s = new RotateImage();
		int[][] matrix = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		s.rotate(matrix);
	
}
}
