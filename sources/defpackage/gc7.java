package defpackage;

import ai.askquin.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gc7[], still in use, count: 1, list:
  (r0v1 gc7[]) from 0x0085: CONSTRUCTOR (r0v1 gc7[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:134) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class gc7 {
    /* JADX INFO: Fake field, exist only in values array */
    Level1(20, R.drawable.invitation_tier_1_default, R.drawable.invitation_tier_1_reach, R.drawable.invitation_tier_1_progressing, R.drawable.invitation_tier_1_default, R.string.invitation_tier_1_title),
    /* JADX INFO: Fake field, exist only in values array */
    Level2(40, R.drawable.invitation_tier_2_default, R.drawable.invitation_tier_2_reach, R.drawable.invitation_tier_2_progressing, R.drawable.invitation_tier_2_default, R.string.invitation_tier_3_title),
    /* JADX INFO: Fake field, exist only in values array */
    Level3(60, R.drawable.invitation_tier_3_default, R.drawable.invitation_tier_3_reach, R.drawable.invitation_tier_3_progressing, R.drawable.invitation_tier_3_default, R.string.invitation_tier_5_title),
    /* JADX INFO: Fake field, exist only in values array */
    Level4(80, R.drawable.invitation_tier_4_default, R.drawable.invitation_tier_4_reach, R.drawable.invitation_tier_4_progressing, R.drawable.invitation_tier_4_default, R.string.invitation_tier_10_title),
    /* JADX INFO: Fake field, exist only in values array */
    Level5(100, R.drawable.invitation_tier_5_default, R.drawable.invitation_tier_5_default, R.drawable.invitation_tier_5_progressing, R.drawable.invitation_tier_5_default, R.string.invitation_tier_20_title);

    public static final /* synthetic */ mx4 b;
    private final int defaultIcon;
    private final int inProgressIcon;
    private final int number;
    private final int reachIcon;
    private final int title;
    private final int unstartIcon;

    static {
        b = new mx4(gc7VarArr);
    }

    public gc7(int i, int i2, int i3, int i4, int i5, int i6) {
        super(str, i);
        this.number = i;
        this.defaultIcon = i2;
        this.reachIcon = i3;
        this.inProgressIcon = i4;
        this.unstartIcon = i5;
        this.title = i6;
    }

    public static gc7 valueOf(String str) {
        return (gc7) Enum.valueOf(gc7.class, str);
    }

    public static gc7[] values() {
        return (gc7[]) a.clone();
    }

    public final int a() {
        return this.defaultIcon;
    }

    public final int b() {
        return this.inProgressIcon;
    }

    public final int c() {
        return this.number;
    }
}
