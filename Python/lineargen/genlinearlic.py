import calendar
from time import gmtime, strftime
import random, string, time, datetime


#{# for i in range(10):
#     print(random.random()*4)

# def gen_license():
#     return 4 * random.random() + 3

# for i in range(10):
#     print(random.uniform(3,7))
""" outcome = ["".join(string.ascii_uppercase).join(string.digits)]
ara = ['0','1','2','3','4','5','6','7','8','9']

x = ""
for i in range(24):
    x += random.choice(ara)
    if(len(x) == 24):
        print(x)
 """
#111111 - 22222 - 33333 - 44444 - 55555 - 66666 - 77777
#123456 - 12345 - 12345 - 12345 - 12345 - 12345 - 12345

""" def gen_license():
    ara = ['0','1','2','3','4','5','6','7','8','9']
    x = ""
    for i in range(24):
        x += random.choice(ara)
        if(len(x) == 24):
            print(x)
#    return x """

def gen_license():
    ara = ['0','1','2','3','4','5','6','7','8','9']
    x = ""
    for i in range(36):
        x += random.choice(ara)
        # if(len(x) == 24):
        #     print(x)
    return x

    
#111111 - 22222 - 33333 - 44444 -   55555 - 66666 - 77777
#123456 - 12345 - 12345 - 12345 - 12345 - 12345 - 12345

def saveinfile():
    timed = strftime("%d %b %Y %H %M %S", gmtime())
    filename = ("Python/tests/"+timed + (" linear_licenses.txt"))
    file = open(filename, "w")
    for i in range(10000):
        gen_lic = gen_license()
        # print(gen_lic)
        file.write(gen_lic)
        file.write("\n")
    file.close()

if __name__ == '__main__':
    # print(gen_license())
    saveinfile()
    list  = ["000000000000000000000000000000000000"]




