package by.vsu;

import io.nayuki.qrcodegen.QrCode;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {
	public static void main(String[] args) {
		QrCode qr = QrCode.encodeText("https://vsu.by/persons/978-68.html", QrCode.Ecc.MEDIUM);
		BufferedImage img = new BufferedImage(qr.size * 10 + 2 * 5, qr.size * 10 + 2 * 5, BufferedImage.TYPE_INT_RGB);
		for(int i = 0; i < img.getHeight(); i++) {
			for(int j = 0; j < img.getWidth(); j++) {
				int color;
				if(
					i >= 5 && i < img.getHeight() - 5 &&
					j >= 5 && j < img.getWidth() - 5 &&
					qr.getModule((i - 5) / 10, (j - 5) / 10)
				) {
					color = Color.BLACK.getRGB();
				} else {
					color = Color.WHITE.getRGB();
				}
				img.setRGB(j, i, color);
			}
		}
		JFrame frame = new JFrame("QR code");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		JLabel label = new JLabel(new ImageIcon(img));
		frame.add(label);
		frame.setVisible(true);
	}
}
