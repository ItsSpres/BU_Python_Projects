# Ian Spresney
# 09/04/2023
# Module 7 Assignment - While Loop
# Purpose: To calculate when a given amount of money will 
# double in value given an interest rate.
# Sources: CIS245-previous assignment references.

def main():
    print('When will your money double???')

    # Asking the user to input the required data.
    rate = float(input('Please enter your annual interest rate (ex: 5 would be 5%): '))
    amount = float(input('Please enter the amount of money: '))
    
    # converting to the needed format
    convertRate = rate/100.0

    # These variables will be updated as the program loops
    number_of_years = 0
    balance = amount
    
    # We now have the doubled amount.
    double_amount = amount * 2

    # While the balance hasn't doubled, continue...
    while balance < double_amount:
        earned_interest = balance * convertRate # getting interest
        balance += earned_interest # adding interest to balance
        number_of_years += 1 # adding 1 year every time we loop through.
        
        
    # printing all the needed info...
    print(f"Your money will double in...{number_of_years} year(s).")
    print(f"Total: ${balance}")
    print("The program has ended...")
    


#Program start
main()