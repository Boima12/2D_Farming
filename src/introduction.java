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
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;

public class introduction {
	public void scene1(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(21, 10, 880, 359);
		
		
        
		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(192, 192, 192));
		lb1.setBounds(10, 10, 870, 219);
		lb1.setIcon(new ImageIcon(new ImageIcon(introduction.class.getResource("/images/Nhau.jpeg")).getImage().getScaledInstance(lb1.getSize().width, lb1.getSize().height, Image.SCALE_SMOOTH)));
		panel.add(lb1);
		
		JTextArea txtrTrongBui = new JTextArea();
		txtrTrongBui.setOpaque(false);
		txtrTrongBui.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrTrongBui.setText("Trong 1 buổi nhậu , bạn uống 5 lon bia trong 1 quãng thời gian ngắn\r\n\r\nsau đó bạn cảm thấy người say như điếu đổ, bạn ngồi đó, từ từ khép 2 đôi mắt nặng trĩu của bạn lại...");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
              
        
        
        JButton closeButton = new JButton("ok");
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
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("zzz");
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("zzzzz");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("BÙM");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("Bạn tỉnh giấc!");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("NGƯỜI BÍ ẨN: chà ngươi đã tỉnh dậy rồi sao!.");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("Bạn: Ngươi, NGƯƠI LÀ AI!");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("NGƯỜI BÍ ẨN: ta là ai không quan trọng , điều quan trọng ở đây là NGƯƠI, mắc nợ ta 9 kiếp rồi mà chưa chịu trả");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("Bạn: hả?");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
	
	public void scene99(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "", true);

		JPanel panel = new JPanel(null);
		panel.setBounds(0, 0, 1920, 1080);

		try {
			String sc = (new File(".").getCanonicalPath()) + "/src/images/anh1.jpg";
			
			JLabel lb3 = new JLabel("");
			lb3.setBounds(0, 0, 1920, 1080);
			lb3.setIcon(new ImageIcon(new ImageIcon(sc).getImage().getScaledInstance(lb3.getSize().width, lb3.getSize().height, Image.SCALE_SMOOTH)));

			panel.add(lb3);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(panel);

        // Set dialog properties
        dialog.setSize(1920, 1080);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
	}
	
	public void scene11(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("NGƯỜI BÍ ẨN: bây giờ ta sẽ cho ngươi 10$, đô la USA xịn xò con bò luôn !");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("Bạn: Thiệt không?");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
	
	public void scene13(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("NGƯỜI BÍ ẨN: thiệt, đổi lại ngươi sẽ nợ ta 10000$ !!!");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
	
	public void scene14(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("Bạn: NANI !!!");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
	
	public void scene15(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "NGƯỜI BÍ ẨN ???", true);

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
		txtrTrongBui.setText("NGƯỜI BÍ ẨN: Được rồi, bây giờ hãy ĐI RA NGOÀI ĐỒNG VÀ LÀM VIỆC CHO TA, ta ngồi chờ ở trong này, ta giao nhiệm vụ cho ngươi là kiếm 10000$ và trả lại cho ta :D");
		txtrTrongBui.setWrapStyleWord(true);
		txtrTrongBui.setLineWrap(true);
		txtrTrongBui.setEditable(false);
		txtrTrongBui.setBounds(10, 244, 815, 105);
		panel.add(txtrTrongBui);
        
        JButton closeButton = new JButton("ok");
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
