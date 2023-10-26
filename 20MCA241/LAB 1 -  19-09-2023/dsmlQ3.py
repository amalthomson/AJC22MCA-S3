import numpy as np

matrix1 = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
matrix2 = np.array([[9, 8, 7], [6, 5, 4], [3, 2, 1]])

print("Sum of the Matrices:\n", matrix1 + matrix2)
print()
print("Product of the Matrices:\n", matrix1 * matrix2)
print()
matrixDot = np.dot(matrix1, matrix2)
print("Dot Product of the Matrices:\n", matrixDot)
print()
matrixTranspose = np.transpose(matrix1)
print("Transpose of the Matrix 1:\n", matrixTranspose)
print()
matrixDeterminant = np.linalg.det(matrix2)
print("Determinant of the Matrix 2:\n", int(matrixDeterminant))
print()
martix1EValue, martix1EVector = np.linalg.eig(matrix1)
print("Eigen Values of the Matrix 1:\n", martix1EValue)
print()
print("Eigen Vectors of the Matrix 1:\n", martix1EVector)
print()
martix2EValue, martix2EVector = np.linalg.eig(matrix2)
print("Eigen Values of the Matrix 2:\n", martix2EValue)
print()
print("Eigen Vectors of the Matrix 2:\n", martix2EVector)
print()



