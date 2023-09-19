import tkinter as tk

root = tk.Tk()
root.title('Lets do math')
canvas1 = tk.Canvas(root, width=400, height=300, relief='raised')
canvas1.pack()

label1 = tk.Label(root, text='Convert Hours to Minutes')
label1.config(font=('helvetica', 18))
canvas1.create_window(200, 25, window=label1)
label5 = tk.Label(root, text="""
I am not sure why you could not just do 
this on your phone, but here we go.
""")
label5.config(font=('helvetica', 14))
canvas1.create_window(200, 70, window=label5)

label2 = tk.Label(root, text='Enter your hours: ')
label2.config(font=('helvetica', 14))
canvas1.create_window(200, 115, window=label2)

entry1 = tk.Entry(root)
canvas1.create_window(200, 140, window=entry1)


def get_math():
    x1 = entry1.get()

    label3 = tk.Label(root, text=f'{x1} x 60 = ', font=('helvetica', 10))
    canvas1.create_window(200, 210, window=label3)

    label4 = tk.Label(root, text=f'{float(x1) * float(60.0)} minutes', font=('helvetica', 10, 'bold'))
    canvas1.create_window(200, 230, window=label4)


button1 = tk.Button(text='Do math for me', command=get_math, bg='blue', fg='black',
                    font=('helvetica', 14, 'bold'))
canvas1.create_window(200, 180, window=button1)

root.mainloop()