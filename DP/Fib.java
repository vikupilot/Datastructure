class Fib{
    //Tabulation solution
    public int fibanoci_tab(int n){
        if(n==0|| n==1) return 1;
        int[] fib=new int[n+1];
        fib[0]=1;
        fib[1]=1;
        for (int i=2;i<n;i++) {
            fib[i]=fib[i-1]+fib[i-2];  
        }
        return fib[n-1];
    }
    //Memorization Solution
    public int fibanoci(int n){
        int[] fib=new int[n+1]; 
        if(n==1) return 1;
        if(n==2) return 1;
        if(fib[n]!=0) 
            return fib[n];
        return fib[n]=fibanoci(n-1)+fibanoci(n-2);    
    }  
    //improved version
    public int fibanoci_improved(int n){
            if(n==0) return 0;
            int a=0,b=1,sum=0,i;
            for(i=1;i<n;i++){
                sum=a+b;
                a=b;
                b=sum;
            }
        return sum;

    }
 public static void main(String[] args) {
    Fib ob1= new Fib();
    System.out.println(ob1.fibanoci(10));
    System.out.println(ob1.fibanoci_tab(10));
    System.out.println(ob1.fibanoci_improved(10));
}

}