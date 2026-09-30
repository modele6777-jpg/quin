package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h9g {
    public final int a;
    public final int b;

    public h9g(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h9g.class == obj.getClass()) {
            h9g h9gVar = (h9g) obj;
            int i = h9gVar.a;
            Set set = i9g.b;
            if (this.a == i) {
                int i2 = h9gVar.b;
                Set set2 = d7g.b;
                if (this.b == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set set = i9g.b;
        int iHashCode = Integer.hashCode(this.a) * 31;
        Set set2 = d7g.b;
        return Integer.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "WindowSizeClass(" + ((Object) i9g.a(this.a)) + ", " + ((Object) d7g.a(this.b)) + ')';
    }
}
