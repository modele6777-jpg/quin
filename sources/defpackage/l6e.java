package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l6e implements cyc, pq4 {
    public final cyc a;
    public final int b;
    public final int c;

    public l6e(cyc cycVar, int i, int i2) {
        cycVar.getClass();
        this.a = cycVar;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            qc0.o(tec.e(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            qc0.o(tec.e(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        qc0.o(ks0.k("endIndex should be not less than startIndex, but was ", i2, " < ", i));
        throw null;
    }

    @Override // defpackage.pq4
    public final cyc a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new l6e(this.a, i3, i + i3);
    }

    @Override // defpackage.pq4
    public final cyc b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? wu4.a : new l6e(this.a, i3 + i, i2);
    }

    @Override // defpackage.cyc
    public final Iterator iterator() {
        return new l66(this);
    }
}
