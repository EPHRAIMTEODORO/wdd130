from sys import argv
#if the user forgets to input something in the cmmand line parameter
if len (argv) != 2:
   print ("Please input the file name")
#when the input is correct it will proceed to the main program
else:
#open file
    filename = argv[1]
    file = open(filename)
    lines = file.readlines()
    yes = " STATEMENT"
    no = "NOT A STATEMENT"
#for loop to find out the content of the file
    for line in lines:
        line = line.rstrip()
        #check if it starts with these words
        if line.startswith("how") or line.startswith("How"):
            print (line,no)
        elif line.startswith("what") or line.startswith("What"):
            print (line,no)     
        elif line.startswith("where") or line.startswith("Where"):
            print (line,no)
        elif line.startswith("when") or line.startswith("When"):
            print (line,no)
        elif line.startswith("why") or line.startswith("Why"):
            print (line,no)
        elif line.startswith("who") or line.startswith("Who"):
            print (line,no)
        #if there is no space it means its just a single word
        elif " " not in line:
            print (line,no)
        #check if there is a question mark in the line
        elif "?" in line:
            print (line,no)
        #check if these words are found in the sentence
        elif "She" in line:
            print (line,no)
        elif "He" in line :
            print (line,no)
        elif "They" in line :
            print (line,no)
        elif "It" in line :
            print (line,no)
        elif "his" in line:
            print (line,no)
        #print the line and say it is a statement if it passed the elif statements
        else:
            print (line,yes)