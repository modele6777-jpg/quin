package defpackage;

import android.os.SystemClock;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ri1 {
    public int a;
    public long b;
    public Object c;

    public ri1(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof nk1) {
            this.a = 2;
            this.c = exc;
            return;
        }
        if (!(exc instanceof a37)) {
            this.a = 0;
            this.c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.c = exc;
        if (exc instanceof ck1) {
            this.a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.a = 1;
        } else {
            this.a = 0;
        }
    }

    public ri1(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }
}
