class Arrayeven
{
   public static void main(String args[])
   {
        int arr[]={12,34,23,64,3,4,6};
        for(int x=0;x<=arr.length-1;x++)
        {
              if(arr[x]%2==0)
              {
                  System.out.println(arr[x]);
              }
        }
   }
}

class Arrayevenindex
{
   public static void main(String args[])
   {
        int arr[]={12,34,23,64,3,4,6};
        for(int x=0;x<=arr.length-1;x++)
        {
              if(x%2==0)
              {
                  System.out.println("arr["+x+"]="+arr[x]);
              }
        }

   }
   
}