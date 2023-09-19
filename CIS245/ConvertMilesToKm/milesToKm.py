# Source: CIS 245 - Introduction to Programming
# Week 8 Project
# Class: CSD 205-A310
# Ian Spresney 2023
# Date: September 17, 2023

def main():
    intro()

    # Using 'try' just incase a user accidentally types in a letter.
    try:
        amountOfMiles = int(input('Enter the number of miles driven: '))
        milesToKilometers(amountOfMiles)

    except:
        print("There was an error. Please only enter numbers.")
        main()


# Introduction to the program.
def intro():
    print("""
    CONVERT MEASUREMENTS

    Miles to Kilometers
          """)

def milesToKilometers(miles):
    print(f'Number of miles entered: {miles}mi')
    kilometers = miles * 1.60934
    print(f'That converts to {kilometers}km')


# Call the function and print when finished
main()
print('---The program has finished running---')