
public class IceCreamCone {
    
    private double height;
    private double radius;
    
    /** Creates an ice cream cone.
     * @param h the height of the cone in inches
     * @param r the radius of the cone in inches
     */
    public IceCreamCone(double h, double r)
    {
        height = h;
        radius = r;
    }
    
    /** Finds and returns the surface area of the cone.
     *  Does not include the "top" face, since there is
     *  an opening there for the ice cream.
     * @return the surface area of the cone (in square in.)
     */
    public double getSurfaceArea()
    {
        double slantHeight = Math.sqrt(radius*radius + height*height);
        return Math.PI * radius * slantHeight;
    }
    
    /** Finds and returns the volume of the cone..
     * @return the volume of the ice cream cone (in cubic in.)
     */
    public double getVolume()
    {
        return (Math.PI * radius * radius * height)/3;
    }
    
}
