package quik;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class quikIO {
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
	public void printList(String[] list, String replaceNullWith) {
        for(int i = 0; i < list.length; i++) {
            if(list[i] == null) {
                list[i] = replaceNullWith;
            }
            System.out.println(list[i]);
        }
	}
	
	
	public Image imagePath(String path) throws IOException {
		
		return ImageIO.read(new File(path));
		
	}
	
	public Image imageResize(Image image, int resizex, int resizey) throws IOException {
		
		return image.getScaledInstance(resizex, resizey, Image.SCALE_DEFAULT);
		
	}
	
}
