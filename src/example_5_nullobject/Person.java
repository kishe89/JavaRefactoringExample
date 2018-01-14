package example_5_nullobject;

import example_5_nullobject.Label;

public class Person {
	private final Label _name;
	private final Label _mail;
	public Person(Label _name, Label _mail) {
		super();
		this._name = _name;
		this._mail = _mail;
	}
	public Person(Label _name) {
		this(_name,Label.getInstance());
	}
	public void display() {		
		_name.display();
		_mail.display();
	}
	public String toString() {
		return "[ Person: name="+_name+" mail="+ _mail+"]";
	}
}
