# Ian Spresney
# CIS 245
# Assignment 10.1
# Creating a file and reading it back.

import time

print('Welcome to this simple app that will create a file for you.')
time.sleep(1) # timer to delay inbetween operations or in this case printing text.
print('Lets name your file!')
time.sleep(1)
print('Think of something creative and fun to name it.')
time.sleep(1)
print(f"Just...don't be boring about it.")
time.sleep(1)

# Naming the file
fileName = input('Please enter the name of the file you would like to create: ')

# Asking user to enter all necessary information.
userName = input('Please enter your full name: ')
address = input('Please enter your street address: ')
phoneNumber = input('Please enter your phone number: ')

fileNameFinal = f'{fileName}.txt'

# Writing and creating the file.
with open(fileNameFinal, 'w') as contents: # Opening file
    contents.write(f'{userName}, {address}, {phoneNumber}') # Writing to file

# Reading and printing the file contents.
with open(fileNameFinal, 'r+') as contents:
    print(contents.read())
    contents.close()

time.sleep(1)
print('This file creation has completed and you have reached the end of the program.')
time.sleep(1)
print('Have a nice day!')
