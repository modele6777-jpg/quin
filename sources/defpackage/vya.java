package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum vya implements j87 {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);

    private final int value;

    vya(int i) {
        this.value = i;
    }

    @Override // defpackage.j87
    public final int a() {
        return this.value;
    }
}
