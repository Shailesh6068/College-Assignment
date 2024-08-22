import numpy as np

m1 = np.array([[1,4],[2,5]])
m2 = np.array([[1,4],[1,5]])


result_add = m1 + m2
print("The addition of matrix is:\n",result_add)

result_sub = m1 - m2
print("The substraction of matrix is:\n",result_sub)

mat = np.array([[0,0],[0,0]])
for i in range(2):
    for j in range(2):
        for k in range(2):
            mat[i][j] = mat[i][j] + (m1[i][k] * m2[k][j]);
print("The multiplication of matrix is:\n",mat)
