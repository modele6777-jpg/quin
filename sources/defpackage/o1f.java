package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o1f {
    public final h1f a;
    public final jy6 b;

    static {
        pqf.D(0);
        pqf.D(1);
    }

    public o1f(h1f h1fVar, yob yobVar) {
        if (!yobVar.isEmpty() && (((Integer) Collections.min(yobVar)).intValue() < 0 || ((Integer) Collections.max(yobVar)).intValue() >= h1fVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = h1fVar;
        this.b = jy6.o(yobVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o1f.class != obj.getClass()) {
            return false;
        }
        o1f o1fVar = (o1f) obj;
        return this.a.equals(o1fVar.a) && this.b.equals(o1fVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
