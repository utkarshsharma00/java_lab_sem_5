// throw demonstration

class Test
{
  static void avg()
  {
    try
    {
      throw new ArithmeticException("demo");
    }
    catch(ArithmeticException e)
    {
      System.out.println("Exception caught");
    }
 }

 public static void main(String args[])
 {
    avg();
 }
}


// throws demonstration

class Test
{
  static void check() throws ArithmeticException
  {  
    System.out.println("Inside check function");
    throw new ArithmeticException("demo");
  }

  public static void main(String args[])
  {
    try
    {
      check();
    }
    catch(ArithmeticException e)
    {
      System.out.println("caught" + e);
    }
  }
}


// finally demonstration

Class ExceptionTest
{
  public static void main(String[] args)
  {
    int a[] = new int[2];
    System.out.println("out of try");
    try
    {
      System.out.println("Access invalid element"+ a[3]);
      /* the above statement will throw ArrayIndexOutOfBoundException */
    }
    finally
    {
      System.out.println("finally is always executed.");
    }
  }
}

