package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class rff extends l0a {
    public final jy6 sniffFailures;
    public final Uri uri;

    public rff(String str, Uri uri, yob yobVar) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = jy6.o(yobVar);
    }

    @Override // defpackage.l0a, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        if (this.sniffFailures.isEmpty()) {
            return message;
        }
        StringBuilder sbQ = kv2.q(message, "\nsniff failures: ");
        sbQ.append(this.sniffFailures);
        return sbQ.toString();
    }
}
