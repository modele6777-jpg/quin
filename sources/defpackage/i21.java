package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i21 extends gu7 implements a26 {
    final /* synthetic */ k21 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i21(k21 k21Var) {
        super(1);
        this.this$0 = k21Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.this$0.b.d.getValue()).booleanValue();
        k21 k21Var = this.this$0;
        if (zBooleanValue == zBooleanValue2) {
            hkb hkbVar = k21Var.j;
            hkbVar.getClass();
            return hkbVar;
        }
        hkb hkbVar2 = k21Var.i;
        hkbVar2.getClass();
        return hkbVar2;
    }
}
