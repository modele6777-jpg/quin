package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ixa implements occ {
    public final int a;
    public final boolean b;
    public final /* synthetic */ lxa c;

    public ixa(lxa lxaVar, int i, boolean z) {
        this.c = lxaVar;
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.occ
    public final boolean a() {
        lxa lxaVar = this.c;
        return !lxaVar.D() && lxaVar.J0[this.a].m(lxaVar.g1);
    }

    @Override // defpackage.occ
    public final int b() {
        return this.b ? 4 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    @Override // defpackage.occ
    public final int c(fz3 fz3Var, tm3 tm3Var, int i) {
        rr5 rr5Var;
        int i2;
        int i3;
        lxa lxaVar = this.c;
        int i4 = this.a;
        if (lxaVar.D()) {
            return -3;
        }
        lxaVar.w(i4);
        ncc nccVar = lxaVar.J0[i4];
        boolean z = lxaVar.g1;
        nccVar.getClass();
        boolean z2 = (i & 2) != 0;
        ri1 ri1Var = nccVar.b;
        synchronized (nccVar) {
            try {
                tm3Var.f = false;
                int i5 = nccVar.q;
                int i6 = nccVar.s;
                int i7 = i5 + i6;
                int i8 = nccVar.x;
                boolean z3 = i8 != -1 && i7 >= i8;
                if (i6 != nccVar.p) {
                    if ((i8 == -1 && (i3 = nccVar.y) != -1 && i5 + i6 >= i3) || z3) {
                        if (!z) {
                            rr5Var = nccVar.C;
                            if (rr5Var != null) {
                            }
                            i2 = -3;
                        }
                        tm3Var.b = 4;
                        tm3Var.g = Long.MIN_VALUE;
                        i2 = -4;
                    } else {
                        rr5 rr5Var2 = ((mcc) nccVar.c.g(i7)).a;
                        if (!z2 && rr5Var2 == nccVar.g) {
                            int iK = nccVar.k(nccVar.s);
                            if (nccVar.n(iK)) {
                                tm3Var.b = nccVar.m[iK];
                                if (nccVar.s == nccVar.p - 1 && (z || nccVar.z)) {
                                    tm3Var.a(536870912);
                                }
                                tm3Var.g = nccVar.n[iK];
                                ri1Var.a = nccVar.l[iK];
                                ri1Var.b = nccVar.k[iK];
                                ri1Var.c = nccVar.o[iK];
                                i2 = -4;
                            } else {
                                tm3Var.f = true;
                                i2 = -3;
                            }
                        }
                        nccVar.o(rr5Var2, fz3Var);
                        i2 = -5;
                    }
                } else {
                    if (!z && !nccVar.z && !z3) {
                        rr5Var = nccVar.C;
                        if (rr5Var != null || (!z2 && rr5Var == nccVar.g)) {
                            i2 = -3;
                        } else {
                            nccVar.o(rr5Var, fz3Var);
                            i2 = -5;
                        }
                    }
                    tm3Var.b = 4;
                    tm3Var.g = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !tm3Var.d(4)) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                lcc lccVar = nccVar.a;
                ri1 ri1Var2 = nccVar.b;
                y21 y21Var = lccVar.e;
                if (z4) {
                    lcc.e(y21Var, tm3Var, ri1Var2, lccVar.c);
                } else {
                    lccVar.e = lcc.e(y21Var, tm3Var, ri1Var2, lccVar.c);
                }
            }
            if (!z4) {
                nccVar.s++;
            }
        }
        if (i2 == -3) {
            lxaVar.x(i4);
        }
        return i2;
    }

    @Override // defpackage.occ
    public final void d() throws IOException {
        int i = this.a;
        lxa lxaVar = this.c;
        ncc nccVar = lxaVar.J0[i];
        ssg ssgVar = nccVar.h;
        if (ssgVar != null && ssgVar.I() == 1) {
            yp4 yp4VarG = nccVar.h.G();
            yp4VarG.getClass();
            throw yp4VarG;
        }
        ta0 ta0Var = lxaVar.z;
        int iJ = lxaVar.d.j(lxaVar.T0);
        IOException iOException = (IOException) ta0Var.b;
        if (iOException != null) {
            throw iOException;
        }
        x98 x98Var = (x98) ta0Var.d;
        if (x98Var != null) {
            if (iJ == Integer.MIN_VALUE) {
                iJ = x98Var.a;
            }
            IOException iOException2 = x98Var.e;
            if (iOException2 != null && x98Var.f > iJ) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.occ
    public final int e(long j) {
        int iJ;
        lxa lxaVar = this.c;
        int i = this.a;
        boolean z = false;
        if (lxaVar.D()) {
            return 0;
        }
        lxaVar.w(i);
        ncc nccVar = lxaVar.J0[i];
        boolean z2 = lxaVar.g1;
        synchronized (nccVar) {
            int iK = nccVar.k(nccVar.s);
            int i2 = nccVar.s;
            int i3 = nccVar.p;
            if ((i2 != i3) && j >= nccVar.n[iK]) {
                if (j <= nccVar.w || !z2) {
                    iJ = nccVar.j(iK, i3 - i2, j, true);
                    if (iJ == -1) {
                    }
                } else {
                    iJ = i3 - i2;
                }
            }
            iJ = 0;
        }
        synchronized (nccVar) {
            if (iJ >= 0) {
                try {
                    if (nccVar.s + iJ <= nccVar.p) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pa7.A(z);
            nccVar.s += iJ;
        }
        if (iJ == 0) {
            lxaVar.x(i);
        }
        return iJ;
    }
}
