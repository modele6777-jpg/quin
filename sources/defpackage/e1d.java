package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e1d {
    public final zh0 a;

    public e1d(qn4 qn4Var) {
        qn4Var.getClass();
        this.a = vpf.o(c1d.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) {
        d1d d1dVar;
        if (zn2Var instanceof d1d) {
            d1dVar = (d1d) zn2Var;
            int i = d1dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                d1dVar.label = i - Integer.MIN_VALUE;
            } else {
                d1dVar = new d1d(this, zn2Var);
            }
        } else {
            d1dVar = new d1d(this, zn2Var);
        }
        Object obj = d1dVar.result;
        int i2 = d1dVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            throw null;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.a.a(c1d.a, c1d.b)) {
            return wef.a;
        }
        throw null;
    }

    public final void b() {
        if (zh0.b.getAndSet(this.a, c1d.c) == c1d.b) {
            throw null;
        }
    }
}
