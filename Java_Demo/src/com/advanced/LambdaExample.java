package com.advanced;

@FunctionalInterface
interface Drawable{
    public abstract void draw(int a, int b);

//    void area();
}
public class LambdaExample {

    public static void main(String[] args) {
        int width = 10;

        Drawable drawable = new Drawable() {
            @Override
            public void draw(int a, int b) {
                System.out.println(a + b);
            }
        };
        drawable.draw(1, 2);

        Drawable drawable1 = (a, b) -> System.out.println( "Sum of a and b is " + a + b);
        drawable1.draw(3,4);

        Drawable drawable2 = (a,b) -> {
            System.out.println("1" + a);
            System.out.println("2" + b);
        };

        drawable2.draw(1,2);

//        ConsumerExample consumer = (a,b ) -> System.out.println(1 + 2);
        


    }
}
