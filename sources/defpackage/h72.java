package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h72 {
    public int a;
    public Object b;

    public h72(ygh yghVar, int i) {
        if (yghVar == null) {
            qc0.j("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            qc0.j(ub3.h(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
            throw null;
        }
        this.a = i;
        this.b = yghVar;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public void D() throws ya7 {
        boolean zC;
        do {
            int iZ = z();
            if (iZ == 0) {
                return;
            }
            int i = this.a;
            if (i >= 100) {
                throw new ya7("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i + 1;
            zC = C(iZ);
            this.a--;
        } while (zC);
    }

    public abstract void E(wt4 wt4Var, Object obj);

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract h8g f(h8g h8gVar, List list);

    public abstract lqb g(n7g n7gVar, lqb lqbVar);

    public abstract void h(int i);

    public abstract int j(int i);

    public abstract boolean k();

    public abstract w61 l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    public void d(n7g n7gVar) {
    }

    public void e(n7g n7gVar) {
    }

    public h72(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public h72(int i) {
        this.a = i;
    }
}
