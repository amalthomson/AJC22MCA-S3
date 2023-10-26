import numpy as np

array1 = np.array([1, 2, 3, 4, 5])
array2 = np.array([6, 7, 8, 9, 10])

print("Addition: ", array1 + array2)
print()
print("Multiplication: ", array1 * array2)
print()
resultAdd = array1 + array2
print("Mean of Result of Addition: ", np.mean(resultAdd))
print()
resultMul = array1 * array2
print("Maximum of Result of Multiplication: ", np.max(resultMul))
print()
