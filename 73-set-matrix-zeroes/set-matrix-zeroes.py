class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        pos=[]
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j]==0:
                    pos.append((i,j))
        for i,j in pos:
            k=0
            while k!=len(matrix[i]):
                matrix[i][k]=0
                k+=1
            k=0
            while k!=len(matrix):
                matrix[k][j]=0
                k+=1


        