import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("static-access")

public class Home_Crop extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private static Home home1;
	private static JLabel Crop_lb;
	
	private JTextField txtDaHu;
	private JTextField txtCTm;
	private JTextField txtCRt;
	private JTextField txtNho;
	private JTextField txtIron;
	private JTextField txtGold;
	private JTextField txtDiamond;
	private JTextField txtYoungBuffallo;
	private JTextField txtSteve;
	private JTextField txtDoraemon;
	private JTextField txtFlorentino;
	private JTextField txtThyHun;
	private JTextField txtAnhBnh;
	private JTextField textField_14;

	public Home_Crop(Home home1, JLabel lb) {
		this.home1 = home1;
		this.Crop_lb = lb;
		
	}
	
	public void Choose_Crop(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "Chọn giống cây trồng", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);
        
		JLabel lb1 = new JLabel("");
		lb1.setBounds(194, 10, 465, 90);
		lb1.setIcon(new ImageIcon(new ImageIcon(Home_Crop.class.getResource("/images/Home_Crop1.jpg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JPanel panel_0 = new JPanel();
		panel_0.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_0.setBounds(10, 122, 261, 45);
		panel.add(panel_0);
		panel_0.setLayout(null);
		
		JTextField txtLaM = new JTextField();
		txtLaM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLaM.setText("Lúa mì - 1$");
		txtLaM.setEditable(false);
		txtLaM.setBounds(10, 10, 180, 25);
		panel_0.add(txtLaM);
		txtLaM.setColumns(10);
		
		JButton btnNewButton = new JButton("ok\r\n");
		btnNewButton.setBounds(193, 10, 58, 25);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(1);
				Crop_lb.setText("Giống cây trồng được chọn: Lúa mì" );
				dialog.dispose();
			}
		});
		panel_0.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 187, 261, 45);
		panel.add(panel_1);
		
		txtDaHu = new JTextField();
		txtDaHu.setText("Dưa hấu - 7$\r\n");
		txtDaHu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDaHu.setEditable(false);
		txtDaHu.setColumns(10);
		txtDaHu.setBounds(10, 10, 180, 25);
		panel_1.add(txtDaHu);
		
		JButton btnNewButton_1 = new JButton("ok\r\n");
		btnNewButton_1.setBounds(193, 10, 58, 25);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(2);
				Crop_lb.setText("Giống cây trồng được chọn: Dưa hấu" );
				dialog.dispose();
			}
		});
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 242, 261, 45);
		panel.add(panel_2);
		
		txtCTm = new JTextField();
		txtCTm.setText("Cà tím - 40$");
		txtCTm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCTm.setEditable(false);
		txtCTm.setColumns(10);
		txtCTm.setBounds(10, 10, 180, 25);
		panel_2.add(txtCTm);
		
		JButton btnNewButton_2 = new JButton("ok\r\n");
		btnNewButton_2.setBounds(193, 10, 58, 25);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(3);
				Crop_lb.setText("Giống cây trồng được chọn: Cà tím" );
				dialog.dispose();
			}
		});
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 302, 261, 45);
		panel.add(panel_3);
		
		txtCRt = new JTextField();
		txtCRt.setText("Cà rốt - 240$");
		txtCRt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCRt.setEditable(false);
		txtCRt.setColumns(10);
		txtCRt.setBounds(10, 10, 180, 25);
		panel_3.add(txtCRt);
		
		JButton btnNewButton_3 = new JButton("ok\r\n");
		btnNewButton_3.setBounds(193, 10, 58, 25);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(4);
				Crop_lb.setText("Giống cây trồng được chọn: Cà Rốt" );
				dialog.dispose();
			}
		});
		panel_3.add(btnNewButton_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 358, 261, 45);
		panel.add(panel_4);
		
		txtNho = new JTextField();
		txtNho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNho.setText("Nho - 1200$\r\n");
		txtNho.setEditable(false);
		txtNho.setColumns(10);
		txtNho.setBounds(10, 10, 180, 25);
		panel_4.add(txtNho);
		
		JButton btnNewButton_4 = new JButton("ok\r\n");
		btnNewButton_4.setBounds(193, 10, 58, 25);
		btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(5);
				Crop_lb.setText("Giống cây trồng được chọn: Nho");
				dialog.dispose();
			}
		});
		panel_4.add(btnNewButton_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_5.setBounds(293, 122, 261, 45);
		panel.add(panel_5);
		
		txtIron = new JTextField();
		txtIron.setText("Iron - 15000$");
		txtIron.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIron.setEditable(false);
		txtIron.setColumns(10);
		txtIron.setBounds(10, 10, 180, 25);
		panel_5.add(txtIron);
		
		JButton btnNewButton_5 = new JButton("ok\r\n");
		btnNewButton_5.setBounds(193, 10, 58, 25);
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(6);
				Crop_lb.setText("Giống cây trồng được chọn: Iron");
				dialog.dispose();
			}
		});
		panel_5.add(btnNewButton_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6.setBounds(293, 187, 261, 45);
		panel.add(panel_6);
		
		txtGold = new JTextField();
		txtGold.setText("Gold - 75000$\r\n");
		txtGold.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtGold.setEditable(false);
		txtGold.setColumns(10);
		txtGold.setBounds(10, 10, 180, 25);
		panel_6.add(txtGold);
		
		JButton btnNewButton_6 = new JButton("ok\r\n");
		btnNewButton_6.setBounds(193, 10, 58, 25);
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(7);
				Crop_lb.setText("Giống cây trồng được chọn: Gold");
				dialog.dispose();
			}
		});
		panel_6.add(btnNewButton_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_7.setBounds(293, 242, 261, 45);
		panel.add(panel_7);
		
		txtDiamond = new JTextField();
		txtDiamond.setText("Diamond - 600,000$");
		txtDiamond.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDiamond.setEditable(false);
		txtDiamond.setColumns(10);
		txtDiamond.setBounds(10, 10, 180, 25);
		panel_7.add(txtDiamond);
		
		JButton btnNewButton_7 = new JButton("ok\r\n");
		btnNewButton_7.setBounds(193, 10, 58, 25);
		btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(8);
				Crop_lb.setText("Giống cây trồng được chọn: Diamond");
				dialog.dispose();
			}
		});
		panel_7.add(btnNewButton_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_8.setBounds(293, 302, 261, 45);
		panel.add(panel_8);
		
		txtYoungBuffallo = new JTextField();
		txtYoungBuffallo.setText("Young Buffallo - 4,200,000$\r\n");
		txtYoungBuffallo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtYoungBuffallo.setEditable(false);
		txtYoungBuffallo.setColumns(10);
		txtYoungBuffallo.setBounds(10, 10, 180, 25);
		panel_8.add(txtYoungBuffallo);
		
		JButton btnNewButton_8 = new JButton("ok\r\n");
		btnNewButton_8.setBounds(193, 10, 58, 25);
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(9);
				Crop_lb.setText("Giống cây trồng được chọn: Young Buffallo");
				dialog.dispose();
			}
		});
		panel_8.add(btnNewButton_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_9.setBounds(293, 358, 261, 45);
		panel.add(panel_9);
		
		txtSteve = new JTextField();
		txtSteve.setText("Steve - 29,400,000$\r\n");
		txtSteve.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtSteve.setEditable(false);
		txtSteve.setColumns(10);
		txtSteve.setBounds(10, 10, 180, 25);
		panel_9.add(txtSteve);
		
		JButton btnNewButton_9 = new JButton("ok\r\n");
		btnNewButton_9.setBounds(193, 10, 58, 25);
		btnNewButton_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(10);
				Crop_lb.setText("Giống cây trồng được chọn: Steve");
				dialog.dispose();
			}
		});
		panel_9.add(btnNewButton_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_10.setBounds(571, 122, 261, 45);
		panel.add(panel_10);
		
		txtDoraemon = new JTextField();
		txtDoraemon.setText("Doraemon - 205,800,000$");
		txtDoraemon.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtDoraemon.setEditable(false);
		txtDoraemon.setColumns(10);
		txtDoraemon.setBounds(10, 10, 180, 25);
		panel_10.add(txtDoraemon);
		
		JButton btnOk = new JButton("ok\r\n");
		btnOk.setBounds(193, 10, 58, 25);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(11);
				Crop_lb.setText("Giống cây trồng được chọn: Doraemon");
				dialog.dispose();
			}
		});
		panel_10.add(btnOk);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_11.setBounds(571, 187, 261, 45);
		panel.add(panel_11);
		
		txtFlorentino = new JTextField();
		txtFlorentino.setText("Florentino - 1,440,600,000$");
		txtFlorentino.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtFlorentino.setEditable(false);
		txtFlorentino.setColumns(10);
		txtFlorentino.setBounds(10, 10, 180, 25);
		panel_11.add(txtFlorentino);
		
		JButton btnOk_1 = new JButton("ok\r\n");
		btnOk_1.setBounds(193, 10, 58, 25);
		btnOk_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(12);
				Crop_lb.setText("Giống cây trồng được chọn: Florentino");
				dialog.dispose();
			}
		});
		panel_11.add(btnOk_1);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_12.setBounds(571, 242, 261, 45);
		panel.add(panel_12);
		
		txtThyHun = new JTextField();
		txtThyHun.setText("Thầy Huấn - 10,084,200,000$");
		txtThyHun.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtThyHun.setEditable(false);
		txtThyHun.setColumns(10);
		txtThyHun.setBounds(10, 10, 180, 25);
		panel_12.add(txtThyHun);
		
		JButton btnOk_2 = new JButton("ok\r\n");
		btnOk_2.setBounds(193, 10, 58, 25);
		btnOk_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(13);
				Crop_lb.setText("Giống cây trồng được chọn: Thầy Huấn");
				dialog.dispose();
			}
		});
		panel_12.add(btnOk_2);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_13.setBounds(571, 302, 261, 45);
		panel.add(panel_13);
		
		txtAnhBnh = new JTextField();
		txtAnhBnh.setText("Anh Bảnh - 70,589,400,000$");
		txtAnhBnh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtAnhBnh.setEditable(false);
		txtAnhBnh.setColumns(10);
		txtAnhBnh.setBounds(10, 10, 180, 25);
		panel_13.add(txtAnhBnh);
		
		JButton btnOk_3 = new JButton("ok\r\n");
		btnOk_3.setBounds(193, 10, 58, 25);
		btnOk_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(14);
				Crop_lb.setText("Giống cây trồng được chọn: Anh Bảnh");
				dialog.dispose();
			}
		});
		panel_13.add(btnOk_3);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_14.setBounds(571, 358, 261, 45);
		panel.add(panel_14);
		
		textField_14 = new JTextField();
		textField_14.setForeground(new Color(255, 0, 0));
		textField_14.setText("??? - 5,576,562,600,000$");
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(10, 10, 180, 25);
		panel_14.add(textField_14);
		
		JButton btnOk_4 = new JButton("ok\r\n");
		btnOk_4.setBounds(193, 10, 58, 25);
		btnOk_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				home1.setMaCayTrong(15);
				Crop_lb.setText("Giống cây trồng được chọn: kết thúc?.");
				dialog.dispose();
			}
		});
		panel_14.add(btnOk_4);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(950, 500);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
}
