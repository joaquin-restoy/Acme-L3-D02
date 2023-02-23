
package acme.entities.audits;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Auditor extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;
	@NotBlank(message = "Firm cannot be blank")
	@Size(max = 75, message = "Firm name must be shorter than 76 characters")
	protected String			firm;

	@NotBlank(message = "Professional ID cannot be blank")
	@Size(max = 25, message = "Professional ID must be shorter than 26 characters")
	protected String			professionalId;

	@NotBlank(message = "Certifications cannot be blank")
	@Size(max = 100, message = "Certifications must be shorter than 101 characters")
	protected String			certifications;

	protected String			link;

}
