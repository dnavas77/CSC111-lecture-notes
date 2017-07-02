public class MatrixOps
{
	public static double[][] multiply(double[][] matrix1, double[][] matrix2)
	{
		// variable declaration and initialization
		int i, j, k;
		int matrix1Rows = matrix1.length;
		int matrix1Columns = matrix1[0].length;

		int matrix2Rows = matrix2.length;
		int matrix2Columns = matrix2[0].length;

		double[][] productMatrix;

		// If rows in matrix1 == columns in matrix2 continue checking elements.
		if (matrix1Rows == matrix2Columns && matrix1Columns == matrix2Rows)
		{
			// At this point multiplication is possible, initialize product matrix.
			productMatrix = new double[matrix1Rows][matrix2Columns];

			// Multiply matrices and store into productMatrix.
			for (i = 0; i < matrix1Rows; i++)
			{
				for (j = 0; j < matrix2Columns; j++)
				{
					for (k = 0; k < matrix2.length; k++)
					{
						productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				} // end for
			}

			return productMatrix;
		} // end if

		return null;
	} // end multiply

} // end MatrixOps class
