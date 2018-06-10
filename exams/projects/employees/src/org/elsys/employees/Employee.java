package org.elsys.employees;

public class Employee {
	long id_;
	String name_;
	double salary_;
	public Employee(long id, String name, double salary) {
		this.id_ = id;
		this.name_ = name;
		this.salary_ = salary;
	}

	public long getId() {
		return id_;
	}

	public String getName() {
		return name_;
	}

	public double getSalary() {
		return salary_;
	}
	
	public int IsManager() {
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id_ ^ (id_ >>> 32));
		result = prime * result + ((name_ == null) ? 0 : name_.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary_);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id_ != other.id_)
			return false;
		if (name_ == null) {
			if (other.name_ != null)
				return false;
		} else if (!name_.equals(other.name_))
			return false;
		if (Double.doubleToLongBits(salary_) != Double.doubleToLongBits(other.salary_))
			return false;
		return true;
	}
	
}
