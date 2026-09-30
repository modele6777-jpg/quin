package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cm0 implements lk9 {
    public static final cm0 a = new cm0();
    public static final rc5 b = rc5.a("clientType");
    public static final rc5 c = rc5.a("androidClientInfo");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        y42 y42Var = (y42) obj;
        mk9 mk9Var = (mk9) obj2;
        ((lo0) y42Var).getClass();
        mk9Var.a(b, x42.ANDROID_FIREBASE);
        mk9Var.a(c, ((lo0) y42Var).a);
    }
}
