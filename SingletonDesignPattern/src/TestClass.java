import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClass {
	public static void main(String[] args) throws Exception {
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		print("obj1", obj1);
		print("obj2", obj2);

		// we can break SinglePattern in many ways

		// 1.using Reflection
//		Class c = Class.forName("SingleTon");
//		System.out.println("using reflection");
//		Constructor<SingleTon> constructor = c.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		SingleTon obj3 = constructor.newInstance();
//		print("obj3", obj3);

		// 2. making SingleTon class Serializable
		System.out.println("serialization and desrialization ....");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/s.ser"));
		oos.writeObject(obj1);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/s.ser"));
		SingleTon obj4 = (SingleTon) ois.readObject();
		print("obj4", obj4);

		// 3. making SingleTon class cloneable
		SingleTon obj5 = (SingleTon) obj1.clone();
		print("obj5", obj5);

		// 4.multithreaded access
		// 5.multiple classLoader

		SingletonEnum singletonEnum=SingletonEnum.INSTANCE;
		prints("singletonEnum", singletonEnum);
		
	}

	private static void print(String name, SingleTon obj) {
		System.out.println(String.format("Object : %s,Hashcode :%d", name, obj.hashCode()));
	}
	private static void prints(String name, SingletonEnum obj) {
		System.out.println(String.format("Object : %s,Hashcode :%d", name, obj.hashCode()));
	}
	
}
