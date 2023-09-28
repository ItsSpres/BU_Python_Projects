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

while True:

    # Making the root window with tkinter
    rt = tk.Tk()
    rt.withdraw()

    # pop directories and allow user to make a selection.
    selectedDir = filedialog.askdirectory(title="Select Directory")

    # checking that a directory was actually selected. 
    if selectedDir:

        print(f"You have selected \033[4m{selectedDir}\033[0m as your file save location.")
        break # exiting loop

    else: 
        print("An error has occured or no directory was selected.")

def create_file():
    print("hello world")