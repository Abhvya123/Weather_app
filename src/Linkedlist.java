import java.util.ArrayList;

public class Linkedlist{
public static boolean pairsum(ArrayList<Integer> list,int target){
  for(int i=0;i<list.size();i++){
    for(int j=i+1;j<list.size();j++){
      if(list.get(i) + list.get(j) ==target){
        return true;
      }
    }
  }
  return false;
}
  public static void main(String args[]){
  ArrayList<Integer> list=new ArrayList<>();
//inbuilt sorting method 
int target=5;

list.add(1);
list.add(2);
list.add(3);
list.add(5);



}
}