import calendar
from time import gmtime, strftime
import random, string, time, datetime

#Numbs = 100
#str_val = '{}'.format(Numbs)
# print('numers ', str_val, ' values ', len(str_val))

counter = 454564546235235234234324234324234324
zeros = ""
timed = strftime("%d %b %Y %H %M %S", gmtime())
filename = (""+timed + (" linear_licenses.txt"))
file = open(filename,"w")
sleep_timed = 0

for i in range(999750):
    zeros = ""
    counter += 1
    str_num = '{}'.format(counter)
    need_zero = 36 - len(str_num)
    for i in range(need_zero):
        zeros += "0"
    lic = (zeros + str_num)
    file.write(lic)
    file.write("\n")
    sleep_timed += 1
    if(sleep_timed == 100000):
        print(" Sleeping for ",sleep_timed)
        sleep_timed = 0
        time.sleep(1)
    
print("done done and !!! DONE :)")

    #print(need_zero, "zeros " + zeros + str_num)

# lic = "000000000000000000000000000000000000"
#   
