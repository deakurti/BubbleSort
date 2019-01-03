public class sortmethod {
    public static int[] intarr (int count){
        int [] arr = new int[count]; //[] bc array//

        int[]num;
        num = new int [10000];
        for (int i = 0; i < num.length; i++)
        {
           int random = (int) (Math.random()) * (100001); //when casting to a value need () around int//
            arr[i] = random;
        }
            return arr;

    }
}
