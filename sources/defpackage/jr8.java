package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum jr8 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    USE_AFTER_FREE(1),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_FREE(2),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_FREE(3),
    /* JADX INFO: Fake field, exist only in values array */
    BUFFER_OVERFLOW(4),
    /* JADX INFO: Fake field, exist only in values array */
    BUFFER_UNDERFLOW(5);

    private final int value;

    jr8(int i) {
        this.value = i;
    }

    public static void a(int i) {
        jr8[] jr8VarArrValues = values();
        int length = jr8VarArrValues.length;
        for (int i2 = 0; i2 < length && jr8VarArrValues[i2].value != i; i2++) {
        }
    }
}
