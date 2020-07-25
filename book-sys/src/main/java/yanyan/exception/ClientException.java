package yanyan.exception;

//客户端异常
public class ClientException extends BaseException{

    public ClientException(String code, String message) {
        super("CLI"+code, "客户端错误:"+message);
    }

    public ClientException(String code, String message, Throwable cause) {
        super("CLI"+code, "客户端错误:"+message, cause);
    }
}
