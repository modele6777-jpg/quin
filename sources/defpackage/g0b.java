package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum g0b implements j87 {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);

    private final int value;

    g0b(int i) {
        this.value = i;
    }

    @Override // defpackage.j87
    public final int a() {
        return this.value;
    }
}
