package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v8b implements goe {
    public final /* synthetic */ use a;
    public final /* synthetic */ xw9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wne e;
    public final /* synthetic */ long f;
    public final /* synthetic */ mue g;
    public final /* synthetic */ x4d v;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;

    public v8b(use useVar, xw9 xw9Var, String str, boolean z, wne wneVar, long j, mue mueVar, x4d x4dVar, float f, float f2) {
        this.a = useVar;
        this.b = xw9Var;
        this.c = str;
        this.d = z;
        this.e = wneVar;
        this.f = j;
        this.g = mueVar;
        this.v = x4dVar;
        this.w = f;
        this.x = f2;
    }

    @Override // defpackage.goe
    public final void V(dd2 dd2Var, l46 l46Var, int i) {
        dd2 dd2Var2;
        l46Var.h0(2147243920);
        int i2 = i | (l46Var.g(this) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69 t69Var = (t69) objR;
            qk6 qk6Var = qk6.O0;
            String string = this.a.d().c.toString();
            s8f s8fVar = m8c.w;
            xw9 bx9Var = this.b;
            if (bx9Var == null) {
                bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
            }
            xw9 xw9Var = bx9Var;
            String str = this.c;
            if (str == null) {
                l46Var.f0(-698425777);
                l46Var.r(false);
                dd2Var2 = null;
            } else {
                l46Var.f0(-698425776);
                dd2 dd2VarB0 = af1.b0(478321976, new cq1(this.f, str, this.g), l46Var);
                l46Var.r(false);
                dd2Var2 = dd2VarB0;
            }
            wne wneVar = this.e;
            qk6Var.V(string, dd2Var, true, this.d, s8fVar, t69Var, false, null, dd2Var2, null, wneVar, xw9Var, af1.b0(712506653, new c12(t69Var, wneVar, this.v, this.w, this.x), l46Var), l46Var, 221616, 16064);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(this, dd2Var, i, 29);
        }
    }
}
