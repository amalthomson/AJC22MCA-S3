import pandas as pd
file = pd.read_csv('sample.csv')
print("The Input File is: \n", file)
print()
print("Number of rows and columns: ", file.shape)
print()
print("The Sum of Salary is: " , file['Salary'].sum())