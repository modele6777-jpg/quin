package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = wg3.class)
public abstract class ug3 {
    public static final lg3 Companion = new lg3();
    public static final pg3 a;

    static {
        new tg3(1L).b(1000).b(1000).b(1000).b(60).b(60);
        a = new pg3(1);
        new pg3(Math.multiplyExact(1, 7));
        new rg3(1);
        new rg3(Math.multiplyExact(1, 3));
        int iMultiplyExact = Math.multiplyExact(1, 12);
        new rg3(iMultiplyExact);
        new rg3(Math.multiplyExact(iMultiplyExact, 100));
    }

    public static String a(int i, String str) {
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }
}
