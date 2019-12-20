package lab3;

public final class lab3 {

  public static void main(String[] args) {
    String str = "Hello";
    replace(str);
  }
  public static String replace(String str)
  {
    replace1(str);
    return str;
  }
  private static String replace1(String str)
  {
    StringBuilder res = new StringBuilder(str);
    char str1 = 'k';
    int k = 2;
      if(k>str.length())
      {
        System.out.println("out of length");
      }else
      {
        for(int i=0; i<str.length(); i++)
        {
          res.setCharAt(k, str1);
          
        }
      }
      System.out.println(res);
      return res.toString();
    }
}