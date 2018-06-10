package org.elsys.employees;

public class Manager extends Employee {
	
	int level_;
	/**
	 * Creates new manager with the given id, name, salary and level.
	 * @param id
	 * @param name
	 * @param salary
	 * @param level
	 */
	public Manager(long id, String name, double salary, int level) {
		super(id, name, salary);
		this.level_ = level;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Creates new manager with the given id, name, salary and with level 1.
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Manager(long id, String name, double salary) {
		super(id, name, salary);
		this.level_ = 1;
		// TODO Auto-generated constructor stub
	}

	public int getLevel() {
		return level_;
	}
	
	@Override
	public int IsManager() {
		return 1;
	}
}
