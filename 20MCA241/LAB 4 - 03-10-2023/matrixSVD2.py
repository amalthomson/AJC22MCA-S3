from numpy import array
from scipy.linalg import svd
A = array([[1, 2], [3, 4], [5, 6]])
print("A: \n", A)
U, s, VT = svd(A)
print("\nU: \n", U)
print("\ns: \n", s)
print("\nV^T: \n", VT)