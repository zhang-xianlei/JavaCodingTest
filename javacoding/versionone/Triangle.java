package javacoding.versionone;

public class Triangle implements Figure {
    @Override
    public void onDraw() {
        System.out.println("绘制三角形...");
    }

    @Override
    public void printName() {
        System.out.println(name + "这里是三角形");
    }
}
