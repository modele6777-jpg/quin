package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lie {
    public static final lie a;
    public static final lie b;
    public static final lie c;
    public static final lie d;
    public static final /* synthetic */ lie[] e;

    static {
        lie lieVar = new lie("Air", 0);
        a = lieVar;
        lie lieVar2 = new lie("Water", 1);
        b = lieVar2;
        lie lieVar3 = new lie("Fire", 2);
        c = lieVar3;
        lie lieVar4 = new lie("Earth", 3);
        d = lieVar4;
        e = new lie[]{lieVar, lieVar2, lieVar3, lieVar4};
    }

    public static lie valueOf(String str) {
        return (lie) Enum.valueOf(lie.class, str);
    }

    public static lie[] values() {
        return (lie[]) e.clone();
    }
}
