package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class orb implements u48 {
    public final /* synthetic */ f48 a;
    public final /* synthetic */ mmb b;
    public final /* synthetic */ aw2 c;
    public final /* synthetic */ f48 d;
    public final /* synthetic */ pl1 e;
    public final /* synthetic */ f99 f;
    public final /* synthetic */ l26 g;

    public orb(f48 f48Var, mmb mmbVar, aw2 aw2Var, f48 f48Var2, pl1 pl1Var, f99 f99Var, l26 l26Var) {
        this.a = f48Var;
        this.b = mmbVar;
        this.c = aw2Var;
        this.d = f48Var2;
        this.e = pl1Var;
        this.f = f99Var;
        this.g = l26Var;
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        f48 f48Var2 = this.a;
        mmb mmbVar = this.b;
        if (f48Var == f48Var2) {
            mmbVar.element = ynb.V(this.c, null, null, new nrb(this.f, this.g, null), 3);
            return;
        }
        if (f48Var == this.d) {
            dg7 dg7Var = (dg7) mmbVar.element;
            if (dg7Var != null) {
                dg7Var.h(null);
            }
            mmbVar.element = null;
        }
        if (f48Var == f48.ON_DESTROY) {
            this.e.g(wef.a);
        }
    }
}
