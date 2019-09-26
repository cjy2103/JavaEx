public class Test3 {
    public static void main(String[] args) {
     int n[]={77,88,99};
     String v="";
     for(int i=0;i<n.length;i++){
         if(i>0)
             v= v+","+n[i];
         else
             v = v + n[i];
     }
     System.out.println("["+v+"]");
    }
}
