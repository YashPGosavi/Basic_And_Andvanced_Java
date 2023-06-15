package Sammu_1_Core_Java.Sammu_1_Basic;

public class _2_java_operators {
    public static void main(String[] args) {
        System.out.println("****************************************************************************************");

        //Assignment Operator(=)
        System.out.println("Assignment Operator(=)");
        int a=25,b=5;
        System.out.println("Value of A :" + a);
        System.out.println("Value of B :" + b);
        int c=a/b;
        System.out.print("C=A/B");
        System.out.println("The value of C : " + c);

        System.out.println("****************************************************************************************");

        //Arithmetic Operator.(+,-,*,/,%)
        System.out.println("Arithmetic Operator.(+,-,*,/,%)");
        System.out.println(" + Operator a+b   : "+ (a+b));
        System.out.println(" - Operator a-b   : "+ (a-b));
        System.out.println(" * Operator a*b   : "+ (a*b));
        System.out.println(" _/_ Operator a/b : "+ (a/b));
        System.out.println(" % Operator a%b   : "+ (a%b));

        System.out.println("****************************************************************************************");

        //Relational Operator(<,>,<=,>=,==,!=)
        System.out.println("Relational Operator(<,>,<=,>=,==,!=)");
        // < , >
        if (a<b){
            System.out.println("A is smaller");
        }
        else if(a>b){
            System.out.println("B is smaller");
        }

        // <=, >=
        if(a<=b){
            System.out.println("A is smaller or Equal to B");
        }

        if(a>=b){
            System.out.println("B is smaller or Equal to A");
        }


        // == and !=
        if(a!=b){
            System.out.println("A and C are not same");
        }
        else if(a==b){
            System.out.println("A and C are equal");
        }

        System.out.println("****************************************************************************************");

        //Logical Operator.( || And &&)
        System.out.println("Logical Operator.( || And &&)");
        if(c<10 || c<=9){
            System.out.println("C is Single digit number.");
        }

        if (c>9 && c>0){
            System.out.println("C is Double digit Positive number.");
        }
        System.out.println("****************************************************************************************");

        //Increment And Decrement Operator.(++,--)

        System.out.println("The increment Operator ++");
        int i=0;
        while(i<10){
            i=i+1;
            System.out.println("The increment Operator(Odd numbers will print in increment order) : "+ i);
            ++i;
        }

        System.out.println("****************************************************************************************");

        System.out.println("The decrement Operator --");
        int j=10;
        do{
            j=j-1;
            System.out.println("The decrement Operator(Odd numbers will print in decrement order) : "+ j);
            --j;
        }while(j>0);


    }


}
