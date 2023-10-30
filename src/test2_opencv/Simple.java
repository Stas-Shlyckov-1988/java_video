package test2_opencv;

//import javax.swing.JFrame;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;


public class Simple {
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	public static void main(String[] args) {
		 
		Mat img = Imgcodecs.imread("C:/Users/stass/eclipse-workspace/test2_opencv/src/i.jpeg", 
				 Imgcodecs.IMREAD_GRAYSCALE); 
		if (img.empty()) { 
		 System.out.println("Не удалось загрузить изображение"); 
		 return; 
		} 
		System.out.println(img.width()); 
		System.out.println(img.height()); 
		System.out.println(CvType.typeToString(img.type())); 
		System.out.println(img.channels()); 
		
		boolean st = Imgcodecs.imwrite("C:/Users/stass/eclipse-workspace/test2_opencv/src/foto1.jpeg", img); 
		if (!st) { 
		 System.out.println("Не удалось сохранить изображение"); 
		} 

	}
}