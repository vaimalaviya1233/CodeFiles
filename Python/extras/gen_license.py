import random


def gen_license():
    ara = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9']
    x = ""
    for i in range(24):
        x += random.choice(ara)
        # if(len(x) == 24):
        #     print(x)
    return x

def saveinfile():
    file = open("licenses.txt", "w")
    for i in range(10000):
        gen_lic = gen_license()
        # print(gen_lic)
        file.write(gen_lic)
        file.write("\n")
    file.close()

if __name__ == '__main__':
    # print(gen_license())
    saveinfile()



