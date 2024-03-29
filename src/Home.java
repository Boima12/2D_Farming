// By Boima, coded within 1 day.

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import music.Tracks;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

@SuppressWarnings("static-access")


public class Home extends JFrame {

	private static int maCayTrong = 0;
	private static long tienHienTai = 10;
	private static Home home1;
	private Tracks tracks1;
	
	private static final long serialVersionUID = 1L;
	private JLabel Plot1_anh;
	private JLabel Plot1_lb;
	private JLabel Plot3_anh;
	private JLabel Plot3_lb;
	private JLabel Plot2_anh;
	private JLabel Plot2_lb;
	private JLabel Plot4_anh;
	private JLabel Plot4_lb;
	private JLabel Plot5_anh;
	private JLabel Plot5_lb;
	private JLabel Plot6_anh;
	private JLabel Plot6_lb;
	private JLabel Plot7_lb;
	private JLabel Plot8_anh;
	private JLabel Plot8_lb;
	private JLabel Plot9_anh;
	private JLabel Plot9_lb;
	private JLabel Plot10_anh;
	private JLabel Plot10_lb;
	private static JLabel Home_Tien;
	private static JLabel Home_Crop_lb;
	private JPanel contentPane;
	private JLabel Plot7_anh;
	private JButton Crop;
	private JButton TheDealer;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new Home();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private void Introduction_show(JFrame fr1) {
		introduction intro = new introduction();
		tracks1.song1();
		intro.scene1(fr1);
		intro.scene2(fr1);
		intro.scene3(fr1);
		tracks1.playTrack();
		intro.scene4(fr1);
		intro.scene5(fr1);
		intro.scene6(fr1);
		intro.scene7(fr1);
		intro.scene8(fr1);
		intro.scene9(fr1);
		intro.scene10(fr1);
		intro.scene11(fr1);
		intro.scene12(fr1);
		intro.scene13(fr1);
		intro.scene14(fr1);
		tracks1.stopTrack();
		intro.scene15(fr1);
		tracks1.song2();
		tracks1.playTrack();

	}
	
	private static void ChooseCrop(JFrame fr1) {
		Home_Crop home_crop = new Home_Crop(home1, Home_Crop_lb);
		home_crop.Choose_Crop(fr1);
	}
	
	

	@SuppressWarnings("unused")
	public Home() {
		home1 = this;
		tracks1 = new Tracks();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1500, 800);
		setResizable(false);
		setTitle("Nông trại 2D");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Plot1 = new JPanel();
		Plot1.setBounds(83, 47, 196, 180);
		contentPane.add(Plot1);
		Plot1.setLayout(null);
		
		Plot1_anh = new JLabel("");
		Plot1_anh.setBackground(new Color(192, 192, 192));
		Plot1_anh.setOpaque(true);
		Plot1_anh.setBounds(10, 10, 178, 128);
		Plot1.add(Plot1_anh);
		
		Plot1_lb = new JLabel("");
		Plot1_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Plot1_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Plot1_lb.setBounds(10, 148, 178, 23);
		Plot1.add(Plot1_lb);
		
		JPanel Plot3 = new JPanel();
		Plot3.setLayout(null);
		Plot3.setBounds(631, 47, 196, 180);
		contentPane.add(Plot3);
		
		Plot3_anh = new JLabel("");
		Plot3_anh.setOpaque(true);
		Plot3_anh.setBackground(Color.LIGHT_GRAY);
		Plot3_anh.setBounds(10, 10, 178, 128);
		Plot3.add(Plot3_anh);
		
		Plot3_lb = new JLabel("");
		Plot3_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Plot3_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Plot3_lb.setBounds(10, 148, 178, 23);
		Plot3.add(Plot3_lb);
		
		JPanel Plot2 = new JPanel();
		Plot2.setLayout(null);
		Plot2.setBounds(359, 47, 196, 180);
		contentPane.add(Plot2);
		
		Plot2_anh = new JLabel("");
		Plot2_anh.setOpaque(true);
		Plot2_anh.setBackground(Color.LIGHT_GRAY);
		Plot2_anh.setBounds(10, 10, 178, 128);
		Plot2.add(Plot2_anh);
		
		Plot2_lb = new JLabel("");
		Plot2_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Plot2_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Plot2_lb.setBounds(10, 148, 178, 23);
		Plot2.add(Plot2_lb);
		
		JPanel Plot4 = new JPanel();
		Plot4.setLayout(null);
		Plot4.setBounds(896, 47, 196, 180);
		contentPane.add(Plot4);
		
		Plot4_anh = new JLabel("");
		Plot4_anh.setOpaque(true);
		Plot4_anh.setBackground(Color.LIGHT_GRAY);
		Plot4_anh.setBounds(10, 10, 178, 128);
		Plot4.add(Plot4_anh);
		
		Plot4_lb = new JLabel("");
		Plot4_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Plot4_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Plot4_lb.setBounds(10, 148, 178, 23);
		Plot4.add(Plot4_lb);
		
		JPanel Plot5 = new JPanel();
		Plot5.setLayout(null);
		Plot5.setBounds(1181, 47, 196, 180);
		contentPane.add(Plot5);
		
		Plot5_anh = new JLabel("");
		Plot5_anh.setOpaque(true);
		Plot5_anh.setBackground(Color.LIGHT_GRAY);
		Plot5_anh.setBounds(10, 10, 178, 128);
		Plot5.add(Plot5_anh);
		
		Plot5_lb = new JLabel("");
		Plot5_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Plot5_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Plot5_lb.setBounds(10, 148, 178, 23);
		Plot5.add(Plot5_lb);
		
		JPanel Plot6 = new JPanel();
		Plot6.setLayout(null);
		Plot6.setBounds(83, 273, 196, 180);
		contentPane.add(Plot6);
		
		Plot6_anh = new JLabel("");
		Plot6_anh.setOpaque(true);
		Plot6_anh.setBackground(Color.LIGHT_GRAY);
		Plot6_anh.setBounds(10, 10, 178, 128);
		Plot6.add(Plot6_anh);
		
		Plot6_lb = new JLabel("");
		Plot6_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Plot6_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Plot6_lb.setBounds(10, 148, 178, 23);
		Plot6.add(Plot6_lb);
		
		JPanel Plot7 = new JPanel();
		Plot7.setLayout(null);
		Plot7.setBounds(359, 273, 196, 180);
		contentPane.add(Plot7);
		
		Plot7_anh = new JLabel("");
		Plot7_anh.setOpaque(true);
		Plot7_anh.setBackground(Color.LIGHT_GRAY);
		Plot7_anh.setBounds(10, 10, 178, 128);
		Plot7.add(Plot7_anh);
		
		Plot7_lb = new JLabel("");
		Plot7_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Plot7_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Plot7_lb.setBounds(10, 148, 178, 23);
		Plot7.add(Plot7_lb);
		
		JPanel Plot8 = new JPanel();
		Plot8.setLayout(null);
		Plot8.setBounds(631, 273, 196, 180);
		contentPane.add(Plot8);
		
		Plot8_anh = new JLabel("");
		Plot8_anh.setOpaque(true);
		Plot8_anh.setBackground(Color.LIGHT_GRAY);
		Plot8_anh.setBounds(10, 10, 178, 128);
		Plot8.add(Plot8_anh);
		
		Plot8_lb = new JLabel("");
		Plot8_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Plot8_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Plot8_lb.setBounds(10, 148, 178, 23);
		Plot8.add(Plot8_lb);
		
		JPanel Plot9 = new JPanel();
		Plot9.setLayout(null);
		Plot9.setBounds(896, 273, 196, 180);
		contentPane.add(Plot9);
		
		Plot9_anh = new JLabel("");
		Plot9_anh.setOpaque(true);
		Plot9_anh.setBackground(Color.LIGHT_GRAY);
		Plot9_anh.setBounds(10, 10, 178, 128);
		Plot9.add(Plot9_anh);
		
		Plot9_lb = new JLabel("");
		Plot9_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Plot9_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Plot9_lb.setBounds(10, 148, 178, 23);
		Plot9.add(Plot9_lb);
		
		JPanel Plot10 = new JPanel();
		Plot10.setLayout(null);
		Plot10.setBounds(1181, 273, 196, 180);
		contentPane.add(Plot10);
		
		Plot10_anh = new JLabel("");
		Plot10_anh.setOpaque(true);
		Plot10_anh.setBackground(Color.LIGHT_GRAY);
		Plot10_anh.setBounds(10, 10, 178, 128);
		Plot10.add(Plot10_anh);
		
		Plot10_lb = new JLabel("");
		Plot10_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Plot10_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Plot10_lb.setBounds(10, 148, 178, 23);
		Plot10.add(Plot10_lb);
		
		Home_Tien = new JLabel("Tiền của bạn: 10$");
		Home_Tien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Home_Tien.setHorizontalAlignment(SwingConstants.CENTER);
		Home_Tien.setBounds(332, 620, 859, 29);
		contentPane.add(Home_Tien);
		
		Home_Crop_lb = new JLabel("Giống cây trồng được chọn: None\r\n");
		Home_Crop_lb.setHorizontalAlignment(SwingConstants.CENTER);
		Home_Crop_lb.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Home_Crop_lb.setBounds(332, 651, 859, 29);
		contentPane.add(Home_Crop_lb);
		
		Crop = new JButton("Chọn giống cây");
		Crop.setBounds(10, 625, 250, 63);
		Crop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame fr1 = new JFrame(".");
				ChooseCrop(fr1);
				
			}
		});
		contentPane.add(Crop);
		
		TheDealer = new JButton("NGƯỜI BÍ ẨN\r\n");
		TheDealer.setForeground(new Color(128, 0, 255));
		TheDealer.setBounds(10, 554, 250, 63);
		TheDealer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tienHienTai < 10000) {
					JOptionPane.showMessageDialog(null, ">:(", "10000$, TA BẢO 10000$ !!!!!", JOptionPane.PLAIN_MESSAGE);
					return;
				} else {
					tracks1.stopTrack();
					tracks1.song3();
					tracks1.playTrack();
					
					End end = new End();
					JFrame fr7 = new JFrame("ket thuc");
					
					end.scene1(fr7);
					end.scene2(fr7);
					end.scene3(fr7);
					end.scene4(fr7);
					end.scene5(fr7);
					end.scene6(fr7);
					end.scene7(fr7);
					end.scene8(fr7);
					end.scene9(fr7);
					end.scene10(fr7);
					end.scene11(fr7);
					end.scene12(fr7);
					
					JOptionPane.showMessageDialog(null, "Side Java project bởi: Cao Hoàng Phước Bảo.", "Credits", JOptionPane.PLAIN_MESSAGE);
					System.exit(0);
				}
				
			}
		});
		contentPane.add(TheDealer);
		
		// Introduction
		JFrame IntroFrame = new JFrame("Intro Frame");
		Introduction_show(IntroFrame);
		
		
		// set up for 10 plots
		Plot plot1 = new Plot(home1, Plot1_anh, Plot1_lb, Home_Tien);
		Plot plot2 = new Plot(home1, Plot2_anh, Plot2_lb, Home_Tien);
		Plot plot3 = new Plot(home1, Plot3_anh, Plot3_lb, Home_Tien);
		Plot plot4 = new Plot(home1, Plot4_anh, Plot4_lb, Home_Tien);
		Plot plot5 = new Plot(home1, Plot5_anh, Plot5_lb, Home_Tien);
		Plot plot6 = new Plot(home1, Plot6_anh, Plot6_lb, Home_Tien);
		Plot plot7 = new Plot(home1, Plot7_anh, Plot7_lb, Home_Tien);
		Plot plot8 = new Plot(home1, Plot8_anh, Plot8_lb, Home_Tien);
		Plot plot9 = new Plot(home1, Plot9_anh, Plot9_lb, Home_Tien);
		Plot plot10 = new Plot(home1, Plot10_anh, Plot10_lb, Home_Tien);
	}


	public int getMaCayTrong() {
		return maCayTrong;
	}


	public void setMaCayTrong(int maCayTrong) {
		this.maCayTrong = maCayTrong;
	}


	public static long getTienHienTai() {
		return tienHienTai;
	}


	public static void setTienHienTai(long tienHienTai) {
		Home.tienHienTai = tienHienTai;
	}
}
