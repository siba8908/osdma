package com.sunjray.osdma.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

import javax.imageio.ImageIO;

import sun.misc.BASE64Decoder;

@SuppressWarnings("restriction")
public class CommonUtil {

	public static String fetchTimeInMilliSeconds() {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("NPT"));
		return String.valueOf(cal.getTimeInMillis());
	}

	public static File convertBS64ImgToFile(String profilePic, String path) {
		try {
			String imageFileName = path + "temp.png";
			File file = new File(imageFileName);
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] decodedBytes = decoder.decodeBuffer(profilePic);
			BufferedImage image = ImageIO.read(new ByteArrayInputStream(decodedBytes));
			ImageIO.write(image, "png", file);
			file.deleteOnExit();
			return file;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
