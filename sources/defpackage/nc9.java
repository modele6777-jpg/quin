package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nc9 extends c89 {
    public final c89 o;
    public boolean p;

    public nc9(long j, ord ordVar, a26 a26Var, a26 a26Var2, c89 c89Var) {
        super(j, ordVar, a26Var, a26Var2);
        this.o = c89Var;
        c89Var.k();
    }

    @Override // defpackage.c89, defpackage.ird
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.c89
    public final vtb w() {
        nc9 nc9Var;
        c89 c89Var = this.o;
        if (c89Var.m || c89Var.c) {
            return new krd(this);
        }
        x79 x79Var = this.h;
        long j = this.b;
        HashMap mapM = x79Var != null ? qrd.m(c89Var.g(), this, this.o.d()) : null;
        Object obj = qrd.c;
        synchronized (obj) {
            try {
                qrd.v(this);
                if (x79Var == null || x79Var.d == 0) {
                    nc9Var = this;
                    nc9Var.a();
                } else {
                    nc9Var = this;
                    vtb vtbVarZ = nc9Var.z(this.o.g(), x79Var, mapM, this.o.d());
                    if (!vtbVarZ.equals(lrd.a)) {
                        return vtbVarZ;
                    }
                    x79 x79VarX = nc9Var.o.x();
                    if (x79VarX != null) {
                        x79VarX.k(x79Var);
                    } else {
                        nc9Var.o.B(x79Var);
                        nc9Var.h = null;
                    }
                }
                if (pa7.M(nc9Var.o.g(), j) < 0) {
                    nc9Var.o.v();
                }
                c89 c89Var2 = nc9Var.o;
                c89Var2.r(c89Var2.d().d(j).c(nc9Var.j));
                nc9Var.o.A(j);
                c89 c89Var3 = nc9Var.o;
                int i = nc9Var.d;
                nc9Var.d = -1;
                if (i >= 0) {
                    int[] iArr = c89Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    c89Var3.k = iArrCopyOf;
                } else {
                    c89Var3.getClass();
                }
                c89 c89Var4 = nc9Var.o;
                ord ordVar = nc9Var.j;
                c89Var4.getClass();
                synchronized (obj) {
                    c89Var4.j = c89Var4.j.f(ordVar);
                    c89 c89Var5 = nc9Var.o;
                    int[] iArr2 = nc9Var.k;
                    c89Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c89Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        c89Var5.k = iArr2;
                    }
                }
                nc9Var.m = true;
                if (!nc9Var.p) {
                    nc9Var.p = true;
                    nc9Var.o.l();
                }
                return lrd.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
