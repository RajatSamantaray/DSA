public class RainWaterHarvesting {
    public static int getRainWaterHarvestCount(int[] arr){
        int maxHarvest=0;
        int[] lArr=new int[arr.length];
        int[] rArr=new int[arr.length];
        int[] minArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                lArr[i] = arr[i];
            }else {
                lArr[i] = Math.max(arr[i], lArr[i - 1]);
            }
        }
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(i==arr.length-1){
                rArr[i] = arr[i];
            }else {
                rArr[i] = Math.max(arr[i], rArr[i + 1]);
            }
        }
        for (int i = 0; i < lArr.length; i++) {
            maxHarvest += (Math.min(lArr[i],rArr[i])-arr[i])*1;
        }
        return maxHarvest;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,0,2,0,4};
        System.out.println(getRainWaterHarvestCount(arr));
    }
}
