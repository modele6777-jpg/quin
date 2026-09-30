package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b5 {
    public c5[] a;
    public int b;
    public int c;
    public c7e d;

    public final c5 e() {
        c5 c5VarF;
        c7e c7eVar;
        synchronized (this) {
            try {
                c5[] c5VarArrG = this.a;
                if (c5VarArrG == null) {
                    c5VarArrG = g();
                    this.a = c5VarArrG;
                } else if (this.b >= c5VarArrG.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(c5VarArrG, c5VarArrG.length * 2);
                    this.a = (c5[]) objArrCopyOf;
                    c5VarArrG = (c5[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    c5VarF = c5VarArrG[i];
                    if (c5VarF == null) {
                        c5VarF = f();
                        c5VarArrG[i] = c5VarF;
                    }
                    i++;
                    if (i >= c5VarArrG.length) {
                        i = 0;
                    }
                } while (!c5VarF.a(this));
                this.c = i;
                this.b++;
                c7eVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c7eVar != null) {
            c7eVar.y(1);
        }
        return c5VarF;
    }

    public abstract c5 f();

    public abstract c5[] g();

    public final void j(c5 c5Var) {
        c7e c7eVar;
        int i;
        xn2[] xn2VarArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                c7eVar = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                c5Var.getClass();
                xn2VarArrB = c5Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (xn2 xn2Var : xn2VarArrB) {
            if (xn2Var != null) {
                xn2Var.g(wef.a);
            }
        }
        if (c7eVar != null) {
            c7eVar.y(-1);
        }
    }

    public final c7e k() {
        c7e c7eVar;
        synchronized (this) {
            c7eVar = this.d;
            if (c7eVar == null) {
                int i = this.b;
                c7eVar = new c7e(1, Integer.MAX_VALUE, i41.b);
                c7eVar.i(Integer.valueOf(i));
                this.d = c7eVar;
            }
        }
        return c7eVar;
    }
}
