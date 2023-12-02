package exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AmountExceedsListSize extends RuntimeException{
    public AmountExceedsListSize() {
    }

    public AmountExceedsListSize(String message) {
        super(message);
    }

    public AmountExceedsListSize(String message, Throwable cause) {
        super(message, cause);
    }

    public AmountExceedsListSize(Throwable cause) {
        super(cause);
    }

    public AmountExceedsListSize(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
