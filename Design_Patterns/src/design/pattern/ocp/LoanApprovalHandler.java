package design.pattern.ocp;

/* the above validators we can write a LoanApprovalHandler to use the Validator abstraction.*/

public class LoanApprovalHandler
{
  public void approveLoan(Validator validator)
  {
    if ( validator.isValid())
    {
      //Process the loan.
    }
  }
}
