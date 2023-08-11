public class IceCreamConeTester {

    public static void main(String[] args) {
        
        IceCreamCone cone = new IceCreamCone(6,1);
        System.out.println("Surface Area: " +
                cone.getSurfaceArea());
        System.out.println("Expected: 19.109562");
        System.out.println("Volume: " +
                cone.getVolume());
        System.out.println("Expected: 6.283185");
    }
}
