package org.elsys.shapes;

import java.util.Collections;
import java.util.Iterator;

public class ShapeBox extends ShapeContainer {

	public ShapeBox(double capacity) {
		this.capacity_ = capacity;
	}

	/**
	 * Returns the capacity of the box.
	 * @return
	 */
	public double getCapacity() {
		return capacity_;
	}

	/**
	 * Returns iterator to iterate the shape from smallest to biggest.
	 * @return
	 */
	public Iterator<Shape> getShapesFromSmallest() {
		  Collections.sort(Cont, (s1, s2) -> (int)(s1.calculateArea() - s2.calculateArea()));
		  return Cont.listIterator();
	}
	@Override
	public boolean add(Shape s) {
		if(s != null) {
			if(!Cont.contains(s)) {
				if(s.calculateArea() <= RemainCap()) {
					Cont.add(s);
					return true;
				}else {
					throw new NotEnoughAreaException("");
				}
			}else return false;
		}else return false;
	}
}
