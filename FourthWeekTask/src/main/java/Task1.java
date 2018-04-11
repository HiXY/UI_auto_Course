public class Task1
{
    public int[] getCoordinates (int x1, int y1, int x2, int y2, int x3, int y3)
   {
       return new int[] {Math.abs(x1 - x2), Math.abs(y1 - y2), Math.abs(x2 - x3), Math.abs(y2 - y3), Math.abs(x3 - x1), Math.abs(y3 - y1)};
   }

   public double[] lengthCalculating (int arr [])
   {
       double lnghtfrst = Math.sqrt(arr[0] * arr[0] + arr[1] * arr[1]);
       double lnghtscnd = Math.sqrt(arr[2] * arr[2] + arr[3] * arr[3]);
       double lnghtthrd = Math.sqrt(arr[4] * arr[4] + arr[5] * arr[5]);

       return new double[] {lnghtfrst, lnghtscnd, lnghtthrd};
   }

   public boolean ifEquilateral (double[] arr)
   {
       if ((arr[0] == arr[1]) && (arr[1] == arr[2]))
       {
           return true;
       }
       else
       {
           return false;
       }
   }

   public boolean ifIsosceles (double arr[])
   {
       if ((arr[0] == arr[1]) || (arr[1] == arr[2]) || (arr[2] == arr[0]))
       {
           return true;
       }
       else
       {
           return false;
       }
   }

   public boolean ifRectangular (double arr[])
   {
       if (((arr[0] * arr[0]) == (arr[1] * arr[1] + arr[2] * arr[2])) || ((arr[1] * arr[1]) == (arr[0] * arr[0] + arr[2] * arr[2]))
           || ((arr[2] * arr[2]) == (arr[1] * arr[1] + arr[0] * arr[0])))
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}
