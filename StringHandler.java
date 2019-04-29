public class StringHandler {
  public StringHandler() {}
  
  public static String[] trim(String[] paramArrayOfString) { String[] arrayOfString1 = new String[paramArrayOfString.length];
    int i = 0;
    for (String str1 : paramArrayOfString) {
      String str2 = str1.trim();
      arrayOfString1[(i++)] = str2;
    }
    return arrayOfString1;
  }
  
  public static String getStringFromArrayTrimmed(int paramInt, String paramString) { String[] arrayOfString = paramString.split(",");
    return arrayOfString[paramInt].trim();
  }
}
