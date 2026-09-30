package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xad[], still in use, count: 1, list:
  (r0v1 xad[]) from 0x0044: CONSTRUCTOR (r0v1 xad[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:69) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class xad {
    ShareButton("share_button"),
    Screenshot("screenshot"),
    DailyCard("daily_card"),
    DailyCardScreenshot("daily_card_screenshot"),
    GiftCard("gift_card");

    public static final /* synthetic */ mx4 g;
    private final String analyticsValue;

    static {
        g = new mx4(xadVarArr);
    }

    public xad(String str) {
        super(str, i);
        this.analyticsValue = str;
    }

    public static xad valueOf(String str) {
        return (xad) Enum.valueOf(xad.class, str);
    }

    public static xad[] values() {
        return (xad[]) f.clone();
    }

    public final String a() {
        return this.analyticsValue;
    }
}
