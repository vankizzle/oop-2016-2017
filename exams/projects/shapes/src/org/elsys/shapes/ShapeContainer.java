package org.elsys.shapes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShapeContainer {
	protected double capacity_;
	protected List<Shape> Cont = new ArrayList<Shape>();
	

	/** 
	 * Adds a shape to the container.
	 * @param s the Shape to be added
	 * @return true if s was successfully added
	 */
	
	public boolean add(Shape s) {
		if(s != null) {
			if(!Cont.contains(s)) {
				Cont.add(s);
				return true;
			}else return false;
		}else return false;
	}

	public double RemainCap() {
		double current = 0.0;
		for(Shape s:Cont) {
			current += s.calculateArea();
		}
		return capacity_ - current;
	}
	/**
	 * Adds all shapes to a container.
	 * @param shapes
	 * @return true if all shapes were added, false otherwise
	 */
	public boolean addAll(Collection<Shape> shapes) {
		int flag = 0;
		for(Shape s:shapes) {
			if(add(s)) {
				flag++;
			}
		}
		if(flag == shapes.size())return true;
		else return false;
	}

	/**
	 * Removes a shape from the container.
	 * @param s the Shape to be removed
	 * @return true if s was present in the collection
	 */
	public boolean remove(Shape s) {
		if(Cont.contains(s)) {
			Cont.remove(s);
			return true;
		}else return false;
	}

	/**
	 * Returns the sum of the areas of all shapes in the container.
	 * @return
	 */
	public double getTotalArea() {
		double sum = 0.0;
		for(Shape s:Cont) {
			sum += s.calculateArea();
		}
		return sum;
	}

	/**
	 *  Removes all shapes from the container.
	 */
	public void clear() {
		Cont.clear();
	}

	/**
	 * Checks whether a Shape is present in the container.
	 * @param s the Shape to check
	 * @return true if s is present
	 */
	public boolean contains(Shape s) {
		if(Cont.contains(s))return true;
		else return false;
	}

}
