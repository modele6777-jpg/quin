package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ya3[], still in use, count: 1, list:
  (r0v1 ya3[]) from 0x002c: CONSTRUCTOR (r0v1 ya3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class ya3 {
    Today("today", 10001, 10001, 0L),
    Tomorrow("tomorrow", 10002, 10002, 1L);

    public static final gec a = new gec(23);
    public static final /* synthetic */ mx4 e;
    private final int notificationId;
    private final int requestCode;
    private final long targetDateOffsetDays;
    private final String wireValue;

    static {
        e = new mx4(new ya3[]{r0, r1});
    }

    public ya3(String str, int i, int i2, long j) {
        super(str, i);
        this.wireValue = str;
        this.requestCode = i;
        this.notificationId = i2;
        this.targetDateOffsetDays = j;
    }

    public static ya3 valueOf(String str) {
        return (ya3) Enum.valueOf(ya3.class, str);
    }

    public static ya3[] values() {
        return (ya3[]) d.clone();
    }

    public final int a() {
        return this.notificationId;
    }

    public final int b() {
        return this.requestCode;
    }

    public final long c() {
        return this.targetDateOffsetDays;
    }

    public final String d() {
        return this.wireValue;
    }
}
