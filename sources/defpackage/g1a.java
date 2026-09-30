package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g1a extends lrf {
    public b41 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public b41 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public d5e q;
    public final zt r;
    public zt s;
    public zt t;
    public final lw7 u;

    public g1a() {
        int i = msf.a;
        this.d = pu4.a;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        zt ztVarA = cu.a();
        this.r = ztVarA;
        this.s = ztVarA;
        this.u = eb3.N(z18.c, new vy9(2));
    }

    @Override // defpackage.lrf
    public final void a(sn4 sn4Var) {
        d5e d5eVar;
        if (this.n) {
            pa7.i0(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        b41 b41Var = this.b;
        if (b41Var != null) {
            sn4.s(sn4Var, this.s, b41Var, this.c, null, null, 0, 56);
        }
        b41 b41Var2 = this.g;
        if (b41Var2 != null) {
            d5e d5eVar2 = this.q;
            if (this.o || d5eVar2 == null) {
                d5e d5eVar3 = new d5e(this.f, this.j, this.h, this.i, null, 16);
                this.q = d5eVar3;
                this.o = false;
                d5eVar = d5eVar3;
            } else {
                d5eVar = d5eVar2;
            }
            sn4.s(sn4Var, this.s, b41Var2, this.e, d5eVar, null, 0, 48);
        }
    }

    public final void e() {
        float f = this.k;
        zt ztVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = ztVar;
            return;
        }
        zt ztVar2 = this.s;
        if (ztVar2 != ztVar) {
            Path.FillType fillType = ztVar2.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.l();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        } else {
            this.s = cu.a();
        }
        lw7 lw7Var = this.u;
        ((bu) lw7Var.getValue()).a.setPath(ztVar.a, false);
        float length = ((bu) lw7Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((bu) lw7Var.getValue()).a(f4, f5, this.s);
            return;
        }
        zt ztVarA = this.t;
        if (ztVarA == null) {
            ztVarA = cu.a();
            this.t = ztVarA;
        }
        ztVarA.k();
        ((bu) lw7Var.getValue()).a(f4, length, ztVarA);
        zt.a(this.s, ztVarA);
        ztVarA.k();
        ((bu) lw7Var.getValue()).a(0.0f, f5, ztVarA);
        zt.a(this.s, ztVarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
