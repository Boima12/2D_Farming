import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import images.*;

@SuppressWarnings("static-access")

public class Plot_Crop {
	private Plot plot;
	private static Home home;
	
	// chỉnh ảnh thông qua lớp Img_PathGiver cho tiện
	private static Img_Giver imgGiver = new Img_Giver();
	
	public Plot_Crop(Plot plot, Home home) {
		this.plot = plot;
		this.home = home;
	}
	
	public void Crop_TimKiemThongTin(JLabel lb1, JLabel lb2) {
		try {
			String path = new File(".").getCanonicalPath();
		
			if (home.getMaCayTrong() == 0) {
				JOptionPane.showMessageDialog(null, ":3", "xin hãy chọn loại hạt giống trước!", JOptionPane.PLAIN_MESSAGE);
				
				return;
			} else if (home.getMaCayTrong() == 1) {
				imgGiver.img1_y(lb1);
				imgGiver.img1_g(lb2);
				plot.setThoiGianTrong(7);
				plot.setTienVon(1);
				plot.setTienThuHoach(2);
				
				return;
			} else if (home.getMaCayTrong() == 2) {
				imgGiver.img2_y(lb1);
				imgGiver.img2_g(lb2);
				plot.setThoiGianTrong(10);
				plot.setTienVon(7);
				plot.setTienThuHoach(11);
				
				return;
			} else if (home.getMaCayTrong() == 3) {
				imgGiver.img3_y(lb1);
				imgGiver.img3_g(lb2);
				plot.setThoiGianTrong(11);
				plot.setTienVon(40);
				plot.setTienThuHoach(60);
				
				return;
			} else if (home.getMaCayTrong() == 4) {
				imgGiver.img4_y(lb1);
				imgGiver.img4_g(lb2);
				plot.setThoiGianTrong(12);
				plot.setTienVon(240);
				plot.setTienThuHoach(360);
				
				return;
			} else if (home.getMaCayTrong() == 5) {
				imgGiver.img5_y(lb1);
				imgGiver.img5_g(lb2);
				plot.setThoiGianTrong(15);
				plot.setTienVon(1200);
				plot.setTienThuHoach(1800);
				
				return;
			} else if (home.getMaCayTrong() == 6) {
				imgGiver.img6_y(lb1);
				imgGiver.img6_g(lb2);
				plot.setThoiGianTrong(16);
				plot.setTienVon(15000);
				plot.setTienThuHoach(22500);
				
				return;
			} else if (home.getMaCayTrong() == 7) {
				imgGiver.img7_y(lb1);
				imgGiver.img7_g(lb2);
				plot.setThoiGianTrong(16);
				plot.setTienVon(75000);
				plot.setTienThuHoach(112500);
				
				return;
			} else if (home.getMaCayTrong() == 8) {
				imgGiver.img8_y(lb1);
				imgGiver.img8_g(lb2);
				plot.setThoiGianTrong(16);
				plot.setTienVon(600000);
				plot.setTienThuHoach(900000);
				
				return;
			} else if (home.getMaCayTrong() == 9) {
				imgGiver.img9_y(lb1);
				imgGiver.img9_g(lb2);
				plot.setThoiGianTrong(17);
				plot.setTienVon(4200000);
				plot.setTienThuHoach(6300000);
				
				return;
			} else if (home.getMaCayTrong() == 10) {
				imgGiver.img10_y(lb1);
				imgGiver.img10_g(lb2);
				plot.setThoiGianTrong(17);
				plot.setTienVon(29400000);
				plot.setTienThuHoach(44100000);
				
				return;
			} else if (home.getMaCayTrong() == 11) {
				imgGiver.img11_y(lb1);
				imgGiver.img11_g(lb2);
				plot.setThoiGianTrong(18);
				plot.setTienVon(205800000);
				plot.setTienThuHoach(308700000);
				
				return;
			} else if (home.getMaCayTrong() == 12) {
				imgGiver.img12_y(lb1);
				imgGiver.img12_g(lb2);
				plot.setThoiGianTrong(18);
				plot.setTienVon(1440600000);
				plot.setTienThuHoach(2160900000L);
				
				return;
			} else if (home.getMaCayTrong() == 13) {
				imgGiver.img13_y(lb1);
				imgGiver.img13_g(lb2);
				plot.setThoiGianTrong(19);
				plot.setTienVon(10084200000L);
				plot.setTienThuHoach(15126300000L);
				
				return;
			} else if (home.getMaCayTrong() == 14) {
				imgGiver.img14_y(lb1);
				imgGiver.img14_g(lb2);
				plot.setThoiGianTrong(19);
				plot.setTienVon(70589400000L);
				plot.setTienThuHoach(105884100000L);
				
				return;
			} else if (home.getMaCayTrong() == 15) {
				imgGiver.img15_y(lb1);
				imgGiver.img15_g(lb2);
				plot.setThoiGianTrong(100);
				plot.setTienVon(5576562600000L);
				plot.setTienThuHoach(8364843900000L);
				return;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}