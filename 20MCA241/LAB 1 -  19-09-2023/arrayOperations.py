import numpy as np

array1 = np.array([1, 2, 3])
array2 = np.array([4, 5, 6])
resultA = array2 + array1
print(resultA)
print()

resultS = array2 - array1
print(resultS)
print()

resultM = array2 * array1
print(resultM)
print()

matrix1 = np.array([[1, 2], [3, 4]])
matrix2 = np.array([[5, 6],[7, 8]])
resultD = np.dot(matrix1, matrix2)
print(resultD)
print()

resultX = array1[1]
print(resultX)
print()

resultY = array1[1:3]
print(resultY)
print()

resultZ = array1[array1 > 2]
print(resultZ)
print()
