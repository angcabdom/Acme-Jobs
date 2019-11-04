
package acme.entities.companyRecords;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CompanyRecord extends DomainEntity {

	//serialisation identifier
	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				name;

	@NotBlank
	private String				sector;

	@NotBlank
	private String				ceo;

	@NotBlank
	private String				activities;

	@URL
	@NotBlank
	private String				webSite;

	@Pattern(regexp = "^[+]?\\d{0,3}?[ ]?[(]?\\d{0,4}?[)]?[ ]?\\d{6,10}$")
	@NotBlank
	private String				phone;

	@NotBlank
	private String				email;

	private Boolean				incorporated;

}
