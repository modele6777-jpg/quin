package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oa1 extends u4 {
    public final /* synthetic */ pa1 v;

    public oa1(pa1 pa1Var) {
        this.v = pa1Var;
    }

    @Override // defpackage.u4
    public final String i() {
        la1 la1Var = (la1) this.v.a.get();
        if (la1Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + la1Var.a + "]";
    }
}
