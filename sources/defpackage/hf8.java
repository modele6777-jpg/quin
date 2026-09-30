package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface hf8 {
    public static final ef8 Q = ef8.a;

    default m8b d() {
        String simpleName = getClass().getSimpleName();
        if (simpleName.length() > 18) {
            simpleName = simpleName.substring(0, 18);
        }
        return new m8b("Quin:".concat(simpleName));
    }
}
