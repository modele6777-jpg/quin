package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jea extends gu7 implements n26 {
    public static final jea b;
    public static final jea c;
    public final /* synthetic */ int a;

    static {
        int i = 3;
        b = new jea(i, 0);
        c = new jea(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jea(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                l46 l46Var = (l46) obj2;
                ((Number) obj3).intValue();
                ((i3f) obj).getClass();
                l46Var.g0(-788763339);
                fxd fxdVarP = b21.P(0.0f, 0.0f, 7, null);
                l46Var.r(false);
                return fxdVarP;
            default:
                l46 l46Var2 = (l46) obj2;
                ((Number) obj3).intValue();
                ((i3f) obj).getClass();
                l46Var2.g0(-1508839441);
                fxd fxdVarP2 = b21.P(0.0f, 0.0f, 7, null);
                l46Var2.r(false);
                return fxdVarP2;
        }
    }
}
