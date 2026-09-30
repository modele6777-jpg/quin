package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sg2 extends eu0 {
    public final f82 D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final gl9 I;
    public final sug J;
    public float K;
    public boolean L;
    public final mq4 M;

    public sg2(oi8 oi8Var, tu7 tu7Var, List list, uh8 uh8Var) {
        eu0 eu0Var;
        eu0 sg2Var;
        String str;
        super(oi8Var, tu7Var);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new gl9();
        this.J = new sug(11, (byte) 0);
        this.L = true;
        lx lxVar = tu7Var.s;
        if (lxVar != null) {
            f82 f82VarC0 = lxVar.c0();
            this.D = f82VarC0;
            d(f82VarC0);
            f82VarC0.a(this);
        } else {
            this.D = null;
        }
        gg8 gg8Var = new gg8(uh8Var.j.size());
        eu0 eu0Var2 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            tu7 tu7Var2 = (tu7) list.get(size);
            int iB = kv2.B(tu7Var2.e);
            if (iB == 0) {
                sg2Var = new sg2(oi8Var, tu7Var2, (List) uh8Var.c.get(tu7Var2.g), uh8Var);
            } else if (iB == 1) {
                sg2Var = new etd(oi8Var, tu7Var2);
            } else if (iB == 2) {
                sg2Var = new xv6(oi8Var, tu7Var2);
            } else if (iB == 3) {
                sg2Var = new nj9(oi8Var, tu7Var2);
            } else if (iB == 4) {
                sg2Var = new j5d(oi8Var, tu7Var2, this, uh8Var);
            } else if (iB != 5) {
                switch (tu7Var2.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                gf8.b("Unknown layer type ".concat(str));
                sg2Var = null;
            } else {
                sg2Var = new pte(oi8Var, tu7Var2);
            }
            if (sg2Var != null) {
                gg8Var.e(sg2Var.p.d, sg2Var);
                if (eu0Var2 != null) {
                    eu0Var2.s = sg2Var;
                    eu0Var2 = null;
                } else {
                    this.E.add(0, sg2Var);
                    int iB2 = kv2.B(tu7Var2.u);
                    if (iB2 == 1 || iB2 == 2) {
                        eu0Var2 = sg2Var;
                    }
                }
            }
        }
        for (int i = 0; i < gg8Var.g(); i++) {
            eu0 eu0Var3 = (eu0) gg8Var.c(gg8Var.d(i));
            if (eu0Var3 != null && (eu0Var = (eu0) gg8Var.c(eu0Var3.p.f)) != null) {
                eu0Var3.t = eu0Var;
            }
        }
        a82 a82Var = this.p.x;
        if (a82Var != null) {
            this.M = new mq4(this, this, a82Var);
        }
    }

    @Override // defpackage.eu0, defpackage.ep4
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((eu0) arrayList.get(size)).c(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.eu0
    public final void i(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        Canvas canvasE;
        boolean z = false;
        mq4 mq4Var = this.M;
        boolean z2 = (kq4Var == null && mq4Var == null) ? false : true;
        oi8 oi8Var = this.o;
        boolean z3 = oi8Var.Z;
        ArrayList<eu0> arrayList = this.E;
        if ((z3 && arrayList.size() > 1 && i != 255) || (z2 && oi8Var.E0)) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (mq4Var != null) {
            kq4Var = mq4Var.b(matrix, i2);
        }
        boolean z4 = this.L;
        tu7 tu7Var = this.p;
        RectF rectF = this.G;
        if (z4 || !"__container".equals(tu7Var.c)) {
            rectF.set(0.0f, 0.0f, tu7Var.o, tu7Var.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (eu0 eu0Var : arrayList) {
                RectF rectF2 = this.H;
                eu0Var.c(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        gl9 gl9Var = this.I;
        if (z) {
            sug sugVar = this.J;
            sugVar.c = null;
            sugVar.b = i;
            if (kq4Var != null) {
                if (Color.alpha(kq4Var.d) > 0) {
                    sugVar.c = kq4Var;
                } else {
                    sugVar.c = null;
                }
                kq4Var = null;
            }
            canvasE = gl9Var.e(canvas, rectF, sugVar);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((eu0) arrayList.get(size)).f(canvasE, matrix, i2, kq4Var);
            }
        }
        if (z) {
            gl9Var.c();
        }
        canvas.restore();
    }

    @Override // defpackage.eu0
    public final void m(boolean z) {
        super.m(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((eu0) it.next()).m(z);
        }
    }

    @Override // defpackage.eu0
    public final void n(float f) {
        this.K = f;
        super.n(f);
        tu7 tu7Var = this.p;
        f82 f82Var = this.D;
        if (f82Var != null) {
            uh8 uh8Var = this.o.a;
            f = ((((Float) f82Var.d()).floatValue() * tu7Var.b.n) - tu7Var.b.l) / ((uh8Var.m - uh8Var.l) + 0.01f);
        }
        if (f82Var == null) {
            float f2 = tu7Var.n;
            uh8 uh8Var2 = tu7Var.b;
            f -= f2 / (uh8Var2.m - uh8Var2.l);
        }
        if (tu7Var.m != 0.0f && !"__container".equals(tu7Var.c)) {
            f /= tu7Var.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((eu0) arrayList.get(size)).n(f);
        }
    }
}
