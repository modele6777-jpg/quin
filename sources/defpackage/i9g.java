package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i9g implements Comparable {
    public static final Set b;
    public static final List c;
    public final int a;

    static {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        b = qd0.I0(new i9g[]{new i9g(i), new i9g(i2), new i9g(i3)});
        List listI = t72.I(new i9g(i3), new i9g(i2), new i9g(i));
        c = listI;
        s72.o1(listI);
    }

    public /* synthetic */ i9g(int i) {
        this.a = i;
    }

    public static String a(int i) {
        String str;
        StringBuilder sb = new StringBuilder("WindowWidthSizeClass.");
        if (i == 0) {
            str = "Compact";
        } else if (i == 1) {
            str = "Medium";
        } else {
            str = i == 2 ? "Expanded" : "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return yi4.a(o8c.i(this.a), o8c.i(((i9g) obj).a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i9g) {
            return this.a == ((i9g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
