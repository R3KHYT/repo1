import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

public class ReaderUtils {

	public ReaderUtils() {
		// TODO Auto-generated constructor stub

	}

	private String convertBufferedReaderToString(BufferedReader rd)
			throws IOException {
		// TODO Auto-generated method stub
		StringBuffer result = new StringBuffer();
		String line;
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		rd.close();

		return result.toString();
	}
}
