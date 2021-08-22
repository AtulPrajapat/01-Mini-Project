package in.atul.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.atul.entity.Contact;
import in.atul.repository.contactRepository;

@Service
public interface contactService extends contactRepository {
	
	public boolean saveContact(Contact contact); 
	
	public List<Contact> getAllContacts();
	
	public Contact getContactByIdContact(int cid);
	
	public boolean deleteContactById(int cid);
	

}
