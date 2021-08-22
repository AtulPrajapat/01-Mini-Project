package in.atul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import antlr.collections.List;
import in.atul.entity.Contact;
import in.atul.service.contactService;

@Controller
public class indexController {

	@Autowired
	private contactService contService;

	@GetMapping("/contact")
	public String index(Model model) {
		return "index";
	}
	public boolean saveContact(Contact contact)	{
		contService.save(contact);
		return true;
	}
	public java.util.List<Contact> getAllContacts(){
		java.util.List<Contact> allContacts = contService.getAllContacts();
		return allContacts;
//		System.out.println(allContacts);
	}
	public Contact getContactByIdContact(int cid) {
		Contact contactByIdContact = contService.getContactByIdContact(101);
//		System.out.println(contactByIdContact);
		return contactByIdContact;
	}
	public boolean deleteContactById(int cid) {
		contService.deleteContactById(101);
		return true;
	}
}
