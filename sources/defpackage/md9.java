package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 md9, still in use, count: 1, list:
  (r1v0 md9) from 0x00e0: INVOKE (r0v15 android.util.SparseArray), (0 int), (r1v0 md9) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:225)
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
public final class md9 {
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(0),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(1),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_MMS(2),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_SUPL(3),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_DUN(4),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_HIPRI(5),
    /* JADX INFO: Fake field, exist only in values array */
    WIMAX(6),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH(7),
    /* JADX INFO: Fake field, exist only in values array */
    DUMMY(8),
    /* JADX INFO: Fake field, exist only in values array */
    ETHERNET(9),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_FOTA(10),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IMS(11),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_CBS(12),
    /* JADX INFO: Fake field, exist only in values array */
    WIFI_P2P(13),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IA(14),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_EMERGENCY(15),
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(16),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(17),
    NONE(-1);

    public static final SparseArray b;
    private final int value;

    static {
        md9 md9Var = NONE;
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.put(0, md9Var);
        sparseArray.put(1, md9Var);
        sparseArray.put(2, md9Var);
        sparseArray.put(3, md9Var);
        sparseArray.put(4, md9Var);
        sparseArray.put(5, md9Var);
        sparseArray.put(6, md9Var);
        sparseArray.put(7, md9Var);
        sparseArray.put(8, md9Var);
        sparseArray.put(9, md9Var);
        sparseArray.put(10, md9Var);
        sparseArray.put(11, md9Var);
        sparseArray.put(12, md9Var);
        sparseArray.put(13, md9Var);
        sparseArray.put(14, md9Var);
        sparseArray.put(15, md9Var);
        sparseArray.put(16, md9Var);
        sparseArray.put(17, md9Var);
        sparseArray.put(-1, md9Var);
    }

    public md9(int i) {
        super(str, i);
        this.value = i;
    }

    public static md9 valueOf(String str) {
        return (md9) Enum.valueOf(md9.class, str);
    }

    public static md9[] values() {
        return (md9[]) c.clone();
    }

    public final int a() {
        return this.value;
    }
}
