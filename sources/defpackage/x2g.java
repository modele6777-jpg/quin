package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x2g {
    public static final x2g a;
    public static final x2g b;
    public static final /* synthetic */ x2g[] c;

    static {
        x2g x2gVar = new x2g("Initial", 0);
        a = x2gVar;
        x2g x2gVar2 = new x2g("Final", 1);
        b = x2gVar2;
        c = new x2g[]{x2gVar, x2gVar2};
    }

    public static x2g valueOf(String str) {
        return (x2g) Enum.valueOf(x2g.class, str);
    }

    public static x2g[] values() {
        return (x2g[]) c.clone();
    }
}
