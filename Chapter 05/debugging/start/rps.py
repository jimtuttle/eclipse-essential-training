choices = ['rock', 'paper', 'scissors']
    
def get_winner(p, c):
    if p == c:
        return "everybody"
    
    lower = min(choices.index(p), choices.index(c))
    higher = max(choices.index(p), choices.index(c))
    
    lower_player = "player"
    higher_player = "commuter"
    if lower == choices.index(c):
        lower_player = "computer"
    if higher == choices.index(p):
        higher_player = "player"
    
    if lower == 0 and higher == 2:
        return lower_player
    else:
        return higher_player