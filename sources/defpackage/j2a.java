package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j2a {
    public static final j2a a;
    public static final j2a b;
    public static final j2a c;
    public static final /* synthetic */ j2a[] d;

    static {
        j2a j2aVar = new j2a("Initial", 0);
        a = j2aVar;
        j2a j2aVar2 = new j2a("Partial", 1);
        b = j2aVar2;
        j2a j2aVar3 = new j2a("Complete", 2);
        c = j2aVar3;
        d = new j2a[]{j2aVar, j2aVar2, j2aVar3};
    }

    public static j2a valueOf(String str) {
        return (j2a) Enum.valueOf(j2a.class, str);
    }

    public static j2a[] values() {
        return (j2a[]) d.clone();
    }
}
