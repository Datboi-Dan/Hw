class ArrayPractice
{

  public boolean has23(int[] nums) 
  {
    
    for (int i = 0; i < nums.length; i++)
    {
      
      if (nums[i] == 2 || nums[i] == 3)
        return true;
      
    }
    
    return false;
    
  }


  /**
   * Literally just the same thing as the last one except with booleans switched man.
   */
  public boolean no23(int[] nums) 
  {
    
    for (int i = 0; i < nums.length; i++)
    {
      
      if (nums[i] == 2 || nums[i] == 3)
        return false;
      
    }
    
    return true;
    
  }


  public int[] makeLast(int[] nums) 
  {
    
    int[] newArray = new int[nums.length * 2];
    
    newArray[newArray.length - 1] = nums[nums.length - 1];
    
    return newArray;
    
  }


  public boolean double23(int[] nums) 
  {
    
    int twoCounter = 0;
    int threeCounter = 0;
    for (int i = 0; i < nums.length; i++)
    {
      
      switch(nums[i])
      {
        
        case 2:
          twoCounter++;
          break;
          
        case 3:
          threeCounter++;
          break;
        
      }
      
    }
    
    if (twoCounter > 1 || threeCounter > 1)
    {
      
      return true;
      
    }
    
    return false;
  
  }


  /**
   * I don't really wanna make a copy.
   */ 
  public int[] fix23(int[] nums) 
  {
    
    for (int i = 0; i < nums.length - 1; i++)
    {
      
      if (nums[i] == 2 && nums[i + 1] == 3)
        nums[i + 1] = 0;
      
    }
    
    return nums;
    
  }


  /**
   * I didn't really like the length checks ngl.
   */
  public int start1(int[] a, int[] b) 
  {
    
    int counter = 0;
    
    if (a.length > 0 && a[0] == 1)
      counter++;
      
    if (b.length > 0 && b[0] == 1)
      counter++;
      
    return counter;
    
  }


  /**
   * I was lazy.
   */
  public int[] biggerTwo(int[] a, int[] b) 
  {
    
    int asum = a[0] + a[1];
    
    int bsum = b[0] + b[1];
    
    if (asum >= bsum)
      return a;
      
    return b;
    
  }


  /**
   * One line gaming.
   */
  public int[] makeMiddle(int[] nums) 
  {
    
    return new int[] {nums[nums.length / 2 - 1], nums[nums.length / 2]};
    
  }


  /**
   * More one line gaming.
   */
  public int[] plusTwo(int[] a, int[] b) 
  {
    
    return new int[] {a[0], a[1], b[0], b[1]};
    
  }


  public int[] swapEnds(int[] nums) 
  {
    
    int[] newArray = nums;
    
    int temp = newArray[0];
    
    newArray[0] = newArray[newArray.length - 1];
    
    newArray[newArray.length - 1] = temp;
    
    return newArray;
    
  }


  /**
   * Still lazy.
   */
  public int[] midThree(int[] nums) 
  {
    
    int mid = nums.length / 2;
    
    return new int[] {nums[mid - 1], nums[mid], nums[mid + 1]};
    
  }


  /**
   * I didn't wanna use a lot of logic.
   */
  public int maxTriple(int[] nums) 
  {
    
    int[] values = {nums[0], nums[nums.length / 2], nums[nums.length - 1]};
    
    int returnValue = nums[0];
    
    for (int i = 0; i < 3; i++)
    {
      
      if (returnValue < values[i])
      {
        
        returnValue = values[i];
        
      }
      
    }
    
    return returnValue;
    
  }


  public int[] frontPiece(int[] nums) 
  {
    
    if (nums.length < 2)
      return nums;
    else
      return new int[] {nums[0], nums[1]};
    
  }


  /**
   * This is a really bad solution, even I must admit.
   */
  public boolean unlucky1(int[] nums) 
  {
    
    if (nums.length == 1)
      return false;
    
    boolean unlucky = false;
    
    for (int i = 0; i < nums.length; i++)
    {
      
      if (i < 2 || i == nums.length - 2)
        if (nums[i] == 1 && nums[i + 1] == 3)
          unlucky = true;
      
    }
    
    return unlucky;
    
  }


  /**
   * Seems a little inefficient but that's ok.
   */
  public int[] make2(int[] a, int[] b) 
  {
    
    int[] concatenated = new int[a.length + b.length];
    
    for (int i = 0; i < a.length; i++)
    {
      
      concatenated[i] = a[i];
      
    }
    
    for (int i = 0; i < b.length; i++)
    {
      
      concatenated[a.length + i] = b[i];
      
    }
    
    return new int[] {concatenated[0], concatenated[1]};
    
  }


  /**
   * So why did I think that this way would be easier?
   */
  public int[] front11(int[] a, int[] b) 
  {
    
    if (a.length == 0 && b.length == 0)
      return new int[0];
    
    String concatenated = "";
    
    if (a.length > 0)
      concatenated += a[0];
      
    if (b.length > 0)
      if (concatenated.length() > 0)
        concatenated += "," + b[0];
      else
        concatenated += b[0];
    
    if (concatenated.contains(","))
    {
      
      int commaIndex = concatenated.indexOf(",");
      return new int[] {Integer.parseInt(concatenated.substring(0, commaIndex)), Integer.parseInt(concatenated.substring(commaIndex + 1))};
      
    }
    
    return new int[] {Integer.parseInt(concatenated)};
    
  }



}
