package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mo {
    public final a26 a;
    public znd b;
    public tm c;
    public x6f d;
    public ph3 e;
    public final b99 f;
    public final vz9 g;
    public final vz9 h;
    public final mx3 i;
    public final qz9 j;
    public final qz9 k;
    public final vz9 l;
    public final vz9 m;
    public final ho n;

    public mo(hq3 hq3Var, z4 z4Var) {
        this.a = new z4(17);
        b99 b99Var = new b99();
        this.f = b99Var;
        ube ubeVar = ube.a;
        vz9 vz9VarF = q1c.f(ubeVar);
        this.g = vz9VarF;
        vz9 vz9VarF2 = q1c.f(ubeVar);
        this.h = vz9VarF2;
        this.i = zrd.b(new tn(this, 0));
        this.j = new qz9(Float.NaN);
        new xh0(0);
        new lx3(qrd.h().g());
        this.k = new qz9(0.0f);
        vz9 vz9VarF3 = q1c.f(null);
        this.l = vz9VarF3;
        vz9 vz9VarF4 = q1c.f(new hq3(pu4.a, new float[0]));
        this.m = vz9VarF4;
        ho hoVar = new ho(this);
        this.n = hoVar;
        this.a = z4Var;
        vz9VarF4.setValue(hq3Var);
        f99 f99Var = b99Var.b;
        if (f99Var.f()) {
            try {
                float fE = b().e(ubeVar);
                if (!Float.isNaN(fE)) {
                    hoVar.a(fE, 0.0f);
                    vz9VarF3.setValue(null);
                }
                vz9VarF.setValue(ubeVar);
                vz9VarF2.setValue(ubeVar);
            } finally {
                f99Var.h(null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, s89 s89Var, ym ymVar, zn2 zn2Var) {
        ao aoVar;
        if (zn2Var instanceof ao) {
            aoVar = (ao) zn2Var;
            int i = aoVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoVar.label = i - Integer.MIN_VALUE;
            } else {
                aoVar = new ao(this, zn2Var);
            }
        } else {
            aoVar = new ao(this, zn2Var);
        }
        Object obj2 = aoVar.result;
        int i2 = aoVar.label;
        vz9 vz9Var = this.l;
        try {
            if (i2 == 0) {
                jzb.q(obj2);
                if (b().a.indexOf(obj) != -1) {
                    b99 b99Var = this.f;
                    fo foVar = new fo(this, obj, ymVar, null);
                    aoVar.label = 1;
                    b99Var.getClass();
                    Object objO = jgb.O(new y89(s89Var, b99Var, foVar, null), aoVar);
                    bw2 bw2Var = bw2.a;
                    if (objO == bw2Var) {
                        return bw2Var;
                    }
                } else if (((Boolean) this.a.d(obj)).booleanValue()) {
                    this.h.setValue(obj);
                    this.g.setValue(obj);
                }
                return wef.a;
            }
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
            vz9Var.setValue(null);
            return wef.a;
        } catch (Throwable th) {
            vz9Var.setValue(null);
            throw th;
        }
    }

    public final hq3 b() {
        return (hq3) this.m.getValue();
    }

    public final boolean c() {
        return (this.b == null || this.c == null || this.d == null || this.e == null) ? false : true;
    }

    public final float d(float f) {
        qz9 qz9Var = this.j;
        return mh3.n((Float.isNaN(qz9Var.j()) ? 0.0f : qz9Var.j()) + f, b().d(), b().c());
    }

    public final float e() {
        qz9 qz9Var = this.j;
        if (Float.isNaN(qz9Var.j())) {
            l37.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return qz9Var.j();
    }
}
