

using System;
class HelloWorld {
  static void Main() {
    //dynamic array
    int[] arr1 = new int[5];
    //static array
    
    int[] arr = {23,4,71,21,11,344,199};
    
    //normal array printing
    
    for(int i=0;i<arr.Length;i++)
    {
        Console.WriteLine(arr[i]);
    }
    
    // array methods
    
    Array.Reverse(arr);
    Console.WriteLine(String.Join(",", arr));
    
    Array.Sort(arr);
    Console.WriteLine(String.Join(',', arr));
    
    
    Console.WriteLine(Array.IndexOf(arr,21));
  }
}
