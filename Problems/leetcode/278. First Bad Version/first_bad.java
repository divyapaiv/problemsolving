/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
           long start=0;
           long end=n;
        while(start<=end){
         
            boolean isBad=false; 
            int mid;
            mid=(int)((start+end)/2);
            isBad=isBadVersion(mid); 
            /*System.out.println(start);
            System.out.println(end);
            System.out.println(mid);
            System.out.println(isBad);
            System.out.println("+++++++++++++++");*/
                if(isBad==true && mid-1>0 && isBadVersion(mid-1)==false){
                    return(mid);
                }
                else if(mid+1<=n && isBad==false && isBadVersion(mid+1))
                {
                    return(mid+1);
                }
                else if(isBad==true){
                    end=mid-1;
                }
               else if(isBad==false){
                    start=mid+1;
                }
            
        }
        return(0);
    }
}
    
