package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum oc0 {
    /* JADX INFO: Fake field, exist only in values array */
    ARM32(0),
    /* JADX INFO: Fake field, exist only in values array */
    ARM64(1),
    /* JADX INFO: Fake field, exist only in values array */
    X86(2),
    /* JADX INFO: Fake field, exist only in values array */
    X86_64(3),
    /* JADX INFO: Fake field, exist only in values array */
    RISCV64(4),
    NONE(5);

    private final int value;

    oc0(int i) {
        this.value = i;
    }

    public static oc0 a(int i) {
        for (oc0 oc0Var : values()) {
            if (oc0Var.value == i) {
                return oc0Var;
            }
        }
        return NONE;
    }
}
