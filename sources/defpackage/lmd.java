package defpackage;

import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v8 lmd[], still in use, count: 1, list:
  (r1v8 lmd[]) from 0x0126: CONSTRUCTOR (r2v8 mx4) = (r1v8 lmd[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:295) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class lmd implements p07 {
    c("waite-tarot", "waite-tarot"),
    d("neo-waite-tarot", "neo-waite-tarot"),
    e("app.xmind.quin.cat_tarot", "cat-tarot"),
    f("app.xmind.quin.love_tarot", "love-tarot"),
    g("app.xmind.quin.puppet_tarot", "puppet-tarot"),
    v("app.xmind.quin.minimalism_tarot", "minimalism-tarot"),
    w("app.xmind.quin.symbolism_tarot", "symbolism-tarot"),
    x("app.xmind.quin.fable_tarot", "fable-tarot"),
    y("app.xmind.quin.woodcut_tarot", "woodcut-tarot"),
    z("app.xmind.quin.dream_tarot", "dream-tarot"),
    X("app.xmind.quin.prism_tarot", "prism-tarot"),
    Y("app.xmind.quin.midnight_tarot", "midnight-tarot"),
    Z("app.xmind.quin.darkgold_tarot", "darkgold-tarot"),
    E0("app.xmind.quin.zenith_day", "zenith-day"),
    F0("app.xmind.quin.eternal_night", "eternal-night"),
    G0("app.xmind.quin.transformation_tarot", "transformation-tarot"),
    H0("app.xmind.quin.secretmanor_tarot", "secretmanor-tarot"),
    I0("app.xmind.quin.magicawakening_tarot", "magicawakening-tarot");

    public static final eu4 a;
    public static final List b;
    private final String key;
    private final String productId;

    static {
        mx4 mx4Var = new mx4(lmdVarArr);
        a = new eu4(28);
        b = s72.r0(mx4Var, 2);
    }

    public lmd(String str, String str2) {
        super(str, i);
        this.productId = str;
        this.key = str2;
    }

    public static lmd valueOf(String str) {
        return (lmd) Enum.valueOf(lmd.class, str);
    }

    public static lmd[] values() {
        return (lmd[]) J0.clone();
    }

    @Override // defpackage.cwa
    public final String b() {
        return this.productId;
    }

    public final String d() {
        return this.key;
    }
}
