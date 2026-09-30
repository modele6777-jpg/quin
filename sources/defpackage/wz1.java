package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wz1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jx b;

    public /* synthetic */ wz1(jx jxVar, int i) {
        this.a = i;
        this.b = jxVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        float fFloatValue;
        int i = this.a;
        jx jxVar = this.b;
        switch (i) {
            case 0:
                fFloatValue = ((Number) jxVar.e()).floatValue();
                break;
            case 1:
                fFloatValue = ((Number) jxVar.e()).floatValue();
                break;
            default:
                fFloatValue = ((Number) jxVar.e()).floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
