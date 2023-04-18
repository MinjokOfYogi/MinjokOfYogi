package spring.mvc.cart;

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
import spring.mvc.menu.MenuDto;
import spring.mvc.user.UserDto;

@Entity
@Table(name = "CART")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {

	@Id
	@Column(name = "CART_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cId;
	
	@ManyToOne
	@JoinColumn(name = "USER_id")
	private UserDto id;
	
	@ManyToOne
	@JoinColumn(name = "MENU_id")
	private MenuDto mId;


	
	
	
}
