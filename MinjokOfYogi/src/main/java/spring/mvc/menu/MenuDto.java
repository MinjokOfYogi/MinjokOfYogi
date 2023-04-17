package spring.mvc.menu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MENU")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDto {

	@Column(name = "MENU_id")
	private long mId;
	
	@Column(name = "RST_id")
	private long rId;
	
	@Column(name = "MENU_name")
	private String mName;
	
	@Column(name = "MENU_price")
	private int mPrice;
	
	@Column(name = "MENU_photo")
	private String mPhoto;
	
	@Column(name = "MENU_desc")
	private String mDesc;
	
	@Column(name = "MENU_category")
	private int mCategory;
}
