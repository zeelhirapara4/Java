import java.util.Arrays;

public class PR2 {

    public static void main(String[] args) {
        
        int len=args.length-1;
        String tString;
        System.out.println("\n\nBefore Sorting : ");
        for(int x=0;x<args.length;x++)
        {
            System.out.print(args[x]+" ");
        }
       for(int i=0;i<args.length-1;i++)
        {
            int f=0;
            for(int j=0;j<len;j++)
            {
               if(args[j].compareTo(args[j+1])>0)
               {
                   tString=args[j];
                   args[j]=args[j+1];
                   args[j+1]=tString;
                   f++;
               }
            }
    
            if(f==0)
                break;
            len--;
        }
      //Arrays.sort(args);
     System.out.println("\n\nAfter Sorting : ");
                  for(int x=0;x<args.length;x++)
        {
            System.out.print(args[x]+" ");
        }
        
    }
    
}
