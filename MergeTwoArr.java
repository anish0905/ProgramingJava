
/**
 * MergeTwoArr
 */
public class MergeTwoArr {

    public static void main(String[] args) {
        int[] arr1 = { 5, 7, 9, 2 };
        int[] arr2 = { 4, 9, 8, 6 };
        int mergedLength =arr1.length+arr2.length; 
        int[] merg = new int[mergedLength];

for(int i = 0 ; i<arr1.length ; i++)
{
           merg[i]  =arr1[i];
}

for(int i = 0 ; i<arr2.length ; i++)
{
    merg[arr1.length + i] = arr2[i];

}

for(int abc:merg)
{
    System.out.println(abc);
}


    }
}
