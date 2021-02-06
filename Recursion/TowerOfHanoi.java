public class TowerOfHanoi{

    public void move(int numofdisk,char from,char to,char inter){
        if(numofdisk==1){
            System.out.println("moving disk 1 from"+from+"to"+to);
        }else{
        move(numofdisk-1,from,inter,to);
        System.out.println("moving disk"+numofdisk +"from"+from+"to"+to);
        move(numofdisk-1,inter,to,from);
        }
    }
public static void main(String[] args){

TowerOfHanoi th =new TowerOfHanoi();
th.move(2,'A','C','B');

}



}