package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a12 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ a12(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(i2 > 0 ? Integer.MAX_VALUE : 0);
            case 1:
                return Integer.valueOf(i2);
            case 2:
                return new jx7(i2, 0);
            case 3:
                return new j18(i2, 0);
            default:
                return db6.A0(Integer.valueOf(i2));
        }
    }
}
