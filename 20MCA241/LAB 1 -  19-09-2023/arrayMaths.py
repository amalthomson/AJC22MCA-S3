import numpy as np

array1 = np.array([1, 4, 9, 16, 25])
resultSR = np.sqrt(array1)
print(resultSR)

resultExp = np.exp(array1)
print(resultExp)
print()

resultSum = np.sum(array1)
print(resultSum)
print()

resultMean = np.mean(array1)
print(resultMean)
print()

resultMax = np.max(array1)
print(resultMax)
print()

resultSDeviation = np.std(array1)
print(resultSDeviation)
print()

array2D = np.array([[1, 2, 3], [4, 5, 6]])
resultSTDAxis = np.std(array2D, axis=1)
print(resultSTDAxis)