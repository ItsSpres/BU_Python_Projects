#Ian Spresney 

def main():
    pcHardware = {
        "CPU": "9700K",
        "GPU": "RTX 4070",
        "CPUSpeed": "5.0Ghz",
        "MonitorRes": "1440p",
        "MemorySpeed": "3200MHz",
        "StorageSizeHDD": "4TB",
        "StorageSizeSSD": "1TB",
        "NumberOfFans": 8,
        "PSURatedWattage": 750,
        "CPUCoolerStyle": "Water",
    }

    print("Welcome to the PC Hardware!")
    print("Here are some of the items you may view.")
    for hardware in pcHardware:
        print("- " + hardware)
    

    def getAndDisplayHardware():
        selected_item = input("Select an item to view more about it: ")

        if selected_item in pcHardware:
            detail = pcHardware[selected_item]
            print(f"{selected_item} is/are: {detail}")
            getAndDisplayHardware()
        else:
            print("Sorry, that item is not in our dictionary.")
            getAndDisplayHardware()

    getAndDisplayHardware()

    #Add quit/exit function maybe???

#Program Start
main()