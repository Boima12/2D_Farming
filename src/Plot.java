import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("static-access")

public class Plot {
	private Plot plot;
	private static Home home;
	private static JLabel home_Tien;
	private JLabel Plot_Up;
	private JLabel Plot_Description;
	
	private boolean IsRaising = false;
	private boolean IsGrown = false;
	
	private String imgPath1;
	private String imgPath2;
	private int thoiGianTrong;
	private long tienVon;
	private long tienThuHoach;
	
	public Plot(Home home, JLabel lb1, JLabel lb2, JLabel lb3) {
		this.plot = this;
		this.home = home;
		this.home_Tien = lb3;
		this.Plot_Up = lb1;
		this.Plot_Description = lb2;
		
		MouseAdapter1 MA1 = new MouseAdapter1(); 
		Plot_Up.addMouseListener(MA1);
	}
	
	
	private class MouseAdapter1 extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent evt) {
			// Trồng cây
			if (IsRaising == false) {
				Plot_Crop pc = new Plot_Crop(plot, home);
				pc.Crop_TimKiemThongTin();
				
				// Nếu không có đủ tiền
				if (home.getTienHienTai() < tienVon) {
					JOptionPane.showMessageDialog(null, ":<", "Không có đủ tiền!", JOptionPane.PLAIN_MESSAGE);
					return;
				}
				
				// giai đoạn trồng cây
				IsRaising = true;
				home.setTienHienTai(home.getTienHienTai() - tienVon);
				home_Tien.setText("Tiền của bạn: " + home.getTienHienTai() + "$");
				Plot_Up.setIcon(new ImageIcon(new ImageIcon(imgPath1).getImage().getScaledInstance(Plot_Up.getSize().width, Plot_Up.getSize().height, Image.SCALE_SMOOTH)));
				
				Thread thread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						try {
							Plot_Description.setText(thoiGianTrong + "");
							while (thoiGianTrong > 0) {	
								Thread.sleep(1000);
								thoiGianTrong--;
								Plot_Description.setText(thoiGianTrong + "");
							}
							Plot_Description.setText("sẵn sàng thu hoạch");
							
							// Cây lớn, sẵn sàng để thu hoạch
							IsGrown = true;
							Plot_Up.setIcon(new ImageIcon(new ImageIcon(imgPath2).getImage().getScaledInstance(Plot_Up.getSize().width, Plot_Up.getSize().height, Image.SCALE_SMOOTH)));
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				});
				thread.start();
				
			} else {
				if (IsGrown == true) {
					// khi cây đã lớn, có thể thu hoạch được
					home.setTienHienTai(home.getTienHienTai() + tienThuHoach);
					home_Tien.setText("Tiền của bạn: " + home.getTienHienTai() + "$");
					Plot_Up.setIcon(null);
					Plot_Description.setText("");
					
					IsRaising = false;
					IsGrown = false;
					
					if (tienThuHoach == 8364843900000L) {
						introduction intro3 = new introduction();
						JFrame fr = new JFrame("");
						intro3.scene99(fr);
					}
				}
			}			
		}
	}
	
	public String getImgPath1() {
		return imgPath1;
	}

	public void setImgPath1(String imgPath1) {
		this.imgPath1 = imgPath1;
	}

	public String getImgPath2() {
		return imgPath2;
	}

	public void setImgPath2(String imgPath2) {
		this.imgPath2 = imgPath2;
	}

	public int getThoiGianTrong() {
		return thoiGianTrong;
	}

	public void setThoiGianTrong(int thoiGianTrong) {
		this.thoiGianTrong = thoiGianTrong;
	}

	public long getTienVon() {
		return tienVon;
	}

	public void setTienVon(long tienVon) {
		this.tienVon = tienVon;
	}

	public long getTienThuHoach() {
		return tienThuHoach;
	}

	public void setTienThuHoach(long tienThuHoach) {
		this.tienThuHoach = tienThuHoach;
	}
	
}