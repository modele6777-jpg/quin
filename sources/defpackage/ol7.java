package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum ol7 implements j87 {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);

    private final int value;

    ol7(int i) {
        this.value = i;
    }

    @Override // defpackage.j87
    public final int a() {
        return this.value;
    }
}
