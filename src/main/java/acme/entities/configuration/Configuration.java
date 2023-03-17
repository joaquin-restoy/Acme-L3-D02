
package acme.entities.configuration;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import acme.framework.data.AbstractEntity;

public class Configuration extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Pattern(regexp = "^[A-Z]{3}$", message= "{validation.configuration.code1}")
	protected String			defaultCurrency;

	@NotBlank
	@Pattern(regexp = "^([A-Z]{3}(,\b|\Z))+$", message="{validation.configuration.code2}")
	protected String			acceptedCurrencies;
}
