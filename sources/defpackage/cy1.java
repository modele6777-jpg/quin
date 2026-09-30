package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cy1 implements goe {
    public final /* synthetic */ use a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ t69 d;
    public final /* synthetic */ wne e;
    public final /* synthetic */ h0e f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;
    public final /* synthetic */ h0e x;

    public cy1(use useVar, boolean z, boolean z2, t69 t69Var, wne wneVar, h0e h0eVar, Integer num, boolean z3, int i, h0e h0eVar2) {
        this.a = useVar;
        this.b = z;
        this.c = z2;
        this.d = t69Var;
        this.e = wneVar;
        this.f = h0eVar;
        this.g = num;
        this.v = z3;
        this.w = i;
        this.x = h0eVar2;
    }

    @Override // defpackage.goe
    public final void V(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-360776214);
        int i2 = i | (l46Var.g(this) ? 32 : 16);
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            qk6 qk6Var = qk6.O0;
            use useVar = this.a;
            String string = useVar.d().c.toString();
            h0e h0eVar = this.f;
            bx9 bx9Var = new bx9(((yi4) h0eVar.getValue()).a, ((yi4) h0eVar.getValue()).a, ((yi4) h0eVar.getValue()).a, ((yi4) h0eVar.getValue()).a + (this.b ? 20.0f : 0.0f));
            s8f s8fVar = m8c.w;
            dd2 dd2VarB0 = af1.b0(-1688621415, new o50(this.g, this.v, dd2Var, useVar), l46Var);
            dd2 dd2VarB1 = af1.b0(663123378, new os1(this.w, i3), l46Var);
            boolean z = this.c;
            t69 t69Var = this.d;
            wne wneVar = this.e;
            qk6Var.V(string, dd2VarB0, this.c, false, s8fVar, this.d, false, null, dd2VarB1, null, wneVar, bx9Var, af1.b0(260162237, new o50(z, t69Var, wneVar, this.x, 5), l46Var), l46Var, 100887600, 16064);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(this, dd2Var, i, 15);
        }
    }
}
