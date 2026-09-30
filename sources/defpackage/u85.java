package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u85 {
    public static final s85 a = new s85();
    public static final s85 b;

    static {
        v0b v0bVar = v0b.c;
        s85 s85Var = null;
        try {
            s85Var = (s85) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = s85Var;
    }
}
