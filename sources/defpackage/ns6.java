package defpackage;

import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ns6 extends bc3 {
    public final dc3 dataSpec;
    public final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    public ns6(IOException iOException, dc3 dc3Var, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(i, iOException);
        this.dataSpec = dc3Var;
        this.type = i2;
    }

    public static ns6 a(IOException iOException, dc3 dc3Var, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = ErrorCodes.PROTOCOL_EXCEPTION;
        } else {
            i2 = (message == null || !bm8.V(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new ms6("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, dc3Var, 2007) : new ns6(iOException, dc3Var, i2, i);
    }

    public ns6(String str, dc3 dc3Var, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.dataSpec = dc3Var;
        this.type = 1;
    }

    public ns6(dc3 dc3Var, int i) {
        super(i == 2000 ? 2001 : i);
        this.dataSpec = dc3Var;
        this.type = 1;
    }

    public ns6(String str, IOException iOException, dc3 dc3Var, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.dataSpec = dc3Var;
        this.type = 1;
    }
}
