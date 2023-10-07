package test2_opencv;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;

import org.opencv.core.Point3; 

public class Simple {

	public static void main(String[] args) {
		 System.out.println("Welcome to opencv" + Core.VERSION);
		 System.out.println(Core.VERSION_MAJOR); // 3 
		 System.out.println(Core.VERSION_MINOR); // 3 
		 System.out.println(Core.VERSION_REVISION); // 0 
		 System.out.println(Core.NATIVE_LIBRARY_NAME); // opencv_java330 
		 //System.out.println(Core.getBuildInformation()); 
		 //Mat mat = Mat.eye( 3, 3, CvType.CV_8UC1 );
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
		 
		 
		
	}
}