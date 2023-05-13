public class FirstMissingPositiveNum {
    static int missingPositiveNumber(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]!=arr[correct] && arr[i]<=arr.length){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
            }
        
    
    
    for(int index=0;index<arr.length;index++){
        if(arr[index]!=index+1){
            return index+1;
        }
    }
    return arr.length+1;

}

    

    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


    
    


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,7};
    
        System.out.println(missingPositiveNumber(arr));
    }
    
}
