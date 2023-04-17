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
import lombok.ToString;

@Entity
@Table(name = "RESTAURANT")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestaurantDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RST_id")
	private long rid;
	
	@Column(name = "OWN_id")
	private long ownerId;
	
	@Column(name = "RST_name")
	private String rname;
	
	@Column(name = "RST_tel")
	private String rtel;
	
	@Column(name = "RST_category")
	private long rcategory;
	
	@Column(name = "RST_location")
	private String rlocation;
	
	@Column(name = "RST_license")
	private String rlicense;
	
	@Column(name = "RST_auth")
	private long rauth;
}
