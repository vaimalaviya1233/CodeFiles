import random
import string

# for i in range(10):
#     print(random.random()*4)

# def gen_license():
#     return 4 * random.random() + 3

# for i in range(10):
#     print(random.uniform(3,7))
outcome = ["".join(string.ascii_uppercase).join(string.digits)]
ara = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9']
# print(''.join(string.ascii_uppercase))
# print(''.join(string.digits))

# print(random.choice(outcome))
# XXXX-XXXX-XXXX-XXXX-XXXX-XXXX
x = ""
for i in range(24):
    x += random.choice(ara)
    if(len(x) == 24):
        print(x)

#111111 - 22222 - 33333 - 44444 - 55555 - 66666 - 77777
#123456 - 12345 - 12345 - 12345 - 12345 - 12345 - 12345

def gen_license():
    ara = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9']
    x = ""
    for i in range(24):
        x += random.choice(ara)
        if(len(x) == 24):
            print(x)
    return x




# print(outcome)

# outcome = ['rock','paper','scissors']

# for i in range(20):
    # print(random.choices(outcome))


# for i in range(20):
#     print(random.randint(1,6))
