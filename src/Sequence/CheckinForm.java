package Sequence;

public class CheckinForm {
public void checkinBook(){
	Book m_book = null;
	LibraryMember m_member = null;
	CheckingController.checkBook(m_book, m_member);
	displayCheckoutInfo();
	clearCheckoutFields();
}

private void clearCheckoutFields() {
	// TODO Auto-generated method stub
	
}

private void displayCheckoutInfo() {
	// TODO Auto-generated method stub
	
}
}
