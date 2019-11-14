package design.pattern.ocp;

/**
 * Personal loan validator
 */
public class PersonalLoanValidator
  extends Validator
{
  public boolean isValid()
  {
    //Validation logic.
	  return true;
  }
}

/*
 * Similarly any new type of validation can
 * be accommodated by creating a new subclass
 * of Validator
 */
