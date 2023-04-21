package spring.mvc.menu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import spring.mvc.restaurant.RestaurantDto;

@Entity
@Table(name = "MENU")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MENU_id")
	private long mid;

	@ManyToOne
	@JoinColumn(name = "RST_id", referencedColumnName = "RST_id")
	private RestaurantDto rid;

	@Column(name = "MENU_name")
	private String mname;

	@Column(name = "MENU_price")
	private int mprice;

	@Column(name = "MENU_photo")
	private String mphoto;

	@Column(name = "MENU_desc")
	private String mdesc;

	@Column(name = "MENU_category")
	private String mcategory;
}
