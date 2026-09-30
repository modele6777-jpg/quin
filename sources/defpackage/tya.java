package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum tya implements j87 {
    CONCLUSION_CONDITION(0),
    RETURNS_CONDITION(1),
    HOLDSIN_CONDITION(2);

    private final int value;

    tya(int i) {
        this.value = i;
    }

    @Override // defpackage.j87
    public final int a() {
        return this.value;
    }
}
