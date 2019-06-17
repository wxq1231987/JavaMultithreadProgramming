import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTransfer {
    private static final String BIN_DIR = "bin";
    private static final String SETTINGS_DIR = ".settings";
    private static final String CONTAIN_JAR = "java";
    private static String srcPath = "C:\\Users\\Tina\\OneDrive\\Documents\\"
					+ "\\Java高级开发工程师成长之路\\《Java多线程编程核心技术》源代码（高洪岩）50206\\src\\";
    private static String dstPath = "E:\\wangxuqin\\JavaMultithreadProgramming\\";
	public static void main(String[] args) throws IOException {
		File src = new File(srcPath);
	    File dst = new File(dstPath);
	    transferFile(src, dst);
	}
	public static void transferFile(File src, File dst) throws IOException {
		String currentFileName = src.getName();
	    if (src.isDirectory() && !BIN_DIR.equals(currentFileName) && !SETTINGS_DIR.equals(currentFileName)) {
	    	dst = new File(dst, currentFileName);
	    	if (!dst.exists()) {
	    		dst.mkdir();
		    }
	    	File[] files = src.listFiles();
	    	for (File file : files) {
	    		transferFile(file, dst);
	    	}
	    } else if (currentFileName.endsWith(CONTAIN_JAR)){
	    	dst = new File(dst, src.getName());
	    	if (!dst.exists()) {
	    		dst.createNewFile();
	    	}
	    	FileInputStream fis = new FileInputStream(src);
	    	FileOutputStream fos = new FileOutputStream(dst);
	    	BufferedInputStream bis = new BufferedInputStream(fis);
	    	BufferedOutputStream bos = new BufferedOutputStream(fos);
	    	byte[] buf = new byte[1024];
	    	int readLength = -1;
	    	while ((readLength = bis.read(buf)) != -1) {
	    		bos.write(buf, 0, readLength);
	    		bos.flush();
	    	}
	    	bis.close();
	    	bos.close();
	    	fos.close();
	    	fis.close();
	    }
	}

}
