from matplotlib import pyplot as plt
import numpy as np

a = np.array([2, 5, 7, 15, 18, 21, 26, 28, 29])

fig, ax = plt.subplots()
ax.hist(a, bins=[0, 10, 20, 30])

plt.show()