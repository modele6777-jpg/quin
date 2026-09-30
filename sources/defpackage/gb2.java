package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gb2, still in use, count: 1, list:
  (r0v0 gb2) from 0x001e: INVOKE (r3v2 android.util.SparseArray), (0 int), (r0v0 gb2) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:31)
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
public final class gb2 {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SET(0),
    EVENT_OVERRIDE(5);

    private final int value;

    static {
        gb2 gb2Var = EVENT_OVERRIDE;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, gb2Var);
        sparseArray.put(5, gb2Var);
    }

    public gb2(int i) {
        super(str, i);
        this.value = i;
    }

    public static gb2 valueOf(String str) {
        return (gb2) Enum.valueOf(gb2.class, str);
    }

    public static gb2[] values() {
        return (gb2[]) b.clone();
    }
}
