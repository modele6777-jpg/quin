package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cde {
    public static final cde a;
    public static final cde b;
    public static final cde c;
    public static final /* synthetic */ cde[] d;

    static {
        cde cdeVar = new cde("Tabs", 0);
        a = cdeVar;
        cde cdeVar2 = new cde("Divider", 1);
        b = cdeVar2;
        cde cdeVar3 = new cde("Indicator", 2);
        c = cdeVar3;
        d = new cde[]{cdeVar, cdeVar2, cdeVar3};
    }

    public static cde valueOf(String str) {
        return (cde) Enum.valueOf(cde.class, str);
    }

    public static cde[] values() {
        return (cde[]) d.clone();
    }
}
