import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingleTon implements Cloneable, Serializable {
	// added volatile keyword to restrict half created object

	private static volatile SingleTon soleInstance = null;

	private SingleTon() {
		super();
		if (soleInstance != null) {
			// handled reflection api violation
			throw new RuntimeException("can't create ,use getInstance()");
		}
		System.out.println("creating ....");
	}

	public static synchronized SingleTon getInstance() {
//		// added synchronized to handle multithread violation
//
//		// double check lock
//		if (soleInstance == null) { // check1
//			synchronized (SingleTon.class) {
//				if (soleInstance == null) { // check 2
//					soleInstance = new SingleTon();
//				}
//			}
//		}
//		return soleInstance;

		return Holder.INSTANCE;
	}

	// using static Singleton Holder
	static class Holder {
		static final SingleTon INSTANCE = new SingleTon();
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
