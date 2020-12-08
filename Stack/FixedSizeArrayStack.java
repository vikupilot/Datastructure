class FixedSizeArrayStack {

 //Length of an Array which is used to implement Stack
    protected int cpacity;
    //index of the Top
    protected int top=-1;
    //Array used to represent The Stack
    protected int[] stackRep;
    
    //initialize an array to a given Length

    public FixedSizeArrayStack(int cap) {
        cpacity=cap;
        stackRep=new int[cpacity];
        
    }
    // return the number of Element in the stack 
     
    public int size(){
        return (top+1);

    }
    //Testes Weathere Stack is Empety or not
    public boolean isEmpty() {
        return (top<0);
        
    }
    //insert an Element at the Top of stack 
    public void push(int data) {
            if(size()==cpacity)
                System.out.println("stack is full");
            stackRep[++top]=data;
    }

    //inspect the Element At the Top
    public int top() {
        if(isEmpty())
             System.out.println("stack is Empty");
        return stackRep[top];
        
    }

    //Remove the Top Element from the Stack
     
    public int  pop() {
        int data;
        if(isEmpty())
            System.out.println("stack is Empty");
        data=stackRep[top];
        stackRep[top--]=Integer.MIN_VALUE;
        return data;
    }

    // Retur a String representation
    public String toString() {
        String s;
        s="{";
        if(size()>0)
                s+=stackRep[0];
        if(size()>1)
                for (int i=1 ; i<=size()-1;i++) {
                    s+=","+stackRep[i];
                }
        return s+"}";
    }

    public static void main(String[] args) {
       
            FixedSizeArrayStack stack1 = new FixedSizeArrayStack(5);
            stack1.push(1);
            stack1.push(3);
            stack1.push(2);
            stack1.push(4);
            stack1.push(5);
            System.out.println(stack1.pop());
            System.out.println(stack1.size());
            System.out.println(stack1.top());
            System.out.println(stack1.toString());

    }
    

 }





