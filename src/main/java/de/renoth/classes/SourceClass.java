package de.renoth.classes;

public abstract class SourceClass {

	private SourceClassMemberClass memberA;


	protected SourceClass() {
		this.memberA = null;
	}


	public SourceClassMemberClass getMemberA() {
		return memberA;
	}

	public String getIdent() {
		return "ID";
	}
}
