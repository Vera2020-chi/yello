//my fisrt code
public /*main method*/ class Vera {
    public static void main(String [] args){
        int firstNum = 15;
        int secondNum = 7;
        int widthNum = 5;
        int heightNum = 3;
        Ball myBall = new Ball();
        myBall.color = "blue";
        myBall.name = "basketball";
        myBall.capacity = 34;
        int area = getArea(6,30);
        System.out.println(" The area is: " + area);
        System.out.println("fullName is:" +fullName("wise","ify") + " Hello ");
        System.out.println("My truth:" + isTrue(true,true));
        System.out.println("the sum is:" +(firstNum % secondNum));// the remainder
        System.out.println("the area="+(widthNum*heightNum));
        System.out.println(myBall.name);
        System.out.println(myBall.capacity);
}
    public static  int getArea(int width, int height){
        return width * height;
    }
    public static String fullName(String firstName,String lastName){
        return firstName + " " + lastName;
    }
    public static boolean isTrue(boolean a, boolean b){
        if (a != b){
            return a;
        }else {
            return b;

            }

        }

    }

