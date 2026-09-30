package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p27 {
    public final p89 a = new p89(0, new m27[16]);
    public final vz9 b = q1c.f(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final vz9 d = q1c.f(Boolean.TRUE);

    public final void a(int i, l46 l46Var) {
        l46Var.h0(-318043801);
        int i2 = (l46Var.i(this) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(null);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                l46Var.f0(-144841960);
                boolean zI = l46Var.i(this);
                Object objR2 = l46Var.R();
                if (zI || objR2 == i8cVar) {
                    objR2 = new o27(e89Var, this, null);
                    l46Var.p0(objR2);
                }
                af1.o((l26) objR2, l46Var, this);
                l46Var.r(false);
            } else {
                l46Var.f0(-143455237);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i1(this, i, 27);
        }
    }
}
