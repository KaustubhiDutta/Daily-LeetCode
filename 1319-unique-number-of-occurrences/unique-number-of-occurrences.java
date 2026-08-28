class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put( num , map.getOrDefault(num , 0) + 1);
        }

 HashSet<Integer> set = new HashSet<>();
 int i = 0;
 for(int num : arr){
    if(!set.contains(num)){
        set.add(num);
        arr[i] = num;
        i++;
    }
 }

    HashSet<Integer> set1 = new HashSet<>();
    for( int x : set){
        if(set1.contains(map.get(x))){
            return false;
        }
        set1.add(map.get(x));
    }
    return true;
    }
}