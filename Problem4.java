// Problem 4 [30pts]
// Mutiply two matrices, use method displayProduct() to display the result. 
// For matrix multiplication to take place, the number of columns of the first matrix must be equal to the number of rows of the second matrix. 
// In our example, i.e.c1 = r2
// Also, the final product matrix is of size r1 x c2, i.e.product[r1][c2]

public class MultiplyMatrices {

    public static void main(String[] args) {
        // input matrix
    	int row1 = 2;
    	int col1 = 3;
    	int row2 = 3;
    	int col2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
        
        // Input your code here: 
        int[][] product = multiplyMatrices(firstMatrix, secondMatrix, row1, col1, col2);
        

        displayProduct(product); 
    }
    
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int row1, int col1, int col2){
    	int[][] product = new int[row1][col2];
    	for(int i = 0; i < row1; i++) {
    		for(int j = 0; j < col2; j++) {
    			for(int k = 0; k < col1; k++) {
    				product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
    			}
    		}
    	}
    	return product;
    }

    public static void displayProduct(int[][] product) {
        System.out.println("Product of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}

