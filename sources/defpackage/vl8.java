package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vl8 {
    public static final tl8 a;
    public static final tl8 b;

    static {
        v0b v0bVar = v0b.c;
        tl8 tl8Var = null;
        try {
            tl8Var = (tl8) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = tl8Var;
        b = new tl8();
    }
}
