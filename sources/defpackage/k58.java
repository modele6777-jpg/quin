package defpackage;

import android.graphics.LightingColorFilter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k58 extends c82 {
    public final long b;
    public final long c;

    public k58(long j, long j2) {
        super(new LightingColorFilter(abg.Z(j), abg.Z(j2)));
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k58)) {
            return false;
        }
        k58 k58Var = (k58) obj;
        long j = k58Var.b;
        int i = y72.l;
        return faf.a(this.b, j) && faf.a(this.c, k58Var.c);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return tec.m("LightingColorFilter(multiply=", y72.h(this.b), ", add=", y72.h(this.c), ")");
    }
}
