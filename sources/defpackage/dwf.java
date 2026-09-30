package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dwf {
    public static final dwf a;
    public static final dwf b;
    public static final /* synthetic */ dwf[] c;

    static {
        dwf dwfVar = new dwf("Play", 0);
        a = dwfVar;
        dwf dwfVar2 = new dwf("Chart", 1);
        b = dwfVar2;
        c = new dwf[]{dwfVar, dwfVar2};
    }

    public static dwf valueOf(String str) {
        return (dwf) Enum.valueOf(dwf.class, str);
    }

    public static dwf[] values() {
        return (dwf[]) c.clone();
    }
}
