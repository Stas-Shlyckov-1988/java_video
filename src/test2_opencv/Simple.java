package test2_opencv;

import javax.swing.JFrame;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point3;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc; 

public class Simple {

	public static void main(String[] args) {
		 System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		 Mat m = Imgcodecs.imread("./i.jpeg");
		 System.out.println("Welcome to opencv" + Core.VERSION);
		 System.out.println(Core.VERSION_MAJOR); // 3 
		 System.out.println(Core.VERSION_MINOR); // 3 
		 System.out.println(Core.VERSION_REVISION); // 0 
		 System.out.println(Core.NATIVE_LIBRARY_NAME); // opencv_java330 

		 System.out.println("Point 3D"); 
		 Point3 p = new Point3(); 
		 System.out.println(p); // {0.0, 0.0, 0.0} 
		 System.out.println(p.x + " " + p.y + " " + p.z); // 0.0 0.0 0.0 
		 p.x = 20.0; 
		 p.y = 3.0; 
		 p.z = 12.0; 
		 System.out.println(p.x + " " + p.y + " " + p.z); // 20.0 3.0 12.0 
		 
		 System.out.println("Point 3D 2");
		 Point3 p2 = new Point3(10.0, 20.0, 30.0); 
		 System.out.println(p2.x + " " + p2.y + " " + p2.z); // 10.0 20.0 30.0 
		 		 
		 int w = 1000, h = 600; 
		 JFrame window = new JFrame("Java load opencv"); 
		 window.setSize(w, h); 
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 
		 window.setLocationRelativeTo(null); 
		 window.setVisible(true); 
	}
}