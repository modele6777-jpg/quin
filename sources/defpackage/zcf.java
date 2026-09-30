package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zcf implements a26 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ j18 b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ s69 d;
    public final /* synthetic */ s69 e;

    public zcf(boolean z, j18 j18Var, x16 x16Var, s69 s69Var, s69 s69Var2) {
        this.a = z;
        this.b = j18Var;
        this.c = x16Var;
        this.d = s69Var;
        this.e = s69Var2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j = ((hl9) obj).a;
        if (!this.a) {
            j18 j18Var = this.b;
            ((sz9) this.d).k(j18Var.e.b.j());
            ((sz9) this.e).k(j18Var.e.c.j());
        }
        this.c.invoke();
        return wef.a;
    }
}
