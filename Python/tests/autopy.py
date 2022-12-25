import pyautogui, time

#1600, 830

print("start")

auto = pyautogui

time.sleep(5)

auto.moveTo(1600,830)

for i in range(2000):
    position = pyautogui.position()
    if(position.x == 1600):
        auto.moveTo(x=1600,y=830)
        auto.scroll(-800)
        # time.sleep(.300)
        auto.click()
print("ended")