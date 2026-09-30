package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wdd extends gu7 implements a26 {
    public static final wdd b;
    public static final wdd c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new wdd(i, 0);
        c = new wdd(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wdd(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((wv4) obj) == wv4.b);
            default:
                oh2 oh2Var = (oh2) obj;
                oh2Var.getClass();
                return Boolean.valueOf(oh2Var.r <= 0);
        }
    }
}
