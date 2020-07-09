import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class test5 {

    public static final String KEY_ALGORITHM = "DSA";
    public static final String SIGNATURE_ALGORITHM = "DSA";
    public static final String DEFAULT_SEED = "see"; //默认种子
    public static final String PUBLIC_KEY = "we";
    public static final String PRIVATE_KEY = "df";

    public static void main(String[] args) throws Exception {
        String str = "ftyh";
        byte[] data = str.getBytes();
        Map<String, Object> keyMap = initKey();// 构建密钥
        PublicKey publicKey = (PublicKey) keyMap.get(PUBLIC_KEY);
        PrivateKey privateKey = (PrivateKey) keyMap.get(PRIVATE_KEY);
        System.out.println("私钥" + privateKey.getFormat());
        System.out.println("公钥" + publicKey.getFormat());
        // 产生签名
        String sign = sign(data, getPrivateKey(keyMap));
        // 验证签名
        boolean verify1 = verify("wer".getBytes(), getPublicKey(keyMap), sign);
        System.err.println("经验证数据和签名匹配:" + verify1);
        boolean verify = verify(data, getPublicKey(keyMap), sign);
        System.err.println("经验证数据和签名匹配:" + verify);
    }

     // 生成密钥
    public static Map<String, Object> initKey(String seed) throws Exception {
        System.out.println("生成密钥");
        KeyPairGenerator keygen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(seed.getBytes());
        keygen.initialize(640, secureRandom);
        KeyPair keys = keygen.genKeyPair();
        PrivateKey privateKey = keys.getPrivate();
        PublicKey publicKey = keys.getPublic();
        Map<String, Object> map = new HashMap<String, Object>(2);
        map.put(PUBLIC_KEY, publicKey);
        map.put(PRIVATE_KEY, privateKey);
        return map;
    }

     // 生成默认密钥
    public static Map<String, Object> initKey() throws Exception {
        return initKey(DEFAULT_SEED);
    }

     // 取得私钥
    public static String getPrivateKey(Map<String, Object> keyMap) throws Exception {
        Key key = (Key) keyMap.get(PRIVATE_KEY);
        return encryptBASE64(key.getEncoded());
        //base64加密私钥
    }

     // 取得公钥
    public static String getPublicKey(Map<String, Object> keyMap) throws Exception {
        Key key = (Key) keyMap.get(PUBLIC_KEY);
        return encryptBASE64(key.getEncoded()); //base64加密公钥
    }

     //  用私钥对信息进行数字签名
    public static String sign(byte[] data, String privateKey) throws Exception {
        System.out.println("用私钥对信息进行数字签名");
        byte[] keyBytes = decryptBASE64(privateKey);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory factory = KeyFactory.getInstance(KEY_ALGORITHM);
        PrivateKey priKey = factory.generatePrivate(keySpec);//生成 私钥
        //用私钥对信息进行数字签名
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initSign(priKey);
        signature.update(data);
        return encryptBASE64(signature.sign());
    }

    //BASE64Encoder 加密
    private static String encryptBASE64(byte[] data) {
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(data);
        return encode;
    }

     // 解密
    private static byte[] decryptBASE64(String data) throws Exception {
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] buffer = decoder.decodeBuffer(data);
        return buffer;
    }

     // 校验数字签名
    public static boolean verify(byte[] data, String publicKey, String sign) throws Exception {
        byte[] keyBytes = decryptBASE64(publicKey);
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        PublicKey pubKey = keyFactory.generatePublic(keySpec);
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initVerify(pubKey);
        signature.update(data);
        return signature.verify(decryptBASE64(sign)); //验证签名
    }
}
