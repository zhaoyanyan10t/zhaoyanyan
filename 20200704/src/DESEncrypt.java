import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.swing.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.*;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class DESEncrypt {
	Key key;

	public DESEncrypt(String str) {
	    getKey(str);//生成密匙
	  }

	/**
	 * 根据参数生成KEY
	 */
	public void getKey(String strKey) {
		try {
			KeyGenerator generator = KeyGenerator.getInstance("DES");
			generator.init(new SecureRandom(strKey.getBytes()));
			this.key = generator.generateKey();
			generator = null;
		} catch (Exception e) {
			throw new RuntimeException("Error initializing SqlMap class. Cause: " + e);
		}
	}

	/**
	 * 文件file进行加密并保存目标文件destFile中
	 *
	 * @param file 要加密的文件
	 * @param destFile 加密后存放的文件名
	 */
	public void encrypt(String file, String destFile) throws Exception {
		Cipher cipher = Cipher.getInstance("DES");
		// cipher.init(Cipher.ENCRYPT_MODE, getKey());
		cipher.init(Cipher.ENCRYPT_MODE, this.key);
		InputStream is = new FileInputStream(file);
		OutputStream out = new FileOutputStream(destFile);
		CipherInputStream cis = new CipherInputStream(is, cipher);
		byte[] buffer = new byte[1024];
		int r;
		while ((r = cis.read(buffer)) > 0) {
			out.write(buffer, 0, r);
		}
		cis.close();
		is.close();
		out.close();
		JOptionPane.showMessageDialog(null, "加密成功！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * 文件采用DES算法解密文件
	 * 
	 * @param file 已加密的文件
	 * //@param destFile 解密后存放的文件名
	 */
	public void decrypt(String file, String dest) throws Exception {
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.DECRYPT_MODE, this.key);
		InputStream is = new FileInputStream(file);
		OutputStream out = new FileOutputStream(dest);
		CipherOutputStream cos = new CipherOutputStream(out, cipher);
		byte[] buffer = new byte[1024];
		int r;
		while ((r = is.read(buffer)) >= 0) {
			cos.write(buffer, 0, r);
		}
		cos.close();
		out.close();
		is.close();
		JOptionPane.showMessageDialog(null, "解密成功！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
	}


	public class FileTransferHandler extends TransferHandler {
		private static final long serialVersionUID = 1L;
		private JTextField textarea;

		public FileTransferHandler(JTextField filePathList) {
			this.textarea = filePathList;
		}

		public boolean importData(JComponent c, Transferable t) {
			try {
				List<?> files = (List<?>) t.getTransferData(DataFlavor.javaFileListFlavor);
				// FileReader reader = new FileReader((File)files.get(0));
				// textarea.read(reader, null);
				Iterator<?> iterator = files.iterator();
				while (iterator.hasNext()) {
					File f = (File) iterator.next();
					if (f.isFile()) {
						textarea.setText(f.getAbsolutePath());
					} else {
						textarea.setText("不是标准文件");
					}
				}
				// reader.close();
				return true;
			} catch (UnsupportedFlavorException ufe) {
				ufe.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return false;
		}

		public boolean canImport(JComponent c, DataFlavor[] flavors) {
			for (int i = 0; i < flavors.length; i++) {
				if (DataFlavor.javaFileListFlavor.equals(flavors[i])) {
					return true;
				}
			}
			return false;
		}
	}
}




