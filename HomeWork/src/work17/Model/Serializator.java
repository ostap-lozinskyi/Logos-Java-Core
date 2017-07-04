package work17.Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import work17.ZooClub;

public class Serializator {
	public void serialize(ZooClub zooClub) {
		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream(new File("save.save"), true);
			oos = new ObjectOutputStream(os);
			oos.writeObject(zooClub);
			System.out.println("Зооклуб записано");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void serializeOverride(ZooClub zooClub) {
		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream(new File("save.save"));
			oos = new ObjectOutputStream(os);
			oos.writeObject(zooClub);
			System.out.println("Зооклуб перезаписано");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public ZooClub readFromFile() {
		ZooClub zooClub = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("save.save")))) {
			zooClub = (ZooClub) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return zooClub;
	}
}
