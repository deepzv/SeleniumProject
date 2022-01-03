public class strSplitdemo {

    public static void main(String[] args)
    {
        String str = "I am a pround Indian";
        String[] stArr = str.split(" ");

        /*for (String x:stArr)
            System.out.println(x);*/

        for (int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);
    }
}

