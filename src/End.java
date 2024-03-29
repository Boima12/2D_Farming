import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class End {
	
	public void scene1(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN.", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/TheDealer.jpg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("NGƯỜI BÍ ẨN: chà hãy nhìn vào ngươi xem...");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("...");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene2(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN.", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/TheDealer.jpg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("NGƯỜI BÍ ẨN: mau đưa cho ta, cái túi đó, TÚI CHỨA TIỀN !!!");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("đưa túi tiền");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene3(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN.", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/TheDealer.jpg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("...");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("...");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene4(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN.", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/TheDealer.jpg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText(".............");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("...");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene5(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN.", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/TheDealer.jpg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("NGƯỜI BÍ ẨN: E Hèm, được rồi...");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("next");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene6(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "MÈO CON !!!", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/cat1.jpeg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("MÈO CON: Nhà ngươi có thể đi...");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("next");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene7(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "MÈO CON !!!", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/cat1.jpeg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("MÈO CON: Mặc dầu...");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("next");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene8(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "MÈO CON !!!", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/cat1.jpeg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("MÈO CON: ...");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("next");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene9(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "MÈO CON !!!", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/cat1.jpeg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("MÈO CON: Ta cứ hi vọng là ngươi sẽ đạt tới hạt giống \"???\" thứ 15 đấy cơ");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("next");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene10(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "MÈO CON !!!", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/cat1.jpeg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("MÈO CON: ...");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("next");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene11(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "MÈO CON !!!", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/cat2.jpeg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("MÈO CON: TA CUỐI CÙNG CŨNG CÓ TIỀN ĐI ĐÁNH BI-DA RỒI, CẢM ƠN NHÀ NGƯƠI NHIỀU !!!");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("NANI!!!");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene12(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "CHÚC MỪNG BẠN ĐÃ CHIẾN THẮNG GAME", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);

		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/white.jpeg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("Người bí ẩn chạy mất tiêu...");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("End.");
        closeButton.setBounds(355, 359, 85, 21);
        closeButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// close the JDialog
				dialog.dispose(); 	
			}
		});
        panel.add(closeButton);
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(900, 450);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
}