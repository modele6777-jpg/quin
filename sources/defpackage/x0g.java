package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x0g {
    public static final x0g a;
    public static final /* synthetic */ x0g[] b;

    /* JADX INFO: Fake field, exist only in values array */
    x0g EF0;

    static {
        x0g x0gVar = new x0g("Default", 0);
        x0g x0gVar2 = new x0g("AnnualReport", 1);
        a = x0gVar2;
        b = new x0g[]{x0gVar, x0gVar2};
    }

    public static x0g valueOf(String str) {
        return (x0g) Enum.valueOf(x0g.class, str);
    }

    public static x0g[] values() {
        return (x0g[]) b.clone();
    }
}
