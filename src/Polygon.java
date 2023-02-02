import java.text.DecimalFormat;
/**
 * @file Polygon.java
 * @date 2/2/23
 * @author Simone Del Carlo
 *
 * @description Creates a polygon with a number of sides,
 * side length, and shape type.
 */
public class Polygon {

    //instance variables
    private int numSides;
    private double sideLength;
    private String shapeType;

    //2 constructors

    /**
     * creates a default polygon
     */
    public Polygon(){
    numSides = 3;
    sideLength = 1.0;
    shapeType = "";
    }

    /**
     * creates a polygon with number of sides, side length, and shape type
     * @param sides
     * @param sLength
     * @param sType
     */
    public Polygon(int sides, double sLength, String sType){
        if(numSides>2){
            numSides = sides;
        }
        else{
            numSides = 3;
        }
        if(sideLength>0) {
            sideLength = sLength;
        }
        else{
            sideLength = 1.0;
        }
    shapeType = sType;
    }

    //accessors as needed

    /**
     *
     * @return number of sides
     */
    public int getNumSides(){
        return numSides;
    }

    /**
     *
     * @return side length
     */
    public double getSideLength(){
        return sideLength;
    }

    /**
     *
     * @return the shape type
     */
    public String getShapeType(){
        return shapeType;
    }

    public double getPerimeter(){
        return numSides*sideLength;
    }

    //toString method
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.###");
        return "The " + shapeType + " has " + numSides + " sides and a perimeter of " + df.format(getPerimeter());
    }
}