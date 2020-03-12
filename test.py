from tkinter import *
from tkinter import messagebox
import os

root = Tk()
   

def _openFile():
    addopt=',Cmd = -nac \"-authid:' + str.get() + '"'
    #addopt=" -ssh 172.29.100.120 -l root -pw " + str.get()
    filepath="C:\Program Files\TILON\DstationClient\LinkerSSO.exe" + addopt
    #filepath="C:\\Users\seo\Downloads\putty.exe" + addopt
    #filepath="C:\\Users\seo\Downloads\putty.exe"  + ' ' + str.get()
    
    #filepath="C:\\Users\seo\Downloads\putty.exe "
    messagebox.showinfo("실행결과", filepath)
    os.system(filepath) # 외부프로그램 실행


root.title("지니언스 인증")
root.geometry("400x100+1000+500") # + 부터는 실행화면 위치
lbl = Label(root, text="아이디")
lbl.pack()

str = StringVar() # 문자열 받을 준비를 해줘야함
txt = Entry(root, textvariable=str)
txt.pack()
 
btn = Button(root, text="OK",command = _openFile)
btn.pack()



root.mainloop()