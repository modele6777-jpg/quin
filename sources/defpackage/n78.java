package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n78 {
    public static final m78 a;
    public static final m78 b;

    static {
        v0b v0bVar = v0b.c;
        m78 m78Var = null;
        try {
            m78Var = (m78) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = m78Var;
        b = new m78();
    }
}
