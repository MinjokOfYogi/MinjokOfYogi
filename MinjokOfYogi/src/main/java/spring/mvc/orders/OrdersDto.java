package spring.mvc.orders;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.mvc.cart.CartDto;
import spring.mvc.user.UserDto;

@Entity
@Table(name = "ORDERS")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDto {
	
	@Id
	@Column(name = "ORD_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long oid;
	
	@ManyToOne
	@JoinColumn(name = "USER_id")
	private UserDto uid;
	
	@OneToMany
	@JoinColumn(name = "CART_id")
	private Set<CartDto> cid;
	
	@Column(name = "ORD_method")
	private String method;
	
	@Column(name = "ORD_request")
	private String request;
	
	@Column(name = "ORD_payment")
	private String payment;
	
	@CreationTimestamp
	@Column(name = "ORD_day", updatable = false)
	private Timestamp oday;
	
	@Column(name = "ORD_status")
	private String ostatus;

}
