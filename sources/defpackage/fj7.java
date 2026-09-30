package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fj7 extends dj7 {
    public final ti7 j;
    public final List k;
    public final int l;
    public int m;

    public fj7(wg7 wg7Var, ti7 ti7Var) {
        super(wg7Var, ti7Var, (String) null, 12);
        this.j = ti7Var;
        List listJ1 = s72.j1(ti7Var.a.keySet());
        this.k = listJ1;
        this.l = listJ1.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.dj7, defpackage.h2
    public final nh7 F(String str) {
        str.getClass();
        return this.m % 2 == 0 ? oh7.c(str) : (nh7) bm8.B(this.j, str);
    }

    @Override // defpackage.dj7, defpackage.h2
    public final String R(nyc nycVar, int i) {
        nycVar.getClass();
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.dj7, defpackage.h2
    public final nh7 T() {
        return this.j;
    }

    @Override // defpackage.dj7
    /* JADX INFO: renamed from: Y */
    public final ti7 T() {
        return this.j;
    }

    @Override // defpackage.dj7, defpackage.h2, defpackage.zf2
    public final void b(nyc nycVar) {
        nycVar.getClass();
    }

    @Override // defpackage.dj7, defpackage.zf2
    public final int j(nyc nycVar) {
        nycVar.getClass();
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
