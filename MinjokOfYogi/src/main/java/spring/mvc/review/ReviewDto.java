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

@Setter
@Getter
@Builder
@Table(name = "REVIEW")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {

	@Id
	@Column(name = "REV_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long rId;

	@OneToOne
	@JoinColumn(name = "ORD_id")
	private long oId;

	@ManyToOne
	@JoinColumn(name = "USER_id")
	private String id;

	@Column(name = "REV_stars")
	@Builder.Default
	private int stars = 0;

	@Column(name = "REV_content")
	private String content;

	@Column(name = "REV_photo")
	private String photo;

}
