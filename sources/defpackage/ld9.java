package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 ld9, still in use, count: 1, list:
  (r2v1 ld9) from 0x0103: INVOKE (r0v17 android.util.SparseArray), (1 int), (r2v1 ld9) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:260)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ld9 {
    UNKNOWN_MOBILE_SUBTYPE(0),
    /* JADX INFO: Fake field, exist only in values array */
    TD_SCDMA(1),
    /* JADX INFO: Fake field, exist only in values array */
    EDGE(2),
    /* JADX INFO: Fake field, exist only in values array */
    UMTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    CDMA(4),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_0(5),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_A(6),
    /* JADX INFO: Fake field, exist only in values array */
    RTT(7),
    /* JADX INFO: Fake field, exist only in values array */
    HSDPA(8),
    /* JADX INFO: Fake field, exist only in values array */
    HSUPA(9),
    /* JADX INFO: Fake field, exist only in values array */
    HSPA(10),
    /* JADX INFO: Fake field, exist only in values array */
    IDEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_B(12),
    /* JADX INFO: Fake field, exist only in values array */
    LTE(13),
    /* JADX INFO: Fake field, exist only in values array */
    EHRPD(14),
    /* JADX INFO: Fake field, exist only in values array */
    IWLAN(15),
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(16),
    /* JADX INFO: Fake field, exist only in values array */
    TD_SCDMA(17),
    /* JADX INFO: Fake field, exist only in values array */
    IWLAN(18),
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(19),
    COMBINED(100);

    public static final SparseArray c;
    private final int value;

    static {
        ld9 ld9Var = UNKNOWN_MOBILE_SUBTYPE;
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        sparseArray.put(0, ld9Var);
        sparseArray.put(1, ld9Var);
        sparseArray.put(2, ld9Var);
        sparseArray.put(3, ld9Var);
        sparseArray.put(4, ld9Var);
        sparseArray.put(5, ld9Var);
        sparseArray.put(6, ld9Var);
        sparseArray.put(7, ld9Var);
        sparseArray.put(8, ld9Var);
        sparseArray.put(9, ld9Var);
        sparseArray.put(10, ld9Var);
        sparseArray.put(11, ld9Var);
        sparseArray.put(12, ld9Var);
        sparseArray.put(13, ld9Var);
        sparseArray.put(14, ld9Var);
        sparseArray.put(15, ld9Var);
        sparseArray.put(16, ld9Var);
        sparseArray.put(17, ld9Var);
        sparseArray.put(18, ld9Var);
        sparseArray.put(19, ld9Var);
    }

    public ld9(int i) {
        super(str, i);
        this.value = i;
    }

    public static ld9 valueOf(String str) {
        return (ld9) Enum.valueOf(ld9.class, str);
    }

    public static ld9[] values() {
        return (ld9[]) d.clone();
    }

    public final int a() {
        return this.value;
    }
}
