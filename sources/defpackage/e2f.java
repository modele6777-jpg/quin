package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e2f {
    public final int a;
    public final h1f b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        pqf.D(0);
        pqf.D(1);
        pqf.D(3);
        pqf.D(4);
    }

    public e2f(h1f h1fVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = h1fVar.a;
        this.a = i;
        boolean z2 = false;
        pa7.A(i == iArr.length && i == zArr.length);
        this.b = h1fVar;
        if (z && i > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e2f.class != obj.getClass()) {
            return false;
        }
        e2f e2fVar = (e2f) obj;
        return this.c == e2fVar.c && this.b.equals(e2fVar.b) && Arrays.equals(this.d, e2fVar.d) && Arrays.equals(this.e, e2fVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
