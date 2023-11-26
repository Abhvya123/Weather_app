public class BinaryTreesB{
    public static void main(String args[]){
        int a[]={4,5,6,7,0,1,2};
    int p=0;
    int target=5;
    int q=a.length-1;
    boolean flag=false;
    while(p<=q){
        if(target==a[p]){
          flag=true;
            break;
        }
        else if(target==a[q]){
        
            flag=true;
            break;
        }
        else if(target<a[q]){
            q--;
            flag=false;
        }
        else if(target>a[p]){
            p++;
            flag=false;
        }
       
    }
    if(flag==true){
        System.out.println("element found");
    }
    else{
        System.out.println("element doesnot found");
    }
    
    }
}