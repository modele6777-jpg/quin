package com.adjust.sdk.sig;

import defpackage.ib8;
import defpackage.ks0;
import defpackage.qc0;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends d implements RandomAccess {
    public final d a;
    public final int b;
    public final int c;

    public c(d dVar, int i, int i2) {
        this.a = dVar;
        this.b = i;
        int iA = dVar.a();
        if (i < 0 || i2 > iA) {
            r3.g(iA, ib8.n(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
            throw null;
        }
        if (i <= i2) {
            this.c = i2 - i;
        } else {
            qc0.j(ks0.k("fromIndex: ", i, " > toIndex: ", i2));
            throw null;
        }
    }

    @Override // com.adjust.sdk.sig.d
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.a.get(this.b + i);
        }
        r3.i(ks0.k("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // com.adjust.sdk.sig.d, java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.c;
        if (i < 0 || i2 > i3) {
            r3.g(i3, ib8.n(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
            return null;
        }
        if (i > i2) {
            qc0.j(ks0.k("fromIndex: ", i, " > toIndex: ", i2));
            return null;
        }
        d dVar = this.a;
        int i4 = this.b;
        return new c(dVar, i + i4, i4 + i2);
    }
}
