import calendar
from time import gmtime, strftime
import random, string, time, datetime

Numbs = 100
str_val = '{}'.format(Numbs)

# print('numers ', str_val, ' values ', len(str_val))
counter = 0
zeros = ""
timed = strftime("%d %b %Y %H %M %S", gmtime())
filename = ("Python/tests/"+timed + (" linear_licenses.txt"))
file = open(filename, "w")

for i in range(9999999):
    zeros = ""
    counter += 1
    str_num = '{}'.format(counter)
    need_zero = 36 - len(str_num)
    for i in range(need_zero):
        zeros += "0"
    lic = (zeros + str_num)
    file.write(lic)
    file.write("\n")

    #print(need_zero, "zeros " + zeros + str_num)

# lic = "000000000000000000000000000000000000"
#   