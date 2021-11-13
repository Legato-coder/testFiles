package Onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class simpleeasy {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("maps.xml").build();  
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();
		
		orders kiss=new orders();
		
		kiss.setOid(121);
	    kiss.setOrderdesc("iphone");
		kiss.setPrice("12000");
		
	orders kiss1=new orders();
		kiss1.setOid(156);
		kiss1.setOrderdesc("iwatch");
		kiss1.setPrice("14000");
		
		List<orders> open=new ArrayList<orders>();
		open.add(kiss);
		open.add(kiss1);
		
		customer keep=new customer();
		keep.setCid(1);
		keep.setCname("santhosh");
		keep.setCmobile("9100425");
		keep.setCaddress("hyd");
		keep.setOrders(open);
		
		
		
		session.save(keep);
		t.commit();
		t.commit();
	}

}
