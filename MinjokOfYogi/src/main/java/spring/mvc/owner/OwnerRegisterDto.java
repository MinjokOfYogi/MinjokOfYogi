package spring.mvc.owner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "OWNER")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OwnerRegisterDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OWN_id")
	private long ownId;
	@Column(name = "own_ownerid")
	private String ownOwnerid;
	@Column(name = "own_pass")
	private String ownPass;
	@Column(name = "own_name")
	private String ownName;
	@Column(name = "own_phone")
	private String ownPhone;
	@Column
	@Builder.Default private String login_type = "owner";
}
