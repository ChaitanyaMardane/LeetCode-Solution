class Solution {
public:
    int removeDuplicates(vector<int>& arr) {
        int l=0;
        for(int r =0; r< arr.size() ; r++){
            if(arr[l]!=arr[r]){
                l++;
                arr[l]=arr[r];
            }
        }
        return l+1;
    }
};