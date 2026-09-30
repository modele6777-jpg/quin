package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zf3 extends r79 implements fn7 {
    public final /* synthetic */ int a = 11;

    public /* synthetic */ zf3(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // defpackage.wn7
    public final rn7 b() {
        return ((fn7) getReflected()).b();
    }

    @Override // defpackage.in7
    public final en7 c() {
        return ((fn7) getReflected()).c();
    }

    @Override // defpackage.ga1
    public final cm7 computeReflected() {
        return job.a.e(this);
    }

    @Override // defpackage.sn7
    public final Object get() {
        switch (this.a) {
            case 0:
                return ((y07) this.receiver).b;
            case 1:
                return ((y07) this.receiver).b;
            case 2:
                return ((y07) this.receiver).d;
            case 3:
                return ((a17) this.receiver).a;
            case 4:
                return ((a17) this.receiver).b;
            case 5:
                return ((a17) this.receiver).d;
            case 6:
                return ((y07) this.receiver).a.b;
            case 7:
                return ((c17) this.receiver).b;
            case 8:
                return ((c17) this.receiver).c;
            case 9:
                return ((c17) this.receiver).d;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return ((a17) this.receiver).e;
            default:
                return ((e89) this.receiver).getValue();
        }
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return get();
    }
}
