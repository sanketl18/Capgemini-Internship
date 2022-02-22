package inter.oops.assign;

abstract class Persistence {
	abstract public String persist();
}

class FilePersistence extends Persistence {
	@Override
	public String persist() {
		String a = "file";
		return a;
	}
}

class DatabasePersistence extends Persistence {
	@Override
	public String persist() {
		String b = "dataPersist";
		return b;
	}
}

class client {
	Persistence p1 = new FilePersistence();
	String f = p1.persist();
	Persistence p2=new DatabasePersistence();
String g=p2.persist();
}

public class Q6assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		client cc=new client();
		//System.out.println(cc.p1);
		System.out.println(cc.g);
	}

}
