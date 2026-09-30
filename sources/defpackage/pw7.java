package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pw7 implements zy7 {
    public final jx7 a;

    public pw7(jx7 jx7Var) {
        this.a = jx7Var;
    }

    @Override // defpackage.zy7
    public final int a() {
        return this.a.g().q;
    }

    @Override // defpackage.zy7
    public final int b() {
        return ((ax7) s72.F0(this.a.g().n)).a;
    }

    @Override // defpackage.zy7
    public final int c() {
        int i;
        jx7 jx7Var = this.a;
        int i2 = 0;
        if (jx7Var.g().n.isEmpty()) {
            return 0;
        }
        zw7 zw7VarG = jx7Var.g();
        ks9 ks9Var = zw7VarG.r;
        ks9 ks9Var2 = ks9.a;
        int i3 = (int) (ks9Var == ks9Var2 ? zw7VarG.i() & 4294967295L : zw7VarG.i() >> 32);
        zw7 zw7VarG2 = jx7Var.g();
        ks9 ks9Var3 = zw7VarG2.r;
        List list = zw7VarG2.n;
        boolean z = ks9Var3 == ks9Var2;
        if (!list.isEmpty()) {
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < list.size()) {
                ax7 ax7Var = (ax7) list.get(i4);
                int i7 = z ? ax7Var.x : ax7Var.y;
                if (i7 == -1) {
                    i4++;
                } else {
                    int iMax = 0;
                    while (i4 < list.size()) {
                        ax7 ax7Var2 = (ax7) list.get(i4);
                        if ((z ? ax7Var2.x : ax7Var2.y) != i7) {
                            break;
                        }
                        iMax = Math.max(iMax, (int) (z ? ((ax7) list.get(i4)).v & 4294967295L : ((ax7) list.get(i4)).v >> 32));
                        i4++;
                    }
                    i5 += iMax;
                    i6++;
                }
            }
            i2 = (i5 / i6) + zw7VarG2.t;
        }
        if (i2 != 0 && (i = i3 / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.zy7
    public final boolean d() {
        return !this.a.g().n.isEmpty();
    }

    @Override // defpackage.zy7
    public final int e() {
        return this.a.d.b.j();
    }
}
