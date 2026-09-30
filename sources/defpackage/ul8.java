package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ul8 {
    public static final sl8 a;
    public static final sl8 b;

    static {
        sl8 sl8Var = null;
        try {
            sl8Var = (sl8) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = sl8Var;
        b = new sl8();
    }
}
