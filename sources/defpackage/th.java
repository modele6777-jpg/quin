package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class th {
    public static final List b = t72.I(new th(0), new th(1), new th(2), new th(3), new th(4), new th(5), new th(6));
    public final int a;

    public /* synthetic */ th(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof th) {
            return this.a == ((th) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return tec.k("AeMode(value=", this.a, ')');
    }
}
