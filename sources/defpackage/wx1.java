package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wx1 implements u47 {
    public final int a;
    public final jl0 b;

    public wx1(int i, jl0 jl0Var) {
        this.a = i;
        this.b = jl0Var;
    }

    @Override // defpackage.u47
    public final void a(une uneVar) {
        int length = uneVar.c.length();
        int i = this.a;
        if (length > i) {
            uneVar.e();
            if (uneVar.a.c.length() < i) {
                this.b.invoke();
            }
        }
    }
}
