package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uf implements ef1 {
    public final ef1 b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uf(ef1 ef1Var, r45 r45Var) {
        this(ef1Var, (byte) 0);
        this.c = 1;
        this.d = r45Var;
    }

    @Override // defpackage.ef1
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.ef1
    public final void b(vzc vzcVar) {
        this.b.b(vzcVar);
    }

    @Override // defpackage.ef1
    public final void c(qh2 qh2Var) {
        this.b.c(qh2Var);
    }

    @Override // defpackage.ef1
    public final void d(int i) {
        this.b.d(i);
    }

    @Override // defpackage.ef1
    public final void e(vfc vfcVar) {
        this.b.e(vfcVar);
    }

    @Override // defpackage.ef1
    public m88 f(ArrayList arrayList, int i, int i2) {
        int i3 = this.c;
        ef1 ef1Var = this.b;
        switch (i3) {
            case 1:
                final int i4 = 0;
                final int i5 = 1;
                ok8.k("Only support one capture config.", arrayList.size() == 1);
                final m88 m88VarJ = ef1Var.j(i);
                return new o78(new ArrayList(Collections.singletonList(bm8.d0(bm8.d0(bm8.d0(m88VarJ instanceof t36 ? (t36) m88VarJ : new t36(m88VarJ), new tg0() { // from class: ayf
                    @Override // defpackage.tg0
                    /* JADX INFO: renamed from: apply */
                    public final m88 mo34apply(Object obj) {
                        int i6 = i4;
                        m88 m88Var = m88VarJ;
                        switch (i6) {
                            case 0:
                                return ((ne1) m88Var.get()).a();
                            default:
                                return ((ne1) m88Var.get()).b();
                        }
                    }
                }, g94.a()), new bo1(28, this, arrayList), g94.a()), new tg0() { // from class: ayf
                    @Override // defpackage.tg0
                    /* JADX INFO: renamed from: apply */
                    public final m88 mo34apply(Object obj) {
                        int i6 = i5;
                        m88 m88Var = m88VarJ;
                        switch (i6) {
                            case 0:
                                return ((ne1) m88Var.get()).a();
                            default:
                                return ((ne1) m88Var.get()).b();
                        }
                    }
                }, g94.a()))), true, g94.a());
            default:
                return ef1Var.f(arrayList, i, i2);
        }
    }

    @Override // defpackage.ef1
    public m88 g(boolean z) {
        switch (this.c) {
            case 0:
                return ((ef1) this.d).g(z);
            default:
                return this.b.g(z);
        }
    }

    @Override // defpackage.ef1
    public final qh2 h() {
        return this.b.h();
    }

    @Override // defpackage.ef1
    public final void i() {
        this.b.i();
    }

    @Override // defpackage.ef1
    public final m88 j(int i) {
        return this.b.j(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uf(ef1 ef1Var) {
        this(ef1Var, (byte) 0);
        this.c = 0;
        this.d = ef1Var;
    }

    public uf(ef1 ef1Var, byte b) {
        this.b = ef1Var;
    }
}
