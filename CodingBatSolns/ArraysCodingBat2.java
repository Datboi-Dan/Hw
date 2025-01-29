/**
 * A combination of the laziest and dumbest solutions to the arrays coding bat 2 assignment.
 * MILCS
 * @author Daniel B)
 */
class ArraysCodingBat2
{

  public int[] rotateLeft3(int[] nums) 
  {
    
    return new int[] {nums[1], nums[2], nums[0]};
    
  }


  public int[] reverse3(int[] nums) 
  {
    
    int[] copyArray = new int[nums.length];
    for(int i = 0; i < nums.length; i++)
    {
      
      copyArray[nums.length - 1 - i] = nums[i];
      
    }
  
    return copyArray;
    
  }


  public int[] maxEnd3(int[] nums) 
  {
    
    int number;
    if (nums[0] > nums[2])
    {
      
      number = nums[0];
      
    }
    else
    {
      
      number = nums[2];
      
    }
    
    return new int[] {number, number, number};
    
  }


  public int sum2(int[] nums) 
  {
    
    int sum = 0;
    for (int i = 0; i < nums.length && i < 2; i++)
    {
      
      sum += nums[i];
      
    }
    
    return sum;
    
  }


  public int[] middleWay(int[] a, int[] b) 
  {
    
    return new int[] {a[1], b[1]};
    
  }


  public int[] makeEnds(int[] nums) 
  {
    
    return new int[] {nums[0], nums[nums.length - 1]};
    
  }
  
}
