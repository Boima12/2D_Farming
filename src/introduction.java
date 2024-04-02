import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import images.Img_Giver;

public class introduction extends JFrame {
	
	// chỉnh ảnh thông qua lớp Img_PathGiver cho tiện
	@SuppressWarnings("unused")
	private static Img_Giver imgGiver = new Img_Giver();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					introduction frame = new introduction();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void scene(JFrame parentFrame, JLabel lb_anh, String mota_Frame, String mota, String tieptuc) {
		JDialog dialog = new JDialog(parentFrame, mota_Frame, true);
		
		JPanel pad = new JPanel(null);
		pad.setBounds(0, 0, 880, 430);

		lb_anh.setBackground(new Color(192, 192, 192));
		lb_anh.setBounds(10, 10, 845, 219);
		pad.add(lb_anh);
		
		JTextArea ta_mota = new JTextArea();
		ta_mota.setOpaque(false);
		ta_mota.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ta_mota.setText(mota);
		ta_mota.setWrapStyleWord(true);
		ta_mota.setEditable(false);
		ta_mota.setLineWrap(true);
		ta_mota.setBounds(10, 244, 815, 105);
		pad.add(ta_mota);
        
        JButton bt_tieptuc = new JButton(tieptuc);
        bt_tieptuc.setBounds(373, 359, 85, 21);
        bt_tieptuc.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        pad.add(bt_tieptuc);
		
		
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(pad);

        // Set dialog properties
        dialog.setSize(880, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	
	public void scene99(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(0, 0, 1920, 1080);

		
		JLabel lb3 = new JLabel("");
		lb3.setBounds(0, 0, 1920, 1080);
		lb3.setIcon(new ImageIcon(new ImageIcon(imgGiver.getClass().getResource("anh1.jpg").getPath()).getImage().getScaledInstance(lb3.getSize().width, lb3.getSize().height, Image.SCALE_SMOOTH)));

		panel.add(lb3);
			
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(1920, 1080);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	

	public introduction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 450);
		setResizable(false);
		contentPane = new JPanel(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// nếu muốn xem cấu trúc như thế nào thì gỡ "/* ... */, sử dụng GuiBuilder hoặc Netbean.
		
		/*
		// 4 dòng tiếp theo là tạo và chỉnh trước ở trong Home.java
		String mota = "";
		String tieptuc = "";
		JLabel lb_anh = new JLabel("");
		lb_anh.setBounds(10, 10, 845, 219);
		//
		
		
		JPanel pad = new JPanel(null);
		pad.setBounds(0, 0, 880, 430);

		lb_anh.setBackground(new Color(192, 192, 192));
		lb_anh.setOpaque(true);		// phụ họa
		lb_anh.setBounds(10, 10, 845, 219);
		// lb_anh.setIcon đã được chỉnh trước trong trường hợp này rồi!.
		pad.add(lb_anh);
		
		JTextArea ta_mota = new JTextArea();
		ta_mota.setOpaque(false);
		ta_mota.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ta_mota.setText(mota);
		ta_mota.setWrapStyleWord(true);
		ta_mota.setEditable(false);
		ta_mota.setLineWrap(true);
		ta_mota.setBounds(10, 244, 815, 105);
		pad.add(ta_mota);
        
        JButton bt_tieptuc = new JButton(tieptuc);
        bt_tieptuc.setBounds(373, 359, 85, 21);
        bt_tieptuc.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
//				dialog.dispose(); 	
			}
		});
        pad.add(bt_tieptuc);
        
        contentPane.add(pad);

        */
        
		setContentPane(contentPane);
	}

}