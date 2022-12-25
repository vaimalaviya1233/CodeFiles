import string, time 



if __name__ == '__main__':
    nums = "000000000000000000000000000000000000"
    print(nums)
    formatte = int(nums)
    formattr = ""+str(formatte)
    number_of_zeros = 35
    formattr.rjust(number_of_zeros + len(formattr),'0')
    print(formatte)
    print(formattr)
