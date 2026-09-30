package defpackage;

import android.net.Uri;
import com.adjust.sdk.sig.r3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dc3 {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        pp8.a("media3.datasource");
    }

    public dc3(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        pa7.A(j + j2 >= 0);
        pa7.A(j2 >= 0);
        pa7.A(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        r3.l();
        return null;
    }

    public final cc3 a() {
        cc3 cc3Var = new cc3();
        cc3Var.a = this.a;
        cc3Var.b = this.b;
        cc3Var.c = this.c;
        cc3Var.d = this.d;
        cc3Var.e = this.e;
        cc3Var.f = this.f;
        cc3Var.g = this.g;
        cc3Var.h = this.h;
        cc3Var.i = this.i;
        return cc3Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return tec.g(this.i, "]", sb);
    }
}
