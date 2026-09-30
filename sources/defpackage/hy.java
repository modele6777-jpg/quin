package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hy extends gu7 implements l26 {
    public static final hy b;
    public static final hy c;
    public final /* synthetic */ int a;

    static {
        int i = 2;
        b = new hy(i, 0);
        c = new hy(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                long j = ((e77) obj).a;
                long j2 = ((e77) obj2).a;
                hkb hkbVar = qyf.a;
                return b21.P(0.0f, 400.0f, 1, new e77(4294967297L));
            default:
                wv4 wv4Var = (wv4) obj2;
                return Boolean.valueOf(((wv4) obj) == wv4Var && wv4Var == wv4.c);
        }
    }
}
