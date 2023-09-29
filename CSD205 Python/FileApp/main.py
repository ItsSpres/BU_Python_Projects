# Ian Spresney
# CSD205-A310
# 09-27-2023
# Sources:
# https://www.geeksforgeeks.org/python-list-files-in-a-directory/
# https://docs.python.org/3/library/dialog.html#:~:text=tkinter.-,filedialog%20—%20File%20selection%20dialogs,creating%20file%2Fdirectory%20selection%20windows.
# Used old CIS 245 Project for file creation reference.

# I started looking into printing all the directories to the terminal which seemed like way too much to do
# I did it and then decided I could number all of them and then let the user select them. 
# However, I felt like I was reinventing the wheel or rather the terminal. 
# As an ls and cd command can allow a user to navigate with ease. 
# Since the assignment wasn't too specific on what I can and cannot use.
# I decided to use the tkinter module. 
# I have used this before for assignments in my CIS classes, specifically my python weather app. 
# This is a much simpler and straight forward method. Less coding too. Yay!
# Essentially giving the user a much better user expereince. Which is what we want, right? 


# A module for interacting with the operating system. 
import os
# The module we will use for showing the user our directories and for selecting them.
import tkinter as tk
from tkinter import filedialog

def main():
    while True:

        # Logic for creating the file.
        # Would be a good idea to make a validation system for making sure the file didn't use any current file names nor any chars
        # that might throw an error. As in '/' or something along those lines.
        def create_file():
            try:
                file_name = input('What do you want to name your file?: ')

                # Collecting user information.
                user_name = input('Enter your full name: ')
                user_address = input('Enter your street address: ')
                user_phone_number = input('Enter your phone number: ')

                file = f'{file_name}.txt'

                # save the file to the selected directoy...
                save_to_path = os.path.join(selectedDir, file_name)

                # Writing and creating the file.
                with open(save_to_path, 'w') as contents: # Opening file
                    contents.write(f'{user_name}, {user_address}, {user_phone_number}') # Writing to file

                # Reading and printing the file contents.
                with open(save_to_path, 'r+') as contents:
                    print(contents.read())
                    contents.close()

            except:
                print('Failed to create file. File name may already be taken or may not be supported')




        # Making the root window with tkinter
        rt = tk.Tk()
        rt.withdraw()


        # pop directories and allow user to make a selection.
        selectedDir = filedialog.askdirectory(title="Select Directory")

        # checking that a directory was actually selected. 
        if selectedDir:

            # Printing the directory we just selcted to the console.
            print(f"You have selected \033[4m{selectedDir}\033[0m as your file save location.")

            # Time to create a file.
            create_file()
            break

        else: 
            print("An error has occured or no directory was selected.")
            # Then we will loop around again.



# START
while True: 
    choice = input("Would you like to begin? y/n: ")
    match choice:
        case "y":
            print("You selected yes...")
            main()
            break
        case "n":
            print("You selected no...")
            break
        case default:
            print("error...what did you even type???")





# -----------------------------------------------------
# OLD DUMB DUMB CODE

# PROGRAM START
# start = False

# #Some very very very...probably could have been simplified...logic for 
# #asking the user if they would like to begin. But hey, it works XD.
# while start == False:

#     yes_or_no = input('Would you like to begin? y/n: ')
#     if yes_or_no == 'y':
#         start = True
#     elif yes_or_no == 'n':
#         start = False
#     else:
#         print('not recognized...')

#     if start:
#         main()
#         break
#     elif start != True:
#         print('Program ended...')
#     else:
#         print('IDK what you typed, but it was wrong. So the program ended...')