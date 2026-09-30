package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ca2 {
    public static boolean c;
    public static final /* synthetic */ wn7[] b = {new q79(ca2.class, "isHuawei", "isHuawei()Z", 0)};
    public static final ca2 a = new ca2();
    public static String d = "gp";
    public static final kd9 e = new kd9(21, false);

    public final boolean a() {
        wn7 wn7Var = b[0];
        kd9 kd9Var = e;
        kd9Var.getClass();
        wn7Var.getClass();
        Boolean bool = (Boolean) kd9Var.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Property " + wn7Var.getName() + " should be initialized before get.");
    }
}
