package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vid {
    public final aw2 a;
    public final ld3 b;
    public final r41 c = urg.a(Integer.MAX_VALUE, null, null, 6);
    public final uh0 d = new uh0(0);

    public vid(aw2 aw2Var, ot1 ot1Var, qv2 qv2Var, ld3 ld3Var) {
        this.a = aw2Var;
        this.b = ld3Var;
        dg7 dg7Var = (dg7) aw2Var.getCoroutineContext().F0(ndb.Y0);
        if (dg7Var != null) {
            dg7Var.E(new bv9(ot1Var, this, qv2Var, 11));
        }
    }
}
