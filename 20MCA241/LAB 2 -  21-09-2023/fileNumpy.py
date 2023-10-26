import numpy as np
array = np.array([1, 2, 3, 4, 5])
np.savetxt("file.txt", array)
print(np.loadtxt("file.txt"))
