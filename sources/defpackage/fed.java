package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fed extends gu7 implements a26 {
    final /* synthetic */ cea $p;
    final /* synthetic */ zn8 $this_measure;
    final /* synthetic */ ged this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fed(zn8 zn8Var, ged gedVar, cea ceaVar) {
        super(1);
        this.$this_measure = zn8Var;
        this.this$0 = gedVar;
        this.$p = ceaVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        bea beaVar = (bea) obj;
        bv7 bv7VarB = beaVar.b();
        if (bv7VarB != null) {
            boolean zK0 = this.$this_measure.k0();
            ged gedVar = this.this$0;
            if (zK0) {
                gedVar.Z.f = bv7VarB;
            } else {
                gedVar.Z.e = bv7VarB;
            }
        }
        beaVar.g(this.$p, 0, 0, 0.0f);
        return wef.a;
    }
}
