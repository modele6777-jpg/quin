package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q2g {
    public static final q2g a;
    public static final q2g b;
    public static final /* synthetic */ q2g[] c;

    static {
        q2g q2gVar = new q2g("Start", 0);
        a = q2gVar;
        q2g q2gVar2 = new q2g("End", 1);
        b = q2gVar2;
        c = new q2g[]{q2gVar, q2gVar2};
    }

    public static q2g valueOf(String str) {
        return (q2g) Enum.valueOf(q2g.class, str);
    }

    public static q2g[] values() {
        return (q2g[]) c.clone();
    }
}
