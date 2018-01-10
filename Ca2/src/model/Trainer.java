package model;
/**
 * 
 * @author Kevin Power
 * @date 28/04/2017
 */
public class Trainer extends Person {

	public Trainer(String email, String address, String gender, String name) { // oh
																				// there's
																				// that
																				// generate
																				// thing
																				// eh?
		super(email, address, gender, name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trainer []");
		return builder.toString();
	}

}
