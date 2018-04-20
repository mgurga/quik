package quik;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;

import javax.imageio.ImageIO;

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
	
	public String[] loadTextFile(String path) throws FileNotFoundException {
		return null;
	}
	
}
