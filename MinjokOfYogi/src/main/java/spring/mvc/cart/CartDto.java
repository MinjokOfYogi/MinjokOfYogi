package spring.mvc.cart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.mvc.menu.MenuDto;
import spring.mvc.user.UserDto;

@DynamicInsert
@Entity
@Table(name = "CART")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class CartDto {

	@Id
    @Column(name = "CART_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cid;

    @ManyToOne
    @JoinColumn(name = "USER_id")
    private UserDto uid;

    @ManyToOne
    @JoinColumn(name = "MENU_id")
    @ColumnDefault("0")
    private MenuDto mid;

    @Column(name = "CART_count")
    private int ccount;

    public CartDto() {
        this.uid = new UserDto(); // UserDto 객체 초기화
    }

}
