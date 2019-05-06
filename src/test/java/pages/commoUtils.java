package pages;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class commoUtils {
	public static String propertyFilePath = System.getProperty("user.dir")+
            "\\src\\test\\java\\login.properties";
	public static Properties prop;
	public static void main(String[] args) throws FileNotFoundException, IOException {
 prop=new Properties();
prop.load(new FileInputStream(propertyFilePath));
	}

}
##done
