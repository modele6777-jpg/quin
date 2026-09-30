package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fh8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug8 b;

    public /* synthetic */ fh8(ug8 ug8Var, int i) {
        this.a = i;
        this.b = ug8Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        float fFloatValue;
        int i = this.a;
        ug8 ug8Var = this.b;
        switch (i) {
            case 0:
                fFloatValue = ((Number) ((eh8) ug8Var).getValue()).floatValue();
                break;
            default:
                fFloatValue = ((Number) ((eh8) ug8Var).getValue()).floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
