class Arraymissing
{ 
   public static void main(String args[])
   {
        int a[] ={2,3,5,6,7};
        for(int x=0;x<=9;x++)
        {
            int count=0;
            for(int y=0;y<=a.length-1;y++)
            {
               if(a[y]==x)
               {
                    count++;
                 
               }
            }
           if(count==0)`										`
           {
                System.out.println(x);
           }
        }
   }
}   