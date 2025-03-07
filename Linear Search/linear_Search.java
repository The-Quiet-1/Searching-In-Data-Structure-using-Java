import java.util.Scanner;

class linear{
    public   int l_Search(int n,int[] array,int sn) {
        for (int i=0;i<n;i++) {

             if(sn == array[i]) {
                 return i;
             }
         }
        return -1;
     }
}

public class linear_Search {

    public static void main(String[] args) {
        int i,n,sn;
        int array[];

        Scanner get = new Scanner(System.in);

            System.out.println();
            System.out.print("Enter Size of an Array: ");
            n=get.nextInt();
            System.out.println();

            array= new int[n];

            for(i=0;i<n; i++){
                System.out.print("Enter "+(i+1)+" Elements: ");
                array[i]= get.nextInt();
            }
            System.out.println("---------------------------------------------");
            System.out.print("Elements are:");
            for(i=0;i<n;i++) {
                System.out.print(" "+array[i]);
            }


        // for  Search Element
            System.out.println();
            System.out.println("---------------------------------------------");

            System.out.print("Element You Want to Search: ");
            sn=get.nextInt();

            System.out.println("---------------------------------------------");

        //Calling part

        linear obj=new linear();

        int result = obj.l_Search(n,array,sn);

        if(result==-1){
            System.out.println("ERROR: Elements Not Found ! ");
        }else {
            System.out.println("Element "+array[result]+" Found at Array Index: "+result);
        }
    }
}
