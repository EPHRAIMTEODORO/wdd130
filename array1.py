from sys import argv
# error message when user forgets the command line parameter
if len (argv) != 2:
   print ("Please input the file name")
# main program
else:
    # program to create an array for the numbers from the file
    
    A = []
    filename = argv[1]
    file = open(filename,"r")
    for line in file:
        line = line.strip()
        A.append(int(line))
    # function for sorting
    def sort205(p,r):
        if p < r:
            q = divide(p,r)
            sort205(p,q-1)
            sort205(q+1,r)
    # function for checking the numbers
    def divide (p,r):
        x = A[r]
        i = p-1
        for j in range (p, r):
            if A[j] <= x:
                i+=1
                #exchange positions of i and j
                (A[i],A[j])=(A[j],A[i])
        (A[i+1], A[r]) = (A[r], A[i+1])
        return (i +1)
        
    sort205(0,len(A) - 1)
    print (A)