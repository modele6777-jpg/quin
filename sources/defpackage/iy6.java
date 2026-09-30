package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iy6 extends o2 {
    public final i4 a;
    public final int b;
    public final int c;

    public iy6(i4 i4Var, int i, int i2) {
        this.a = i4Var;
        this.b = i;
        lmg.U(i, i2, i4Var.c());
        this.c = i2 - i;
    }

    @Override // defpackage.d1
    public final int c() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lmg.S(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.o2, java.util.List
    public final List subList(int i, int i2) {
        lmg.U(i, i2, this.c);
        int i3 = this.b;
        return new iy6(this.a, i + i3, i3 + i2);
    }
}
