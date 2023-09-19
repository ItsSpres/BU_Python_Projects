

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
        
    


# Program