import pandas as pd

filePath = "studentData.csv"
studentData = pd.read_csv(filePath)

filteredStudents = studentData[studentData['Age'] >= 20]
print("Students aged 20 or older:")
print(filteredStudents)

averageGPA = studentData['GPA'].mean()
print("\nAverage GPA of all students:", averageGPA)

sortedStudents = studentData.sort_values(by='GPA', ascending=False)
topFive = sortedStudents.head(5)
print("\nTop 5 students with the highest GPAs:")
print(topFive)

ageGroupGPA = studentData.groupby('Age')['GPA'].mean().reset_index()
print("\nAverage GPA for each age group:")
print(ageGroupGPA)
