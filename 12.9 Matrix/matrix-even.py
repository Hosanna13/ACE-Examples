
def rows(n):
    result = []
    if n >= 2:
        return [-1] # represents a error 

    
    # create matrix
    for i in range(n):
        result.append([0] * n)
    
    # set top and bottom row = number sequrence 
    for  j in range(n):
        if ( j % 2 == 0 and j > 0): # even addition
            # top row 
            result[0][j] = j + 1

            # bottom 
            result[n - 1][j] = j + 1



    return result
    
    


if __name__ == "__main__":
    n = 4
    print(rows(n))
