package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class su3 extends gu7 implements x16 {
    public static final su3 b;
    public static final su3 c;
    public static final su3 d;
    public static final su3 e;
    public static final su3 f;
    public final /* synthetic */ int a;

    static {
        int i = 0;
        b = new su3(i, 0);
        c = new su3(i, 1);
        d = new su3(i, 2);
        e = new su3(i, 3);
        f = new su3(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su3(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return b21.D(b21.T(600, 200, null, 4), lrb.b, 4);
            case 3:
                return b21.D(b21.T(1700, 200, null, 4), lrb.a, 4);
            default:
                return null;
        }
    }
}
