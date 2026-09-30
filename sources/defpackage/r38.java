package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r38 {
    public final vz9 A;
    public final vz9 B;
    public o74 a;
    public final ojb b;
    public final vsd c;
    public final fz3 d;
    public jte e;
    public final vz9 f;
    public final vz9 g;
    public bv7 h;
    public final vz9 i;
    public k00 j;
    public final vz9 k;
    public final vz9 l;
    public final vz9 m;
    public final vz9 n;
    public final vz9 o;
    public boolean p;
    public final vz9 q;
    public final gg7 r;
    public final vz9 s;
    public final vz9 t;
    public a26 u;
    public final ou2 v;
    public final ou2 w;
    public final ou2 x;
    public final rt y;
    public long z;

    public r38(o74 o74Var, ojb ojbVar, vsd vsdVar) {
        this.a = o74Var;
        this.b = ojbVar;
        this.c = vsdVar;
        int i = 3;
        fz3 fz3Var = new fz3(i, false);
        k00 k00Var = l00.a;
        long j = eue.b;
        zse zseVar = new zse(k00Var, j, (eue) null);
        fz3Var.b = zseVar;
        fz3Var.c = new er0(k00Var, zseVar.b);
        this.d = fz3Var;
        Boolean bool = Boolean.FALSE;
        this.f = q1c.f(bool);
        this.g = q1c.f(new yi4(0.0f));
        this.i = q1c.f(null);
        this.k = q1c.f(ug6.a);
        this.l = q1c.f(bool);
        this.m = q1c.f(bool);
        this.n = q1c.f(bool);
        this.o = q1c.f(bool);
        this.p = true;
        this.q = q1c.f(Boolean.TRUE);
        int i2 = 2;
        this.r = new gg7(i2, vsdVar);
        this.s = q1c.f(bool);
        this.t = q1c.f(bool);
        this.u = new tb7(20);
        this.v = new ou2(this, 1);
        this.w = new ou2(this, i2);
        this.x = new ou2(this, i);
        this.y = urg.h();
        this.z = y72.k;
        this.A = q1c.f(new eue(j));
        this.B = q1c.f(new eue(j));
    }

    public final ug6 a() {
        return (ug6) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final bv7 c() {
        bv7 bv7Var = this.h;
        if (bv7Var == null || !bv7Var.h()) {
            return null;
        }
        return bv7Var;
    }

    public final tte d() {
        return (tte) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new eue(j));
    }

    public final void f(long j) {
        this.A.setValue(new eue(j));
    }
}
