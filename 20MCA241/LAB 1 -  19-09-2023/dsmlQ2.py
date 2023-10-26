import numpy as np

grades = np.array([85, 90, 78, 92, 88, 76, 95, 89, 84, 91])

print("Average Grade: ", np.mean(grades))
print()
print("Grades Scored above 90: ", len(grades[grades>90]))
print()
print("Standard Deviation of Grades: ", np.std(grades))
print()