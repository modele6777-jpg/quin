package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yw4 extends gu7 implements a26 {
    final /* synthetic */ ax4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw4(ax4 ax4Var) {
        super(1);
        this.this$0 = ax4Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        i3f i3fVar = (i3f) obj;
        wv4 wv4Var = wv4.a;
        wv4 wv4Var2 = wv4.b;
        Object obj2 = null;
        if (i3fVar.c(wv4Var, wv4Var2)) {
            vv1 vv1Var = ((cx4) this.this$0.I0).b.c;
            if (vv1Var != null) {
                obj2 = vv1Var.c;
            }
        } else if (i3fVar.c(wv4Var2, wv4.c)) {
            vv1 vv1Var2 = ((f45) this.this$0.J0).c.c;
            if (vv1Var2 != null) {
                obj2 = vv1Var2.c;
            }
        } else {
            obj2 = rw4.e;
        }
        return obj2 == null ? rw4.e : obj2;
    }
}
