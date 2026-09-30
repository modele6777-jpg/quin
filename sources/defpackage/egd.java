package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class egd {
    public final int a = mbb.b.c();
    public final vz9 b = q1c.f(hgd.a);
    public final sz9 c = new sz9(0);
    public final sz9 d = new sz9(0);
    public final vz9 e;
    public final vz9 f;
    public final vz9 g;
    public bv9 h;
    public ffd i;
    public h6b j;
    public k11 k;
    public xu l;

    public egd() {
        Boolean bool = Boolean.FALSE;
        this.e = q1c.f(bool);
        this.f = q1c.f(bool);
        this.g = q1c.f(bool);
    }

    public final hgd a() {
        return (hgd) this.b.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final boolean c() {
        if (b()) {
            return false;
        }
        if (a() == hgd.b) {
            return this.c.j() > 0;
        }
        return this.d.j() > 0;
    }

    public final void d(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zn2 zn2Var) {
        agd agdVar;
        if (zn2Var instanceof agd) {
            agdVar = (agd) zn2Var;
            int i = agdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                agdVar.label = i - Integer.MIN_VALUE;
            } else {
                agdVar = new agd(this, zn2Var);
            }
        } else {
            agdVar = new agd(this, zn2Var);
        }
        Object obj = agdVar.result;
        int i2 = agdVar.label;
        vz9 vz9Var = this.b;
        if (i2 == 0) {
            jzb.q(obj);
            vz9Var.setValue(hgd.d);
            long jT = y41.T(500, gr4.MILLISECONDS);
            agdVar.label = 1;
            Object objR = vfh.r(jT, agdVar);
            bw2 bw2Var = bw2.a;
            if (objR == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        vz9Var.setValue(hgd.e);
        this.d.k(0);
        return wef.a;
    }
}
