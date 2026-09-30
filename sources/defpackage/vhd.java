package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
public final class vhd {
    public static final uhd Companion;
    public static final lw7 a;
    public static final /* synthetic */ vhd[] b;
    public static final /* synthetic */ mx4 c;

    /* JADX INFO: Fake field, exist only in values array */
    vhd EF5;

    static {
        vhd[] vhdVarArr = {new vhd("Mixpanel", 0), new vhd("Firebase", 1)};
        b = vhdVarArr;
        c = new mx4(vhdVarArr);
        Companion = new uhd();
        a = eb3.N(z18.b, new ead(18));
    }

    public static vhd valueOf(String str) {
        return (vhd) Enum.valueOf(vhd.class, str);
    }

    public static vhd[] values() {
        return (vhd[]) b.clone();
    }
}
