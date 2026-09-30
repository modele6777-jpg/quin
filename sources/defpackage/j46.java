package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j46 extends lg2 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final x79 e;
    public final vz9 f;
    public final /* synthetic */ l46 g;

    public j46(l46 l46Var, long j, boolean z, boolean z2, kb6 kb6Var) {
        this.g = l46Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        x79 x79Var = mec.a;
        this.e = new x79();
        this.f = new vz9(u8a.d, hj6.X0);
    }

    @Override // defpackage.lg2
    public final void a(rg2 rg2Var, l26 l26Var) {
        this.g.b.a(rg2Var, l26Var);
    }

    @Override // defpackage.lg2
    public final lec b(rg2 rg2Var, cfd cfdVar, l26 l26Var) {
        return this.g.b.b(rg2Var, cfdVar, l26Var);
    }

    @Override // defpackage.lg2
    public final void c(g49 g49Var) {
        this.g.b.c(g49Var);
    }

    @Override // defpackage.lg2
    public final void d() {
        this.g.A--;
    }

    @Override // defpackage.lg2
    public final boolean e() {
        return this.g.b.e();
    }

    @Override // defpackage.lg2
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.lg2
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.lg2
    public final long h() {
        return this.a;
    }

    @Override // defpackage.lg2
    public final kg2 i() {
        return this.g.h;
    }

    @Override // defpackage.lg2
    public final u8a j() {
        return (u8a) this.f.getValue();
    }

    @Override // defpackage.lg2
    public final pv2 k() {
        return this.g.b.k();
    }

    @Override // defpackage.lg2
    public final boolean l() {
        return this.g.b.l();
    }

    @Override // defpackage.lg2
    public final void m(g49 g49Var) {
        this.g.b.m(g49Var);
    }

    @Override // defpackage.lg2
    public final void n(rg2 rg2Var) {
        l46 l46Var = this.g;
        lg2 lg2Var = l46Var.b;
        lg2Var.n(l46Var.h);
        lg2Var.n(rg2Var);
    }

    @Override // defpackage.lg2
    public final void o(g49 g49Var, f49 f49Var, ac0 ac0Var) {
        this.g.b.o(g49Var, f49Var, ac0Var);
    }

    @Override // defpackage.lg2
    public final f49 p(g49 g49Var) {
        return this.g.b.p(g49Var);
    }

    @Override // defpackage.lg2
    public final lec q(rg2 rg2Var, cfd cfdVar, lec lecVar) {
        return this.g.b.q(rg2Var, cfdVar, lecVar);
    }

    @Override // defpackage.lg2
    public final void r(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.lg2
    public final void s(l46 l46Var) {
        this.e.e(l46Var);
    }

    @Override // defpackage.lg2
    public final void t(ojb ojbVar) {
        this.g.b.t(ojbVar);
    }

    @Override // defpackage.lg2
    public final void u(rg2 rg2Var) {
        this.g.b.u(rg2Var);
    }

    @Override // defpackage.lg2
    public final rl1 v(zv6 zv6Var) {
        return this.g.b.v(zv6Var);
    }

    @Override // defpackage.lg2
    public final void w() {
        this.g.A++;
    }

    @Override // defpackage.lg2
    public final void x(l46 l46Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                l46Var.getClass();
                set.remove(l46Var.z());
            }
        }
        if (l46Var != null) {
            this.e.m(l46Var);
        }
    }

    @Override // defpackage.lg2
    public final void y(rg2 rg2Var) {
        this.g.b.y(rg2Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void z() {
        x79 x79Var = this.e;
        if (x79Var.d()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = x79Var.b;
                long[] jArr = x79Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    l46 l46Var = (l46) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(l46Var.z());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            x79Var.f();
        }
    }
}
