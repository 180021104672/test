public class Lab1_1 {
    public static void main(String[] args){
        int i,j,k;
        int n=9;
        for(i=1;i<=n;i++)
        {
            for (j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for (j=0;j<2*i-1;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for (i=8;i>=1;i--)
        {
            for (j=1;j<=9-i;j++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++)
            {
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
    }
}
