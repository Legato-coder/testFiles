package india;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class easyclass {
	
	
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hb.config.xml").build();  
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();
		
		luch kemo=new luch();
	
		kemo.setId(1000);
		kemo.setName("visakhapatnam");
		kemo.setMobile("99568655");
		kemo.setCity("ameerpet");
		
		
		session.save(kemo);
		t.commit();

		
		
	
	}

	}
