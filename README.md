#quik

quik is a library made to make 2D graphics easier to do in java 
<br />
<br />
below are all the methods for all the sub sections of quik:<br /><br />
**quikDraw** <br />
**quikIO**

## quikDraw methods
**setWindow(int width, int height, String windowName)**<br />
{ <br />
**width** - width of the window <br />
**height** - height of window <br />
**windowName** - name of the window you program is in <br />
}
<br />

**drawLine(int x1, int y1, int x2, int y2)**<br />
{ <br />
**x1 and y1** - the starting x and y positions <br />
**x2 and y2** - the ending x and y positions <br />
}
<br />

**drawRect(int x1, int y1, int width, int height)**<br />
{ <br /> 
**x1 and y1** - the starting position of the rectangle <br />
**width** - the width of the rectangle <br />
**height** - the height of the rectangle <br />
}
<br />

**drawImage(Image image, int x, int y)** <br />
{ <br />
**image** - the image you want to put in the window <br />
**x and y** - the x and y position you want to put the image <br />
}
<br />

**backgroundColor(int r, int g, int b)**<br />
{ <br />
**r** - red value of background color <br />
**g** - green value of background color <br />
**b** - blue value of background color <br />
}
<br />

**drawText(String text, int x, int y)**<br />
{ <br />
**text** - string to print in window<br />
**x and y** - x and y position of text<br />
}
<br />
 
**changeFontSize(int size)** <br />
{ <br />
**size** - the font size of the drawText() method <br />
}
<br />

**changeFont(Font newFont)** <br />
{ <br />
**newFont** - the font that will be used when drawText() is called
 <br />
 refer to the library java.awt.Font for more information on 
 <br />
 how to make/import a font. <br />
}
<br /> 

<br />
<br />
##quikIO

**getJFrame()** <br /> { <br />
returns the current jframe
<br />}<br />

**println(String consoleInput)** <br /> { <br />
**consoleInput** - whatever String you want to print to console <br />
}<br />

**printList(String[] list)** <br /> { <br />
**list** - any String list you want to print <br />
}<br />

**print2DList(String[ ][ ] list)** <br /> { <br />
**list** - whatever 2D String Array you want to be printed to console 
<br /> } <br />

**fixListNulls(String[] list, String replaceWith)** 
<br /> { <br />
**list** - any list(with nulls) <br />
**replaceWith** - a string that will replace all nulls in the list
<br /> } <br />












