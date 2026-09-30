package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v7g {
    public final h8g a;
    public x47[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public v7g(h8g h8gVar) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = h8gVar;
        c(h8gVar);
    }

    public final void a() {
        x47[] x47VarArr = this.b;
        if (x47VarArr != null) {
            x47 x47VarI = x47VarArr[0];
            x47 x47VarI2 = x47VarArr[1];
            h8g h8gVar = this.a;
            if (x47VarI2 == null) {
                x47VarI2 = h8gVar.a.i(2);
            }
            if (x47VarI == null) {
                x47VarI = h8gVar.a.i(1);
            }
            h(x47.a(x47VarI, x47VarI2));
            x47 x47Var = this.b[m7c.m(16)];
            if (x47Var != null) {
                g(x47Var);
            }
            x47 x47Var2 = this.b[m7c.m(32)];
            if (x47Var2 != null) {
                e(x47Var2);
            }
            x47 x47Var3 = this.b[m7c.m(64)];
            if (x47Var3 != null) {
                i(x47Var3);
            }
        }
    }

    public abstract h8g b();

    public void c(h8g h8gVar) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listF = h8gVar.a.f(i);
            int iM = m7c.m(i);
            this.c[iM] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List<Rect> listG = h8gVar.a.g(i);
                this.d[iM] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    public void d(int i, x47 x47Var) {
        if (this.b == null) {
            this.b = new x47[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[m7c.m(i2)] = x47Var;
            }
        }
    }

    public abstract void f(x47 x47Var);

    public abstract void h(x47 x47Var);

    public v7g() {
        this(new h8g((h8g) null));
    }

    public void e(x47 x47Var) {
    }

    public void g(x47 x47Var) {
    }

    public void i(x47 x47Var) {
    }
}
