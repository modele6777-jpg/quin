package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l93 {
    public static final l93 a = new l93();
    public static final b73 b;
    public static final b73 c;
    public static final b73 d;
    public static final b73 e;

    static {
        x1f x1fVar = x1f.a;
        b = new b73(new i93(1, null), new k93(2, null), new os2(20), new os2(21), new hl(0, x1fVar, x1f.class, "isMixpanelTrackingAuthorized", "isMixpanelTrackingAuthorized()Z", 0, 29));
        c = b(xqa.e0, new hl(0, x1fVar, x1f.class, "isMixpanelTrackingAuthorized", "isMixpanelTrackingAuthorized()Z", 0, 26), new os2(22));
        d = b(xqa.j0, new hl(0, x1fVar, x1f.class, "isFirebaseTrackingActive", "isFirebaseTrackingActive$Quin_core_common_release()Z", 0, 27), f93.a);
        e = b(xqa.k0, new hl(0, x1fVar, x1f.class, "isMixpanelTrackingAuthorized", "isMixpanelTrackingAuthorized()Z", 0, 28), g93.a);
    }

    public static void a(b73 b73Var, String str) {
        ynb.V(lw2.a, null, null, new e93(b73Var, str, null), 3);
    }

    public static b73 b(hs3 hs3Var, x16 x16Var, x16 x16Var2) {
        Class<bsa> cls = bsa.class;
        return new b73(new w(1, hs3Var, cls, "loadOrThrow", "loadOrThrow(Lnet/xmind/donut/common/utils/DefaultPreferencePair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 25), new gl(2, hs3Var, cls, "setNowOrThrow", "setNowOrThrow(Lnet/xmind/donut/common/utils/DefaultPreferencePair;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 5), new os2(23), x16Var2, x16Var);
    }
}
