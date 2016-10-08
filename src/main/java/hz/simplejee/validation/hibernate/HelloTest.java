package hz.simplejee.validation.hibernate;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

public class HelloTest {

	public static void main(String[] args) {
		Validator v = Validation.buildDefaultValidatorFactory().getValidator();
		U u = new U();
		u.setFlag(false);
		
		Set<ConstraintViolation<U>> r = v.validate(u);
		Iterator<ConstraintViolation<U>> ltr = r.iterator();
		while(ltr.hasNext()) {
			ConstraintViolation<U> vv = ltr.next();
			System.out.println(vv.getMessage());

		}
	}
}
