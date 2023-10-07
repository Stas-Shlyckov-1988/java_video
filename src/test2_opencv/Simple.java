package test2_opencv;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;

public class Simple {

	public static void main(String[] args) {
		 System.out.println("Welcome to opencv" + Core.VERSION);
		 System.out.println(Core.VERSION_MAJOR); // 3 
		 System.out.println(Core.VERSION_MINOR); // 3 
		 System.out.println(Core.VERSION_REVISION); // 0 
		 System.out.println(Core.NATIVE_LIBRARY_NAME); // opencv_java330 
		 //System.out.println(Core.getBuildInformation()); 
		 //Mat mat = Mat.eye( 3, 3, CvType.CV_8UC1 );
		
	}
}