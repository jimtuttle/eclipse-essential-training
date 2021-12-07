import rps
import random

player_choice = input("Enter rock/paper/scissors...\n")
computer_choice = random.choice(rps.choices)

if player_choice not in rps.choices:
    print("invalid choice! you lose!")
    exit()
    
winner = rps.get_winner(player_choice, computer_choice)
print("player picked " + player_choice + ", and computer picked " + computer_choice + "\nwinner: " + winner + "!")