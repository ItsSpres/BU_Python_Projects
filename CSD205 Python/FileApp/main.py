# Ian Spresney
# CSD205-A310
# 09-27-2023
# Sources:
# https://www.geeksforgeeks.org/python-list-files-in-a-directory/

# A module for interacting with the operating system. 
import os
import tkinter as tk
from tkinter import filedialog

# Create the root window
root = tk.Tk()
root.withdraw()

# Ask the user to select a directory
selected_directory = filedialog.askdirectory(title="Select Directory")

# Check if the user selected a directory
if selected_directory:
    print(f"Selected directory: {selected_directory}")

    # Get the list of entries (files and subdirectories) in the selected directory
    entries = os.listdir(selected_directory)

    # Print the entries
    for entry in entries:
        print(entry)
else:
    print("No directory selected.")

