package com.main.test;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/**
 * package:com.main.test fine:TestApplet.java author:XSH datetime:2017年6月18日
 * 下午7:55:07
 */
public class TestApplet extends Applet {

	/**
	 * 
	 */

	int width, height;
	Image image;
	Graphics draw;

	public void init() {
		setBackground(Color.BLACK);
		this.setSize(750, 610);
		width = this.getSize().width;
		height = this.getSize().height;
		image = createImage(width, height);
		draw = image.getGraphics();
	}

	public void paint() {
		draw.clearRect(0, 0, width, height);
		draw.setColor(Color.RED);
		int i, j;
		double x, y, r;
		for (i = 0; i <= 90; i++) {
			for (j = 0; j <= 90; j++) {
				r = Math.PI / 45 * i * (1 - Math.sin(Math.PI / 45 * j) * 18);
				x = r * Math.cos(Math.PI / 45 * j) * Math.sin(Math.PI / 45 * i) + width / 2;
				y = -r * Math.sin(Math.PI / 45 * j) + height / 4;
				draw.fillOval((int) x, (int) y, 2, 2);
			}
			draw.drawImage(image, 0, 0, this);

		}
	}

}
