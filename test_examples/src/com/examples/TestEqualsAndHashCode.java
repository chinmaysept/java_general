package com.examples;

public class TestEqualsAndHashCode {
	
	int id = 10;
	String str = "abc";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
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
		TestEqualsAndHashCode other = (TestEqualsAndHashCode) obj;
		if (id != other.id)
			return false;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}

}
