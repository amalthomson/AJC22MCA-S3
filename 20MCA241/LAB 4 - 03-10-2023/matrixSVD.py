import numpy as np
matrix = np.array([[1, 4, 7], [2, 5, 8], [3, 6, 9]])
print("Initial Matrix is: ")
print(matrix)
U, s, V = np.linalg.svd(matrix)
print("\nFactor of the given matrix  by Singular Value Decomposition:")
print("\nU=", U, "\n\ns=", s, "\n\nV=", V)

