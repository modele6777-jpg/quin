package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iy extends gu7 implements a26 {
    final /* synthetic */ ky this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(ky kyVar) {
        super(1);
        this.this$0 = kyVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        bea beaVar = (bea) obj;
        cea[] ceaVarArr = this.this$0.c;
        ceaVarArr.getClass();
        ky kyVar = this.this$0;
        int i = kyVar.e;
        int i2 = kyVar.g;
        for (cea ceaVar : ceaVarArr) {
            if (ceaVar != null) {
                long jA = this.this$0.a.b.a((((long) ceaVar.a) << 32) | (((long) ceaVar.b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), cv7.a);
                beaVar.g(ceaVar, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
            }
        }
        return wef.a;
    }
}
