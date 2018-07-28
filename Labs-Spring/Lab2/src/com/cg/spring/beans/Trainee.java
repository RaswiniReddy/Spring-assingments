package com.cg.spring.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {
	@Id
	private int traineeId;
	private String traineeName;
	private String traineeDomain;
	private String traineeLocation;

	public Trainee(int traineeId, String traineeName, String traineeDomain,
			String traineeLocation) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}

	public Trainee() {
		super();
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName="
				+ traineeName + ", traineeDomain=" + traineeDomain
				+ ", traineeLocation=" + traineeLocation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((traineeDomain == null) ? 0 : traineeDomain.hashCode());
		result = prime * result + traineeId;
		result = prime * result
				+ ((traineeLocation == null) ? 0 : traineeLocation.hashCode());
		result = prime * result
				+ ((traineeName == null) ? 0 : traineeName.hashCode());
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
		Trainee other = (Trainee) obj;
		if (traineeDomain == null) {
			if (other.traineeDomain != null)
				return false;
		} else if (!traineeDomain.equals(other.traineeDomain))
			return false;
		if (traineeId != other.traineeId)
			return false;
		if (traineeLocation == null) {
			if (other.traineeLocation != null)
				return false;
		} else if (!traineeLocation.equals(other.traineeLocation))
			return false;
		if (traineeName == null) {
			if (other.traineeName != null)
				return false;
		} else if (!traineeName.equals(other.traineeName))
			return false;
		return true;
	}

}
