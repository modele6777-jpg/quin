package defpackage;

import ai.askquin.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 la5[], still in use, count: 1, list:
  (r0v3 la5[]) from 0x00a2: CONSTRUCTOR (r0v3 la5[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:163) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class la5 implements dvd {
    /* JADX INFO: Fake field, exist only in values array */
    Fallback1(1, R.drawable.spread_qi),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback2(2, R.drawable.fallback2),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback3(3, R.drawable.fallback3),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback4(4, R.drawable.fallback4),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback5(5, R.drawable.fallback5),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback6(6, R.drawable.fallback6),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback7(7, R.drawable.fallback7),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback8(8, R.drawable.fallback8),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback9(9, R.drawable.fallback9),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback10(10, R.drawable.fallback10),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback11(11, R.drawable.fallback11),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback12(12, R.drawable.fallback12),
    /* JADX INFO: Fake field, exist only in values array */
    Fallback13(13, R.drawable.fallback13);

    public static final /* synthetic */ mx4 b;
    private final int count;
    private final int drawableId;

    static {
        b = new mx4(la5VarArr);
    }

    public la5(int i, int i2) {
        super(str, i);
        this.count = i;
        this.drawableId = i2;
    }

    public static la5 valueOf(String str) {
        return (la5) Enum.valueOf(la5.class, str);
    }

    public static la5[] values() {
        return (la5[]) a.clone();
    }

    @Override // defpackage.dvd
    public final int a() {
        return this.drawableId;
    }

    @Override // defpackage.dvd
    public final String b(l46 l46Var) {
        String strR;
        l46Var.f0(-755018379);
        if (this.count == 1) {
            strR = tec.i(l46Var, 276812609, R.string.spread_group_single, l46Var, false);
        } else {
            l46Var.f0(276814504);
            strR = afc.r(R.string.spread_group_n, new Object[]{Integer.valueOf(this.count)}, l46Var);
            l46Var.r(false);
        }
        l46Var.r(false);
        return strR;
    }

    public final String d() {
        int i = this.count;
        return i == 1 ? "Single-Card Spread" : ub3.g(i, "-Card Spread");
    }
}
