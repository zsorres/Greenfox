public class Cubiod {
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
    public static void main(String[] args) {

        double a = 10;
        double CuboidSurfaceArea = 600;
        double CuboidVolume = 1000;
        double VolumeCount = a*a*a;
        double SurfaceCount = 6*a*a;
        System.out.println("A kocka élei " + a + " mm hosszúak.");
        System.out.println("A kocka területe " + CuboidSurfaceArea + " mm2 nagyságú");
        System.out.println("A kocka térfogata " + CuboidVolume  +  " mm3 nagyságú");
    }

}

