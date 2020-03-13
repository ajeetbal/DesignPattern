import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingleTon implements Cloneable, Serializable {

	private static SingleTon soleInstance = null;

	private SingleTon() {
		super();
		if (soleInstance != null) {
			// handled reflection api violation
			throw new RuntimeException("can't create ,use getInstance()");
		}
		System.out.println("creating ....");
	}

	public static synchronized SingleTon getInstance() {
		// added synchronized to handle multithread violation
		if (soleInstance == null) {
			synchronized (SingleTon.class) {
				soleInstance = new SingleTon();
			}
		}
		return soleInstance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// handled clonnable violation
		throw new RuntimeException("can't be clonnable");
	}

	private Object readResolve() throws ObjectStreamException {
		// handled serilization violation
		// this method runs on top of deserialazion
		System.out.println("... read resolve ..");
		return soleInstance;
	}
}
