package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qnc[], still in use, count: 1, list:
  (r0v1 qnc[]) from 0x000d: CONSTRUCTOR (r0v1 qnc[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:14) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class qnc {
    /* JADX INFO: Fake field, exist only in values array */
    AUTUMN_EQUINOX_2026;

    public static final y25 a = new y25(26);
    public static final /* synthetic */ mx4 c = new mx4(new qnc[]{new qnc()});
    private final String solarTermWire;
    private final String wireValue;
    private final int year;

    static {
    }

    public qnc() {
        super("AUTUMN_EQUINOX_2026", 0);
        this.wireValue = "2026_autumn_equinox";
        this.year = 2026;
        this.solarTermWire = "autumnEquinox";
    }

    public static qnc valueOf(String str) {
        return (qnc) Enum.valueOf(qnc.class, str);
    }

    public static qnc[] values() {
        return (qnc[]) b.clone();
    }

    public final String a() {
        return this.solarTermWire;
    }

    public final String b() {
        return this.wireValue;
    }

    public final int c() {
        return this.year;
    }

    public final yic d() {
        return new yic(this.year, SolarTerm.AUTUMN_EQUINOX);
    }
}
