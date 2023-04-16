package spring.mvc.pick;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PICK")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PickDto {
	
	@Id
	@Column(name = "PICK_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pId;
	
	@ManyToMany
	@JoinColumn(name = "USER_id")
	private String id;
	
	@ManyToMany
	@JoinColumn(name = "RST_id")
	private long rId;

}
