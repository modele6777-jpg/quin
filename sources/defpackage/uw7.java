package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uw7 extends cya implements sn7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw7(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.a = i2;
    }

    @Override // defpackage.wn7
    public final rn7 b() {
        return ((sn7) getReflected()).b();
    }

    @Override // defpackage.ga1
    public final cm7 computeReflected() {
        return job.a.g(this);
    }

    @Override // defpackage.sn7
    public final Object get() {
        switch (this.a) {
            case 0:
                return ((h0e) this.receiver).getValue();
            case 1:
                return ((h0e) this.receiver).getValue();
            case 2:
                return ((h0e) this.receiver).getValue();
            case 3:
                return this.receiver.getClass().getSimpleName();
            case 4:
                return ((h0e) this.receiver).getValue();
            case 5:
                return ((h0e) this.receiver).getValue();
            case 6:
                return ((h0e) this.receiver).getValue();
            default:
                return ((h0e) this.receiver).getValue();
        }
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return get();
    }
}
