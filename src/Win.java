import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import images.Img_Giver;

public class Win extends JFrame {
	
	// chỉnh ảnh thông qua lớp Img_PathGiver cho tiện
	@SuppressWarnings("unused")
	private static Img_Giver imgGiver = new Img_Giver();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Win frame = new Win();
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
	

	public Win() {
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