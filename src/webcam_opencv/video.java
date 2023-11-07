package webcam_opencv;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture; 


public class video {
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Просмотр видео"); 
		window.setSize(1000, 900); 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setLocationRelativeTo(null); 
		JLabel label = new JLabel(); 
		window.setContentPane(label); 
		window.setVisible(true); 
		 
		VideoCapture capture = new VideoCapture(0); 
		if (!capture.isOpened()) { 
		 System.out.println("Не удалось открыть видео"); 
		 return; 
		};
		
		Mat frame = new Mat(); 
		BufferedImage img = null; 
		while (capture.read(frame)) { 
		 Imgproc.resize(frame, frame, new Size(900, 900)); 
		 // Здесь можно вставить код обработки кадра 
		 img = CvUtils.MatToBufferedImage(frame); 
		 if (img != null) { 
			 ImageIcon imageIcon = new ImageIcon(img); 
			 label.setIcon(imageIcon); 
			 label.repaint(); 
			 window.pack(); 
		 } 
	     
		 try { 
			 Thread.sleep(10); 
		 } catch (InterruptedException e) {} 
		 } 
		 System.out.println("Выход"); 
		 capture.release(); 	 

	}
}