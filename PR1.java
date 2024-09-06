class PR1
{
 public static void main(String args[])
 {
  int ele[]=new int[args.length];
  int max=0, min=0;
  System.out.println("Before sorting");
  for(int i=0;i<ele.length;i++)
  {
	   ele[i]=Integer.parseInt(args[i]);
	   if(ele[i]>max)
	   {
		   max=ele[i];
	   }
	   System.out.println(ele[i]);
  }	  
   for(int j=0;j<ele.length;j++)
    {
	 for(int i=j+1;i<ele.length;i++)
	 {
		 if(ele[j]>ele[i])
		 {
			 int temp;
			 temp=ele[j];
			 ele[j]=ele[i];
			 ele[i]=temp;
		 }
	 }		 
	  	  
	}
	 System.out.println("After sorting sorting");
	for(int i=0;i<ele.length;i++)
    {
	
	   System.out.println(ele[i]);
    }	 
 	 System.out.println("Maximum value : "+max);
	 
 }

}