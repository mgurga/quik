package quik;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class quikIO {
	
	File projectPath;
	
	public quikIO(String mainPath) {
		println(mainPath);
		projectPath = new File(mainPath);
		
	}

	//from phone repo
	public void println(String print) {
		System.out.println(print);
	}
	
	//from phone repo
	public String[] fixListNulls(String[] list, String replaceNullWith) {
        for(int i = 0; i < list.length; i++) {
            if(list[i] == null) {
                list[i] = replaceNullWith;
            }
        }
        return list;
	}
	
	//from phone repo
	public void print2DList(String[][] list2d) {
        int count=0;
        int countMini = 0;
        for(int i = 0; i < list2d.length; i++) {

            System.out.println("[" + count + "]" + "[" + countMini + "] = "  + list2d[count][countMini]);

            if(countMini > 10) {
                count++;
                countMini=-1;
            }

            countMini++;
        }
	}
	
	public JFrame getJFrame() {
		if(quikDraw.windowInitialized) {
			return quikDraw.window;
		} else {
			println("Window has not been initalized yet");
		}
		return quikDraw.window;		
	}
	
	//from phone repo
	public void printList(String[] list) {
        for(int i = 0; i < list.length; i++) {
            if(list[i] == null) {
                list[i] = "null";
            }
            System.out.println(list[i]);
        }
	}
	
	
	public Image imagePath(String path) {
		
		File fileimage = new File(projectPath.toString()+"\\"+path);
		Image image = null;
		try {
			image = ImageIO.read(fileimage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;
	}
	
	public Image imageResize(Image image, int resizex, int resizey) throws IOException {
		
		return image.getScaledInstance(resizex, resizey, Image.SCALE_DEFAULT);
		
	}
	
	@SuppressWarnings("resource")
	public String[] loadTextFile(String path) throws FileNotFoundException {
		
		File inFile = new File(projectPath.toString()+"\\"+path);
		
        FileInputStream is;
        BufferedReader reader;
        final File textFile = new File(String.valueOf(inFile));
        String[] textFileStr = new String[1000];

        if (textFile.exists()) {
            try {
                is = new FileInputStream(textFile);
                reader = new BufferedReader(new InputStreamReader(is));
                String line = "";
                int count = 0;

                while ((line = reader.readLine()) != null) {
                    textFileStr[count] = line;
                    count++;
                }
                
                String[] finalList = new String[count];
                
                for(int i = 0; i < count; i++) {
                	finalList[i] = textFileStr[i];
                }
                
                return finalList;


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
	}
		return null;
	}
	
}
