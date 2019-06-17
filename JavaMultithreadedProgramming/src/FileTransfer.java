import java.io.File;
import java.util.regex.Pattern;

public class FileTransfer {
    private static final String UNCONTAIN_DIR = "bin";
    private static final String CONTAIN_JAR = "java";
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("")
		String srcPath = "C:\\Users\\Tina\\OneDrive\\Documents\\"
				+ "\\Java高级开发工程师成长之路\\《Java多线程编程核心技术》源代码（高洪岩）50206\\src\\";
		String dstPath = "E:\\wangxuqin\\JavaMultithreadProgramming\\";
	    File src = new File(srcPath);
	    File dst = new File(dstPath);
	    if (src.isDirectory()) {
	    	File[] fileArr = src.listFiles();
	    	for (File file : fileArr) {
	    		String currentFileName = file.getName();
	    		if (file.isDirectory() && !UNCONTAIN_DIR.equals(currentFileName)) {
	    		    File dstFile = new File(dst, currentFileName);
	    		    if (!dstFile.exists()) {
	    		    	dstFile.mkdir();
	    		    }
	    		}
	    	}
	    }
	}
	public static void transferFile(String srcPath, String dstPath) {
		
	}

}
