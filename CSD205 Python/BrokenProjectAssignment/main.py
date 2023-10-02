# Ian Spresney
# CSD205 
# 10/02/2023
 
# NOTE
# Good luck!
 
class Hahaha: 

    def __init__(self, funny): 
        self.funny = funny

    def message(self): 
        return self.funny

while True: 
    userInput = input("Say something funny: ")
    funnyMessage = Hahaha(userInput)
 
    if userInput:
        print(f"Here is your message: {funnyMessage.message()}")
        break
    else:
        print("you didn't say anything...")
        break
 
   