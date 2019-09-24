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
@Table(name = "HR.LOCATIONS")
public class Locations {
	@Id
	@Column(name = "LOCATIONS_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  locationsId;
	
	@Column(name = "STREET_ADRESS" ,length =40)
	private String  streetAdress;
	
	@Column(name = "POSTAL_CODE" ,length =12)
	private String  postalCode;
	
	@Column(name = "CITY" ,length =30)
	private String  city;
	
	@Column(name = "STATE_PROVINCE" ,length =25)
	private String  stateProvince;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRY_ID")
	private Countries countries;


	public Integer getLocationsId() {
		return locationsId;
	}


	public void setLocationsId(Integer locationsId) {
		this.locationsId = locationsId;
	}


	public String getStreetAdress() {
		return streetAdress;
	}


	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStateProvince() {
		return stateProvince;
	}


	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}


	public Countries getCountries() {
		return countries;
	}


	public void setCountries(Countries countries) {
		this.countries = countries;
	}
	
}
