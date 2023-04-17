package spring.mvc.restaurant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "RESTAURANT")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RST_id")
	private long id;
	
	@Column(name = "OWN_id")
	private long ownerId;
	
	@Column(name = "RST_name")
	private String name;
	
	@Column(name = "RST_tel")
	private String tel;
	
	@Column(name = "RST_category")
	private long category;
	
	@Column(name = "RST_location")
	private String location;
	
	@Column(name = "RST_license")
	private String license;
	
	@Column(name = "RST_auth")
	private long auth;
}
