package javacoding.versionone;

public class Ellipse implements Figure{
    @Override
    public void onDraw() {
        System.out.println("绘制椭圆形...");
    }

    @Override
    public void printName() {
        System.out.println(name);
    }
    
}
