public class Duplicates{
    public static int duplicates(int arr[],int x){
        if(x==0 || x==1)
        return x;
        int[] temp=new int[x];
        int i,j=0;
        for(i=0;i<=x-1;i++){
        if(arr[i]!=arr[i+1]){
        temp[j++]=arr[i];
        }
        }
    temp[j++]=arr[x-1];
    for(i=0;i<j;i++){
        arr[i]=temp[i];
    }
       return j; 
    }
public static void main(String[] args){
    int arr[]={11,12,13,14,14,15,16};
    int length=arr.length;
    length=duplicates(arr,length);
    for(int i=0;i<length;i++)
    System.out.println(arr[i]+ "");
}
}
