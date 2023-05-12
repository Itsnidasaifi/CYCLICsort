
import java.util.List;
import java.util.ArrayList;

public class AllDuplicates {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5};
        List<Integer> ans=findDuplicate(arr);
        System.out.println(ans);
        
    }
    static List<Integer> findDuplicate(int arr[]){
        int i=0;
        
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]!=arr[correct] && arr[i]<arr.length){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>(); 
            for(int index=0;index<arr.length;index++){
                if(arr[index]!=index+1){
                    ans.add(arr[index]);
                }

            }
            
            return ans;
            
            //System.out.println(ans);
        }
        
    


    

    static void swap(int arr[],int first,int second){
        int temp=arr[first];
         //arr[second]=arr[first];d
         arr[first]=arr[second];
         arr[second]=temp;


    }
    
}
