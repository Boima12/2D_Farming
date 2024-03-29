import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

@SuppressWarnings("static-access")

public class Plot_Crop {
	private Plot plot;
	private static Home home;
	
	public Plot_Crop(Plot plot, Home home) {
		this.plot = plot;
		this.home = home;
	}
	
	public void Crop_TimKiemThongTin() {
		try {
			String path = new File(".").getCanonicalPath();
		
			if (home.getMaCayTrong() == 0) {
				JOptionPane.showMessageDialog(null, ":3", "xin hãy chọn loại hạt giống trước!", JOptionPane.PLAIN_MESSAGE);
				
				return;
			} else if (home.getMaCayTrong() == 1) {
				plot.setImgPath1(path + "/src/images/1_y.jpeg");
				plot.setImgPath2(path + "/src/images/1_g.jpeg");
				plot.setThoiGianTrong(7);
				plot.setTienVon(1);
				plot.setTienThuHoach(2);
				
				return;
			} else if (home.getMaCayTrong() == 2) {
				plot.setImgPath1(path + "/src/images/2_y.jpeg");
				plot.setImgPath2(path + "/src/images/2_g.jpeg");
				plot.setThoiGianTrong(10);
				plot.setTienVon(7);
				plot.setTienThuHoach(11);
				
				return;
			} else if (home.getMaCayTrong() == 3) {
				plot.setImgPath1(path + "/src/images/3_y.jpeg");
				plot.setImgPath2(path + "/src/images/3_g.jpeg");
				plot.setThoiGianTrong(11);
				plot.setTienVon(40);
				plot.setTienThuHoach(60);
				
				return;
			} else if (home.getMaCayTrong() == 4) {
				plot.setImgPath1(path + "/src/images/4_y.jpeg");
				plot.setImgPath2(path + "/src/images/4_g.jpeg");
				plot.setThoiGianTrong(12);
				plot.setTienVon(240);
				plot.setTienThuHoach(360);
				
				return;
			} else if (home.getMaCayTrong() == 5) {
				plot.setImgPath1(path + "/src/images/5_y.jpeg");
				plot.setImgPath2(path + "/src/images/5_g.jpeg");
				plot.setThoiGianTrong(15);
				plot.setTienVon(1200);
				plot.setTienThuHoach(1800);
				
				return;
			} else if (home.getMaCayTrong() == 6) {
				plot.setImgPath1(path + "/src/images/6_y.jpeg");
				plot.setImgPath2(path + "/src/images/6_g.png");
				plot.setThoiGianTrong(16);
				plot.setTienVon(15000);
				plot.setTienThuHoach(22500);
				
				return;
			} else if (home.getMaCayTrong() == 7) {
				plot.setImgPath1(path + "/src/images/7_y.jpeg");
				plot.setImgPath2(path + "/src/images/7_g.png");
				plot.setThoiGianTrong(16);
				plot.setTienVon(75000);
				plot.setTienThuHoach(112500);
				
				return;
			} else if (home.getMaCayTrong() == 8) {
				plot.setImgPath1(path + "/src/images/8_y.jpeg");
				plot.setImgPath2(path + "/src/images/8_g.jpeg");
				plot.setThoiGianTrong(16);
				plot.setTienVon(600000);
				plot.setTienThuHoach(900000);
				
				return;
			} else if (home.getMaCayTrong() == 9) {
				plot.setImgPath1(path + "/src/images/9_y.jpeg");
				plot.setImgPath2(path + "/src/images/9_g.jpeg");
				plot.setThoiGianTrong(17);
				plot.setTienVon(4200000);
				plot.setTienThuHoach(6300000);
				
				return;
			} else if (home.getMaCayTrong() == 10) {
				plot.setImgPath1(path + "/src/images/10_y.jpeg");
				plot.setImgPath2(path + "/src/images/10_g.jpeg");
				plot.setThoiGianTrong(17);
				plot.setTienVon(29400000);
				plot.setTienThuHoach(44100000);
				
				return;
			} else if (home.getMaCayTrong() == 11) {
				plot.setImgPath1(path + "/src/images/11_y.jpeg");
				plot.setImgPath2(path + "/src/images/11_g.jpeg");
				plot.setThoiGianTrong(18);
				plot.setTienVon(205800000);
				plot.setTienThuHoach(308700000);
				
				return;
			} else if (home.getMaCayTrong() == 12) {
				plot.setImgPath1(path + "/src/images/12_y.jpeg");
				plot.setImgPath2(path + "/src/images/12_g.png");
				plot.setThoiGianTrong(18);
				plot.setTienVon(1440600000);
				plot.setTienThuHoach(2160900000L);
				
				return;
			} else if (home.getMaCayTrong() == 13) {
				plot.setImgPath1(path + "/src/images/13_y.jpeg");
				plot.setImgPath2(path + "/src/images/13_g.jpg");
				plot.setThoiGianTrong(19);
				plot.setTienVon(10084200000L);
				plot.setTienThuHoach(15126300000L);
				
				return;
			} else if (home.getMaCayTrong() == 14) {
				plot.setImgPath1(path + "/src/images/14_y.jpeg");
				plot.setImgPath2(path + "/src/images/14_g.jpeg");
				plot.setThoiGianTrong(19);
				plot.setTienVon(70589400000L);
				plot.setTienThuHoach(105884100000L);
				
				return;
			} else if (home.getMaCayTrong() == 15) {
				plot.setImgPath1(path + "/src/images/15_y.jpeg");
				plot.setImgPath2(path + "/src/images/15_g.jpg");
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