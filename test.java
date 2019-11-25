 private  WebDriver driver; 
	  //public WebDriver driver;
	 public  Properties prop;
	  // private static WebElement el;
	   public int shortWait = 3000;
	   public int normalWait = 6000;
	   public int longWait = 10000;
	   public String brower="";
	   private Map<String,Object> map;
	   public Logger log ;
	   protected static ExtentTest test; 
	   
	   public static String browser; 
	   public static String runIn; 
	   
	   public static String hubUrl; 
	   public static String launchUrl;
	   public  String Errormessage="";
	   public UtilLib UtilLib=new UtilLib();
	 // public Object_Definition_Library element = new Object_Definition_Library();
	   
	  public static ExtentTest getTest() {
	  return test;
	 }
	 public static void setTest(ExtentTest test) {
