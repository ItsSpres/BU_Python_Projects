# Ian Spresney
# CSD205 - Python
# Module 9 Assignment
# 09/19/2023
# GitHub Repo: https://github.com/ItsSpres/My_University_Projects_BU/blob/main/CSD205%20Python/BankAccountProject/BankAccount.py
# Sources that helped me to complete this assignment:
# https://www.w3schools.com/python/
# The provided module 9 video tutorials. 
# Some previous knowledge of mine was also used for this assignment as I have taken other Python classes before.


# This is the parent class
class BankAccount:

    def __init__(self, accountNumber, balance):
        self.accountNumber = accountNumber
        self.balance = balance

    def withdrawal(self, amount):
        # Checking if user has enough money in account
        if amount <= self.balance:
            # Subtracting the money from the balance
            self.balance -= amount
            print('Your withdrawal went through.')
        else:
            print('Not enough funds!')
    
    # Whenever there is a deposit; take the amount and add to balance.
    def deposit(self, amount):
        self.balance += amount
        print('Yay! You added money.')

    # Simply returns the users account balance for the instnace.
    def getBalance(self):
        return self.balance

# Sub class for bank account
class Checking(BankAccount):

    def __init__(self, accountNumber, balance, fees, min_balance):
        super().__init__(accountNumber, balance)
        self.fees = fees
        self.min_balance = min_balance

    # deducting fees from the users account.
    def deductFees(self):
        self.balance -= self.fees
        return self.balance
    
    # Checking if the minimum balance is met
    # If not then we must notify the user. 
    def checkMinimumBalance(self):
        if self.balance < self.min_balance: 
            print('YOUR ACCOUNT BALANCE IS LOW!')
        else:
            print('Balance is okay.')

# Sub class for bank account 
class Savings(BankAccount):

    def __init__(self, accountNumber, balance, interest_rate):
        super().__init__(accountNumber, balance)
        self.interest_rate = interest_rate

    # Adding interest to the savings account.
    def addInterest(self):
        return self.balance * self.interest_rate
        
    

# For the project we will be useing the following and have to go through the program twice.
# Balance: $200, $25
# Fees: $5
# Min Balance: $50
# Interest Rate: 2%
# For account numbers we can just make things up. 
# There are included examples for withdrawal and deposit. I have commented these out for now.

# Getting user input and checking for valid inputs.
while True:
    try:
        # asking the user for the specific inputs.
        account_type = input("Enter account type (C for Checking or S for Savings): ").capitalize()
        account_number = input("Enter account number: ")
        balance = float(input("Enter your initial balance: "))

        # if a certain condition is met then proceed. 
        # in this case it is having to do with the checking and savings accounts
        if account_type == 'C':
            fees = 5
            min_balance = 50
            account = Checking(account_number, balance, fees, min_balance)
        elif account_type == 'S':
            interest_rate = 0.02
            account = Savings(account_number, balance, interest_rate)
        else:
            print("Invalid account type. Please enter 'C' or 'S'.")

        # These are only examples for fun if we would like to simulate a deposit or withdrawal.
        # account.withdrawal(10)  
        # account.deposit(100)    

        # Now we will handle the logic for subtracting fees, checking the minimum balnce, and adding interest.
        # First we need to check the account instance that we are in. 
        if isinstance(account, Checking):
            account.deductFees()
            account.checkMinimumBalance()
        elif isinstance(account, Savings):
            interest_earned = account.addInterest()
            print(f'Interest earned: ${interest_earned:.2f}')

    # handling different types of errors that may occur.
    except ValueError:
        print("Not a valid input.")
    except Exception as error:
        print(f"An error occurred: {error}")

    # Asking the user if they want to continue.
    # For this assignment we must go through the program twice.
    try:
        again = input("Do you want to continue? (y or n): ").lower()
        if again != 'y':
            break # if the user does not type 'y' then the program will terminate. 
    # More error handling for this specific try and input operation. 
    except Exception as error:
        print(f"An error occurred: {error}")