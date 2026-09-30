package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h1f {
    public final int a;
    public final String b;
    public final int c;
    public final rr5[] d;
    public int e;

    static {
        pqf.D(0);
        pqf.D(1);
    }

    public h1f(String str, rr5... rr5VarArr) {
        pa7.A(rr5VarArr.length > 0);
        this.b = str;
        this.d = rr5VarArr;
        this.a = rr5VarArr.length;
        String str2 = rr5VarArr[0].p;
        this.c = TextUtils.isEmpty(str2) ? qv8.g(rr5VarArr[0].o) : qv8.g(str2);
        String str3 = rr5VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = rr5VarArr[0].f | 16384;
        for (int i2 = 1; i2 < rr5VarArr.length; i2++) {
            String str4 = rr5VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                a(i2, "languages", rr5VarArr[0].d, rr5VarArr[i2].d);
                return;
            } else {
                if (i != (rr5VarArr[i2].f | 16384)) {
                    a(i2, "role flags", Integer.toBinaryString(rr5VarArr[0].f), Integer.toBinaryString(rr5VarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void a(int i, String str, String str2, String str3) {
        StringBuilder sbO = ib8.o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbO.append(str3);
        sbO.append("' (track ");
        sbO.append(i);
        sbO.append(")");
        xo1.y("TrackGroup", "", new IllegalStateException(sbO.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1f.class == obj.getClass()) {
            h1f h1fVar = (h1f) obj;
            if (this.b.equals(h1fVar.b) && Arrays.equals(this.d, h1fVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.d) + ub3.c(527, 31, this.b);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
