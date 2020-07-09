import java.security.*;
import java.util.Base64;
import java.util.Scanner;

public class RSAUtilTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("原始字符串是：");
        String content = sc.nextLine();   // 明文内容
        System.out.println(content);
        try {
            // 获得密钥对
            KeyPair keyPair = test3.getKeyPair();
            // 获得进行Base64 加密后的公钥和私钥 String
            String privateKeyStr =test3.getPrivateKey(keyPair);
            String publicKeyStr = test3.getPublicKey(keyPair);
            System.out.println("Base64处理后的私钥：" + privateKeyStr + "\n"
                + "Base64处理后的公钥：" + publicKeyStr);
            // 获得原始的公钥和私钥，并以字符串形式打印出来
            PrivateKey privateKey = test3.string2Privatekey(privateKeyStr);
            PublicKey publicKey = test3.string2PublicKey(publicKeyStr);
            // 公钥加密/私钥解密
            byte[] publicEncryBytes =  test3.publicEncrytype(content.getBytes(), publicKey);
            System.out.println("公钥加密后的字符串(经BASE64处理)：" + Base64.getEncoder().encodeToString(publicEncryBytes));
            byte[] privateDecryBytes = test3.privateDecrypt(publicEncryBytes, privateKey);
            System.out.println("私钥解密后的原始字符串：" + new String(privateDecryBytes));
            String privateDecryStr = new String(privateDecryBytes, "utf-8");
            if (content.equals(privateDecryStr)){
                System.out.println("测试通过！");
            }else {
                System.out.println("测试未通过！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
