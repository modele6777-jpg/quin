package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum pza implements j87 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    MUST_USE(1),
    /* JADX INFO: Fake field, exist only in values array */
    EXPLICITLY_IGNORABLE(2);

    private final int value;

    pza(int i) {
        this.value = i;
    }

    @Override // defpackage.j87
    public final int a() {
        return this.value;
    }
}
