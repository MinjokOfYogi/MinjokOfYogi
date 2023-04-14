package spring.mvc.owner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.Data;

@Entity
@Table(name = "OWNER")
@Data
public class OwnerRegisterDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long OWN_id;
	@Column
	private String OWN_ownerid;
	@Column
	private String OWN_pass;
	@Column
	private String OWN_name;
	@Column
	private String OWN_phone;
	@Column
	private String login_type;
}
