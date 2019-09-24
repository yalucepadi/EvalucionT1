package pe.edu.upn.HRSN00064095.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HR.REGIONS")
public class Regions {

	
	@Id
	@Column(name = "REGIONS_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  regionId;
	
	@Column(name = "REGIONS_NAME" ,length =25)
	private String  regionName;

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	
	

}
