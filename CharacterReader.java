

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CharacterReader {

	public void readImage() throws IOException {

		BufferedImage image = ImageIO.read(new File("/Users/robert/Desktop/JavaPrograms/AI2/OCRData/0.jpg"));
		byte[][] pixels = new byte[image.getWidth()][];
		System.out.print("new int[] {");
		for (int x = 0; x < image.getWidth(); x++) {
			pixels[x] = new byte[image.getHeight()];

			for (int y = 0; y < image.getHeight(); y++) {
				pixels[x][y] = (byte) (image.getRGB(x, y) == 0xFFFFFFFF ? 0 : 1);
				System.out.print(pixels[x][y]+",");
			}
		}System.out.print("},");
	}
}
