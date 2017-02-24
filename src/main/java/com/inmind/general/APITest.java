package com.inmind.general;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.IOUtils;

import org.junit.*;
import org.junit.rules.TestName;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * Super class which provide some helper methods to help write API tests
 *
 *
 * @author Jiang Zhaoting
 *
 */
public abstract class APITest {

	 @Rule
	 public TestName testCaseName = new TestName();

	 private static Logger LOGGER = LogManager.getLogger(APITest.class);
	 private static String envfile = "env.properties";
	 private static Properties prop;

	 @BeforeClass
	 public static void setup()
	 {
		 prop = initProperties();
	 }

	 @Before
	 public void printEachCaseName()
	 {
		 LOGGER.info("Test Case Name: " + testCaseName.getMethodName());
	 }

	 /**
	  * Load properties from field {@link envfile} in the classpath
	  *
	  * @return
	  */
	 public static Properties initProperties()
	 {
		 Properties prop = new Properties();


		 try{
			 prop.load(APITest.class.getClassLoader().getResourceAsStream(envfile));
		 }catch(Exception ex){
			 LOGGER.error("Unable to load property file " + envfile);
			 throw new RuntimeException("Unable to load property file " + envfile);

		 }

		 return prop;
	 }

	 /**
	  * Get value based on the key from the properties file
	  *
	  * @param key
	  *        The key defined in the properies file
	  * @return
	  *        The value related to the key
	  */
	 public static String getValue(String key)
	 {
		 prop = initProperties();
		 String value = prop.getProperty(key);
		 Assert.assertNotNull(value, String.format("%s key is missing", key));

		 return value;
	 }

	/**
	 * Load file in the classpath as String
	 *
	 * @param file
	 *        The file in the Classpath
	 * @return
	 *        file contents as String
	 */
	public static String loadFile(String file)
	{
		try{
			InputStream stream = APITest.class.getClassLoader().getResourceAsStream(file);
			return IOUtils.toString(stream);
		}catch(IOException ex){
			ex.printStackTrace();
			throw new RuntimeException("Unable load file " + file);
		}
	}

	/**
	 * Generate a random string with expected length
	 *
	 * @param length
	 *        The length of the expected String
	 * @return
	 *        A randome string with expected length
	 */
	public static String getRandomString(String length)
	{
		String sources = "abcdefghijklmnopqistuvwxyz0123456789ABCDEFGHIJKLMNOPQISTUVWXYZ";
		char[] chars = sources.toCharArray();
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		for(int i = 0; i < Integer.parseInt(length);i++)
		{
			sb.append(chars[rand.nextInt(chars.length)]);
		}

		return sb.toString();
	}



	public static String getEnvfile() {
		return envfile;
	}



	public static void setEnvfile(String envfile) {
		APITest.envfile = envfile;
	}

}
