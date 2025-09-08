import time 

my_time = int(input("Enter time in seconds: ")) # Get user input for time in seconds

for x in range(my_time,0,-1):  #Count down from user input to 0
    seconds = x % 60 # Calculate second , minutes and hours
    minutes = int(x/60) %60 
    hours = int(x/3600) % 24

    print(f"{hours:02}:{minutes:02}:{seconds:02}") # Format time as HH:MM:SS
    time.sleep(1) # pause for 1 second