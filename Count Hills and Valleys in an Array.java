class Solution {
    public int countHillValley(int[] arr) {
        int count = 0;
        for(int i = 1; i<arr.length-1; i++){
            if( arr[i] == arr[i+1]){ 
                arr[i] = arr[i-1];
                continue;
            }
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                count++;
            }else if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                count++;
            }
        }
        return count;
    }
}
