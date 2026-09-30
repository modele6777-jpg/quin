package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum cja {
    STAR(1),
    /* JADX INFO: Fake field, exist only in values array */
    POLYGON(2);

    private final int value;

    cja(int i) {
        this.value = i;
    }

    public static cja a(int i) {
        for (cja cjaVar : values()) {
            if (cjaVar.value == i) {
                return cjaVar;
            }
        }
        return null;
    }
}
