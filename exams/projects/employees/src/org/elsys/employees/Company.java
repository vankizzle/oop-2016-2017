package org.elsys.employees;

import java.util.ArrayList;
import java.util.List;

public class Company {
	double budget_;
	List<Employee> Workers = new ArrayList<Employee>();
	
	/**
	 * Creates company with budget provided as parameter.
	 * 
	 * @param budget
	 */
	
	public Company(double budget) {
		this.budget_ = budget;
	}

	/**
	 * Returns the budget of the company.
	 * 
	 * @return
	 */
	public double getBudget() {
		return budget_;
	}

	/**
	 * Returns the remaining budget of the company - the company budget minus
	 * the salaries of all employees (including the managers).
	 * 
	 * @return
	 */
	public double getBudgetLeft() {
		double Left = budget_;
		if(Workers.size() > 0) {
			for(Employee e : Workers) {
				Left -= e.getSalary();
			}
		}
		return Left;
	}

	/**
	 * Hires an employees in the company.
	 * 
	 * If the budget is going to be exceeded, {@link NotEnoughBudgetException}
	 * must be thrown.
	 * 
	 * @param e
	 *            the employee to be hired
	 */
	public void hire(Employee e) {
		if(!Workers.contains(e)) {
			
				if(e.getSalary() <= getBudgetLeft() ) {
					Workers.add(e);
				}else {
					throw new NotEnoughBudgetException("Not enought budget");
				}
	
			}	
		}
	

	/**
	 * Fires an employee.
	 * 
	 * @param e
	 *            employee to be fired
	 */
	public void fire(Employee e) {
		Workers.remove(e);
	}

	/**
	 * Checks whether the given employee is hried in the company
	 * 
	 * @param e
	 */
	public boolean isHired(Employee e) {
		if(Workers.contains(e)) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Closes the company. Sets the budget to 0 and fires all employees
	 */
	public void close() {
		this.budget_ = 0;
		Workers.clear();
	}

	/**
	 * Returns a list of all managers with the given level.
	 * 
	 * @param level
	 * @return
	 */
	public List<Manager> getManagersWithLevel(int level) {
		List<Manager> Managers = new ArrayList<Manager>();
		for(Employee e : Workers) {
			if(e.IsManager() == 1) {
				if(((Manager) e).getLevel() == level) {
					Manager m = new Manager(e.getId(),e.getName(),e.getSalary(),((Manager) e).getLevel());
					Managers.add(m);
				}
			}
		}
		return Managers;
	}
}
