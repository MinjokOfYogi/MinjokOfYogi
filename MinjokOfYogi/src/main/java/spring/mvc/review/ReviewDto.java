package spring.mvc.review;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import spring.mvc.orders.OrdersDto;
import spring.mvc.user.UserDto;

@Setter
@Getter
@Builder
@Table(name = "REVIEW")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReviewDto {

	@Id
	@Column(name = "REV_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long rid;

	@ManyToOne
	@JoinColumn(name = "ORD_id", referencedColumnName = "ORD_id")
	private OrdersDto oid;

	@ManyToOne
	@JoinColumn(name = "USER_id", referencedColumnName = "USER_id")
	private UserDto uid;

	@Column(name = "REV_stars")
	@Builder.Default
	private int rstars = 0;

	@Column(name = "REV_content")
	private String rcontent;

	@Column(name = "REV_photo")
	private String rphoto;

}
