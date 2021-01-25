import java.util.Scanner;

public class Lab1 {
        public static int[] DeleteElement(int[] arr)
        {
            System.out.print("\n Enter number to delete: ");
            Scanner delete = new Scanner(System.in);
            int numberDelete= delete.nextInt();
            int count=0;
            for(int i=0;i<arr.length;i++)
            {
                if(numberDelete==arr[i])
                {
                    count++;
                }
            }
            if(count==0)
            {
                return arr;
            }
            else
            {
                int[] tarr=new int[arr.length-count];
                for(int i=0,j=0;i< arr.length;i++)
                {
                    if(arr[i]!=numberDelete) {
                        tarr[j] = arr[i];
                        j++;
                    }
                }
                System.out.println(" Array after delete!");
                for(int i=0;i<tarr.length;i++)
                {
                    System.out.print(tarr[i]+" ");
                }
                return tarr;
            }
        }

        public static int[] PutNewNumber(int[] arr)
        {
            int[] tarr=new int[arr.length+1];
            System.out.print(" Enter position: ");
            Scanner newPosition = new Scanner(System.in);
            int position = newPosition.nextInt();
            position-=1;
            System.out.print(" Enter number: ");
            int newNumber = newPosition.nextInt();
            for(int i=0,j=0;i<tarr.length;i++)
            {
                if(i!=position) {
                    tarr[i] = arr[j];
                    j++;
                }
                else
                {
                    tarr[i]=newNumber;
                }
            }
            return tarr;
        }

        public static void CountNumber(int[] arr)
        {
            int length = arr.length;
            for(int j=0;j < length;j++)
            {
                System.out.print(arr[j]+" ");
            }
            System.out.println();

            for(int i=0;i< length;i++)
            {
                int count=0;
                for(int j=0;j < length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                }
                System.out.println("  "+ arr[i]+" - "+count+" times;");
            }
        }

        public static void Turn(String l)
        {
            String turnedLine=new StringBuffer(l).reverse().toString();

            System.out.println(" Line in other way: "+turnedLine);
        }

        public static void MinimalNumber(int[] ...arr)
        {
            int leng=0,minNumber=arr[0][0];
            for(int[] x:arr)
            {
                leng++;
            }
            System.out.println(" Count of arrays = "+leng);
            for (int[] x:arr)
            {
                for(int i=0;i<x.length;i++)
                {
                    System.out.print(" ");
                    System.out.print(x[i]+" ");
                    if (x[i] < minNumber)
                    {
                        minNumber = x[i];
                    }
                }
                System.out.print("\n");
            }
            System.out.println(" Minimal number from " + leng + " arrays = " + minNumber);
        }

        public static void main(String[] args) {
            System.out.println(" Task 3: ");
            int[] arr4 = new int[10];
            for (int i = 0; i < arr4.length; i++) {
                arr4[i] = (int) (0 + Math.random() * 10);
                System.out.print(arr4[i] + " ");
            }
            System.out.print("\n");
            arr4 = PutNewNumber(arr4);
            for (int y : arr4) {
                System.out.print(y + " ");
            }
            System.out.print("\n");


            System.out.println(" Task 5:");
            int[] arrForDelete = new int[8];
            for (int i = 0; i < arrForDelete.length; i++) {
                arrForDelete[i] = (int) (0 + Math.random() * 10);
                System.out.print(arrForDelete[i] + " ");
            }
            arrForDelete = DeleteElement(arrForDelete);


            System.out.println("\n Task 8:");
            int[] arr1 = new int[10];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (int) (0 + (Math.random() * 10));
            }
            CountNumber(arr1);


            System.out.println(" Task 19:");
            Scanner scanString = new Scanner(System.in);
            System.out.print(" Enter line: ");
            String getLine = scanString.nextLine();
            Turn(getLine);


            System.out.println(" Task 29:");
            int[] arr2 = new int[5];
            int[] arr3 = new int[5];

            for (int i = 0; i < 5; i++) {
                arr2[i] = (int) (0 + Math.random() * 10);
                arr3[i] = (int) (0 + Math.random() * 10);
            }
            MinimalNumber(arr2, arr3);
        }
}
