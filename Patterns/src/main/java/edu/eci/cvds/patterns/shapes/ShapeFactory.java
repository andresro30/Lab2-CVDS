package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
	public static Shape create(RegularShapeType figura){
		switch(figura){
			
			case Hexagon:
			return new Hexagon();
			case Pentagon:
			return new Pentagon();
			case Quadrilateral:
			return new Quadrilateral();
			case Triangle:
			return new Triangle();
		}
		return null;
	}
	
	
} 