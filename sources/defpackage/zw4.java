package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zw4 extends gu7 implements a26 {
    final /* synthetic */ ax4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw4(ax4 ax4Var) {
        super(1);
        this.this$0 = ax4Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        ze5 ze5Var;
        ze5 ze5Var2;
        i3f i3fVar = (i3f) obj;
        wv4 wv4Var = wv4.a;
        wv4 wv4Var2 = wv4.b;
        if (i3fVar.c(wv4Var, wv4Var2)) {
            ood oodVar = ((cx4) this.this$0.I0).b.b;
            return (oodVar == null || (ze5Var2 = oodVar.b) == null) ? rw4.d : ze5Var2;
        }
        if (!i3fVar.c(wv4Var2, wv4.c)) {
            return rw4.d;
        }
        ood oodVar2 = ((f45) this.this$0.J0).c.b;
        return (oodVar2 == null || (ze5Var = oodVar2.b) == null) ? rw4.d : ze5Var;
    }
}
