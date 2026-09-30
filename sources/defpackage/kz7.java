package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kz7 {
    public final aw2 a;
    public final ie6 b;
    public final zv6 c;
    public ze5 d;
    public ze5 e;
    public ze5 f;
    public boolean g;
    public final vz9 h;
    public final vz9 i;
    public final vz9 j;
    public final vz9 k;
    public long l;
    public long m;
    public long n;
    public ke6 o;
    public final jx p;
    public final jx q;
    public final vz9 r;

    public kz7(aw2 aw2Var, ie6 ie6Var, zv6 zv6Var) {
        this.a = aw2Var;
        this.b = ie6Var;
        this.c = zv6Var;
        Boolean bool = Boolean.FALSE;
        this.h = q1c.f(bool);
        this.i = q1c.f(bool);
        this.j = q1c.f(bool);
        this.k = q1c.f(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        this.n = 9223372034707292159L;
        this.o = ie6Var != null ? ie6Var.c() : null;
        this.p = new jx(new w67(0L), xo1.m, null, 12);
        this.q = new jx(Float.valueOf(1.0f), xo1.g, null, 12);
        this.r = q1c.f(new w67(0L));
    }

    public final void a() {
        ke6 ke6Var = this.o;
        ze5 ze5Var = this.d;
        vz9 vz9Var = this.i;
        boolean zBooleanValue = ((Boolean) vz9Var.getValue()).booleanValue();
        aw2 aw2Var = this.a;
        if (zBooleanValue || ze5Var == null || ke6Var == null) {
            if (b()) {
                if (ke6Var != null) {
                    ke6Var.f(1.0f);
                }
                ynb.V(aw2Var, null, null, new bz7(this, null), 3);
                return;
            }
            return;
        }
        vz9Var.setValue(Boolean.TRUE);
        boolean zB = b();
        boolean z = !zB;
        if (!zB) {
            ke6Var.f(0.0f);
        }
        ynb.V(aw2Var, null, null, new dz7(z, this, ze5Var, ke6Var, null), 3);
    }

    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void c() {
        ie6 ie6Var;
        vz9 vz9Var = this.h;
        boolean zBooleanValue = ((Boolean) vz9Var.getValue()).booleanValue();
        aw2 aw2Var = this.a;
        if (zBooleanValue) {
            vz9Var.setValue(Boolean.FALSE);
            ynb.V(aw2Var, null, null, new hz7(this, null), 3);
        }
        vz9 vz9Var2 = this.i;
        if (((Boolean) vz9Var2.getValue()).booleanValue()) {
            vz9Var2.setValue(Boolean.FALSE);
            ynb.V(aw2Var, null, null, new iz7(this, null), 3);
        }
        if (b()) {
            this.j.setValue(Boolean.FALSE);
            ynb.V(aw2Var, null, null, new jz7(this, null), 3);
        }
        this.g = false;
        d(0L);
        this.l = 9223372034707292159L;
        ke6 ke6Var = this.o;
        if (ke6Var != null && (ie6Var = this.b) != null) {
            ie6Var.a(ke6Var);
        }
        this.o = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void d(long j) {
        this.r.setValue(new w67(j));
    }
}
