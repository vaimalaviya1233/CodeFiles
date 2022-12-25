
import random, pyautogui, time

def gen_lic():
    digits = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    license_gen = ""
    for i in range(36):
        license_gen += random.choice(digits)
    return license_gen


if __name__ == '__main__':
    # print(gen_license())

    a = pyautogui
    for i in range(200):
        #a.confirm('proceed')
        a.moveTo(x=700,y=550)#move to hit enter text area
        time.sleep(1)
        a.click()#active focus on text edit placer
        a.keyDown('ctrl')#select all text
        a.press('a')
        a.keyUp('ctrl')
        a.write(gen_lic())# enter new generated license
        a.moveTo(x=1000,y=670)#move to hit active button
        a.click()# hit the active button
        time.sleep(2)# wait to confirm responce license
        a.moveTo(x=1184,y=599)# move to hit retry button
        a.click()# hit the retry button
        time.sleep(1)#wait for exit


""" list  = ["000000000000000000000000000000000000"]
    list.append("00000000000000000000000000000001")
    print(list)
    print(list[0])
    print("size: " + str(len(list))) """
""" ara = ['0','1','2','3','4','5','6','7','8','9']
    x = ""
    for i in range(36):
        x.join(random.choice(ara))
    print(x) """