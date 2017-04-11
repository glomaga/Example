package Sequence;

import java.util.Date;

public class CheckingController {
public static void checkBook (Book book, LibraryMember member){
	Checkoutrecord storeRecord= member.getCheckoutRec(book);
	Date dueDate= storeRecord.getDueDate();
	double fine= computeFine(dueDate);
	member.removeRecord(book);
	libraryDBSubsys.removeRecord(member.getId(),storeRecord);
}
private static double computeFine(Date dueDate) {
	// TODO Auto-generated method stub
	return 0;
}
}
