package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yse {
    public static final yse a;
    public static final yse b;
    public static final /* synthetic */ yse[] c;

    static {
        yse yseVar = new yse("Filled", 0);
        a = yseVar;
        yse yseVar2 = new yse("Outlined", 1);
        b = yseVar2;
        c = new yse[]{yseVar, yseVar2};
    }

    public static yse valueOf(String str) {
        return (yse) Enum.valueOf(yse.class, str);
    }

    public static yse[] values() {
        return (yse[]) c.clone();
    }
}
