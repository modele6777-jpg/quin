package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l5a {
    public static final l5a a;
    public static final l5a b;
    public static final l5a c;
    public static final /* synthetic */ l5a[] d;

    static {
        l5a l5aVar = new l5a("MONTHLY", 0);
        a = l5aVar;
        l5a l5aVar2 = new l5a("YEARLY", 1);
        b = l5aVar2;
        l5a l5aVar3 = new l5a("FIVE_TIMES", 2);
        c = l5aVar3;
        d = new l5a[]{l5aVar, l5aVar2, l5aVar3};
    }

    public static l5a valueOf(String str) {
        return (l5a) Enum.valueOf(l5a.class, str);
    }

    public static l5a[] values() {
        return (l5a[]) d.clone();
    }
}
