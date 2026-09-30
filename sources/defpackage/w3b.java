package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 w3b, still in use, count: 1, list:
  (r1v1 w3b) from 0x0041: INVOKE (r11v2 android.util.SparseArray), (1 int), (r1v1 w3b) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:66)
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
public final class w3b {
    DEFAULT(0),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY(2),
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE(3),
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(4),
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED(-1);

    private final int value;

    static {
        w3b w3bVar = DEFAULT;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, w3bVar);
        sparseArray.put(1, w3bVar);
        sparseArray.put(2, w3bVar);
        sparseArray.put(3, w3bVar);
        sparseArray.put(4, w3bVar);
        sparseArray.put(-1, w3bVar);
    }

    public w3b(int i) {
        super(str, i);
        this.value = i;
    }

    public static w3b valueOf(String str) {
        return (w3b) Enum.valueOf(w3b.class, str);
    }

    public static w3b[] values() {
        return (w3b[]) b.clone();
    }
}
