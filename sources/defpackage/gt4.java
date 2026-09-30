package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gt4 {
    public int a;
    public final Object b;
    public final Object c;

    public gt4(tkb tkbVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = tkbVar;
    }

    public static gt4 b(tkb tkbVar, int i) {
        if (i == 0) {
            return new ms9(tkbVar, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new ms9(tkbVar, i2);
        }
        qc0.j("invalid orientation");
        return null;
    }

    public abstract void a(q8c q8cVar);

    public abstract void c(q8c q8cVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);

    public abstract void r(q8c q8cVar);

    public abstract void s(q8c q8cVar);

    public abstract void t(q8c q8cVar);

    public abstract void u(q8c q8cVar);

    public abstract c6c v(q8c q8cVar);

    public gt4(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public gt4(it4 it4Var) {
        this.a = 0;
        this.c = new wq3();
        this.b = it4Var;
    }
}
