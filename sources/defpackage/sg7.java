package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sg7 {
    public static final ig4 a = new ig4("COMPLETING_ALREADY", 2);
    public static final ig4 b = new ig4("COMPLETING_WAITING_CHILDREN", 2);
    public static final ig4 c = new ig4("COMPLETING_RETRY", 2);
    public static final ig4 d = new ig4("TOO_LATE_TO_CANCEL", 2);
    public static final ig4 e = new ig4("SEALED", 2);
    public static final hu4 f = new hu4(false);
    public static final hu4 g = new hu4(true);

    public static final Object a(Object obj) {
        b17 b17Var = obj instanceof b17 ? (b17) obj : null;
        return b17Var != null ? b17Var.a : obj;
    }
}
