class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        k=[]
        for j in range(len(matrix)):
            m=[]
            for i in range(len(matrix)-1,-1,-1):
            
                m.append(matrix[i][j])
            k.append(m)
        for i in range(len(matrix)):
            for j in range(len(matrix)):
                matrix[i][j] = k[i][j]

