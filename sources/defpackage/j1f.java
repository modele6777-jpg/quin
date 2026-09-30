package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j1f {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public j1f(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1f.class != obj.getClass()) {
            return false;
        }
        j1f j1fVar = (j1f) obj;
        return this.a == j1fVar.a && this.c == j1fVar.c && this.d == j1fVar.d && Arrays.equals(this.b, j1fVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
