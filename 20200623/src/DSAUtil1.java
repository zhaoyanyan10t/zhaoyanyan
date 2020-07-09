import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.xml.bind.DatatypeConverter;

public class DSAUtil1 {
    private static String src = "hello";

    public static void main(String[] args) {
        jdkDSA();
    }

    public static void jdkDSA() {
        // 1. 初始化 秘钥
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("DSA");
            generator.initialize(512);

            KeyPair keyPair = generator.generateKeyPair();
            DSAPublicKey dsaPublicKey = (DSAPublicKey) keyPair.getPublic();
            DSAPrivateKey dsaPrivateKey = (DSAPrivateKey) keyPair.getPrivate();

            // 2。 执行签名
            PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(dsaPrivateKey.getEncoded());
            KeyFactory factory = KeyFactory.getInstance("DSA");
            PrivateKey privateKey = factory.generatePrivate(pkcs8EncodedKeySpec);

            Signature signature = Signature.getInstance("SHA1withDSA");
            signature.initSign(privateKey);
            signature.update(src.getBytes());
            byte[] sign = signature.sign();
            System.out.println(DatatypeConverter.printHexBinary(sign));
            // 验证签名
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(dsaPublicKey.getEncoded());

            factory = KeyFactory.getInstance("DSA");
            PublicKey publicKey = factory.generatePublic(x509EncodedKeySpec);

            signature = Signature.getInstance("SHA1withDSA");
            signature.initVerify(publicKey);
            signature.update(src.getBytes());

            boolean verify = signature.verify(sign);

            System.out.println("经验证数据和签名匹配："+verify);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
