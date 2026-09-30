package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bkb implements ac0 {
    public final p69 a = new p69();
    public final i79 b = new i79();
    public final Object c;

    public bkb(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.ac0
    public final void a(int i, Object obj) {
        p69 p69Var = this.a;
        p69Var.c(5);
        p69Var.c(i);
        this.b.h(obj);
    }

    public final void b(taf tafVar, bw bwVar) {
        Exception exc;
        p69 p69Var = this.a;
        int i = p69Var.b;
        i79 i79Var = new i79();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i79 i79Var2 = this.b;
            if (i2 >= i) {
                if (i3 != i79Var2.b) {
                    wf2.a("Applier operation size mismatch");
                }
                i79Var2.k();
                p69Var.b = 0;
                tafVar.n();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (p69Var.a(i2)) {
                        case 0:
                            tafVar.l();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            tafVar.d(i79Var2.b(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            tafVar.g(p69Var.a(i4), p69Var.a(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    tafVar.f(p69Var.a(i4), p69Var.a(i7), p69Var.a(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            tafVar.b();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            tafVar.a(p69Var.a(i4), i79Var2.b(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                p69Var.a(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objB = i79Var2.b(i3);
                            objB.getClass();
                            z7f.t(2, objB);
                            i3 += 2;
                            tafVar.k((l26) objB, i79Var2.b(i11));
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = tafVar.c;
                            if (obj instanceof ue2) {
                                ue2 ue2Var = (ue2) obj;
                                if (((p89) bwVar.f).j(ue2Var)) {
                                    ue2Var.d();
                                }
                            }
                            i79Var.h(obj);
                            tafVar.e();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Throwable th) {
                    tafVar.n();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new we2(i79Var2, i79Var, p69Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.ac0
    public final void d(Object obj) {
        this.a.c(1);
        this.b.h(obj);
    }

    @Override // defpackage.ac0
    public final void e() {
        this.a.c(8);
    }

    @Override // defpackage.ac0
    public final void f(int i, int i2, int i3) {
        p69 p69Var = this.a;
        p69Var.c(3);
        p69Var.c(i);
        p69Var.c(i2);
        p69Var.c(i3);
    }

    @Override // defpackage.ac0
    public final void g(int i, int i2) {
        p69 p69Var = this.a;
        p69Var.c(2);
        p69Var.c(i);
        p69Var.c(i2);
    }

    @Override // defpackage.ac0
    public final void k(l26 l26Var, Object obj) {
        this.a.c(7);
        i79 i79Var = this.b;
        i79Var.h(l26Var);
        i79Var.h(obj);
    }

    @Override // defpackage.ac0
    public final void l() {
        this.a.c(0);
    }

    @Override // defpackage.ac0
    public final void m(int i, Object obj) {
        p69 p69Var = this.a;
        p69Var.c(6);
        p69Var.c(i);
        this.b.h(obj);
    }

    @Override // defpackage.ac0
    public final Object o() {
        return this.c;
    }
}
