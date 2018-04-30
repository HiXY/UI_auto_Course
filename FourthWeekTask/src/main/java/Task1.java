public class Task1
{
    Coordinates triangle = new Coordinates(1,2,2,1,3,3);

    public int[] getCoordinates(Coordinates prottriangle)                          //// method for getting coordinates
    {
        return new int[] {
                Math.abs(prottriangle.firstx - prottriangle.secondx),
                Math.abs(prottriangle.firtsy - prottriangle.secondy),
                Math.abs(prottriangle.secondx - prottriangle.thirdx),
                Math.abs(prottriangle.secondy - prottriangle.thirdy),
                Math.abs(prottriangle.thirdx - prottriangle.firstx),
                Math.abs(prottriangle.thirdy - prottriangle.firtsy)};
    }

    public double[] lengthCalculating(int arr [])                               //// calculating length of sides
    {
        double lengthfirst = Math.sqrt(arr[0] * arr[0] + arr[1] * arr[1]);
        double lengthsecond = Math.sqrt(arr[2] * arr[2] + arr[3] * arr[3]);
        double lengththird = Math.sqrt(arr[4] * arr[4] + arr[5] * arr[5]);

        return new double[] {lengthfirst, lengthsecond, lengththird};
    }
                                                                              //// triangle type definition
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
