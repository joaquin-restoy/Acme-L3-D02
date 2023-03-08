
package acme.roles;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;

public class Lecturer extends AbstractRole {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes

	@NotBlank
	@Length(max = 75)
	protected String			almaMater;

	@NotBlank
	@Length(max = 100)
	protected String			resume;

	@NotBlank
	@Length(max = 100)
	protected String			qualifications;

	@URL
	protected String			moreInfo;
}
