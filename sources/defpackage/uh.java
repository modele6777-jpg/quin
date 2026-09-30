package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uh {
    public static final List b = t72.I(new uh(0), new uh(1), new uh(2), new uh(3), new uh(4), new uh(5));
    public final int a;

    public /* synthetic */ uh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uh) {
            return this.a == ((uh) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return tec.k("AfMode(value=", this.a, ')');
    }
}
