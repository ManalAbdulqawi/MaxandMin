import java.util.Random;

public class MaxMin {
    public static void main(String[] args) {
        Random rand=new Random();
        int max=0,min=1;
        int [] nums=new int[10];
        for(int i=0;i<10;i++)
        {nums[i]=rand.nextInt(10);
            System.out.println(nums[i]);}

        for(int i=0;i<10;i++)
        {if(nums[i]>max)
        max=nums[i];
            if(min>=nums[i])
                min=nums[i];
        }
        System.out.println("The maximum number is "+max+" the minmum number is "+min);

    }
}
