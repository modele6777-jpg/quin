package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mz extends gu7 implements n26 {
    final /* synthetic */ n3f $transition;
    final /* synthetic */ a26 $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz(a26 a26Var, n3f n3fVar) {
        super(3);
        this.$visible = a26Var;
        this.$transition = n3fVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        long j;
        zn8 zn8Var = (zn8) obj;
        cea ceaVarV = ((tn8) obj2).v(((kl2) obj3).a);
        if (!zn8Var.k0() || ((Boolean) this.$visible.d(this.$transition.d.getValue())).booleanValue()) {
            j = (((long) ceaVarV.a) << 32) | (((long) ceaVarV.b) & 4294967295L);
        } else {
            j = 0;
        }
        return zn8Var.n0((int) (j >> 32), (int) (4294967295L & j), qu4.a, new lz(ceaVarV));
    }
}
