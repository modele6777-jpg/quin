package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fpe {
    public static final fpe a;
    public static final fpe b;
    public static final /* synthetic */ fpe[] c;

    static {
        fpe fpeVar = new fpe("MergeIfPossible", 0);
        a = fpeVar;
        fpe fpeVar2 = new fpe("ClearHistory", 1);
        fpe fpeVar3 = new fpe("NeverMerge", 2);
        b = fpeVar3;
        c = new fpe[]{fpeVar, fpeVar2, fpeVar3};
    }

    public static fpe valueOf(String str) {
        return (fpe) Enum.valueOf(fpe.class, str);
    }

    public static fpe[] values() {
        return (fpe[]) c.clone();
    }
}
