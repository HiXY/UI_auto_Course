class Coordinates
{
    int firstx = 0, firtsy = 0, secondx = 0, secondy = 0, thirdx = 0, thirdy = 0;
    Coordinates(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        int firstx = x1, firtsy = y1, secondx = x2, secondy = y2, thirdx = x3, thirdy = y3;
    }
}
public class Task1
{
    Coordinates triangle = new Coordinates(1,2,2,1,3,3);

    public int[] getCoordinates(Coordinates prottriangle)
    {
        return new int[] {
                Math.abs(prottriangle.firstx - prottriangle.secondx),
                Math.abs(prottriangle.firtsy - prottriangle.secondy),
                Math.abs(prottriangle.secondx - prottriangle.thirdx),
                Math.abs(prottriangle.secondy - prottriangle.thirdy),
                Math.abs(prottriangle.thirdx - prottriangle.firstx),
                Math.abs(prottriangle.thirdy - prottriangle.firtsy)};
    }

    public double[] lengthCalculating(int arr [])
    {
        double lengthfirst = Math.sqrt(arr[0] * arr[0] + arr[1] * arr[1]);
        double lengthsecond = Math.sqrt(arr[2] * arr[2] + arr[3] * arr[3]);
        double lengththird = Math.sqrt(arr[4] * arr[4] + arr[5] * arr[5]);

        return new double[] {lengthfirst, lengthsecond, lengththird};
    }

    boolean ifEquilateral(double[] arr)
   {
       return ((arr[0] == arr[1]) && (arr[1] == arr[2]));
   }

    boolean ifIsosceles(double arr[])
    {
       return ((arr[0] == arr[1]) || (arr[1] == arr[2]) || (arr[2] == arr[0]));
    }

    boolean ifRectangular(double arr[])
    {
       return (((arr[0] * arr[0]) == (arr[1] * arr[1] + arr[2] * arr[2])) || ((arr[1] * arr[1]) == (arr[0] * arr[0] + arr[2] * arr[2]))
           || ((arr[2] * arr[2]) == (arr[1] * arr[1] + arr[0] * arr[0])));
    }
}
