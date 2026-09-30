package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ze9 {
    public static final xe9 a;
    public static final xe9 b;

    static {
        v0b v0bVar = v0b.c;
        xe9 xe9Var = null;
        try {
            xe9Var = (xe9) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = xe9Var;
        b = new xe9();
    }
}
