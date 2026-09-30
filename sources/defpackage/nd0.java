package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nd0 {
    public static final int a;

    static {
        Object dzbVar;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            dzbVar = property != null ? c5e.D(property) : null;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Integer num = (Integer) (dzbVar instanceof dzb ? null : dzbVar);
        a = num != null ? num.intValue() : 2097152;
    }
}
