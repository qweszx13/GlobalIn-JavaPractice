public class circleTest {
    public static void main(String[] args) {
        instance circle = new instance();
        circle.radius = 10;

        System.out.println(circle.getAArea());

        instance circle2 = new instance();
        circle2.radius = 5;

        System.out.println(circle2.getAArea());

        instance circle3 = new instance();
        circle3.radius = 7;

        System.out.println(circle3.getAArea());
    }
}
