package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ns3 implements fhc {
    public final /* synthetic */ os3 a;

    public ns3(os3 os3Var) {
        this.a = os3Var;
    }

    @Override // defpackage.fhc
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        os3 os3Var = this.a;
        float fFloatValue = ((Number) os3Var.a.d(Float.valueOf(f))).floatValue();
        os3Var.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        os3Var.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
