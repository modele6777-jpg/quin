package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u0c {
    public static final u0c a;
    public static final u0c b;
    public static final u0c c;
    public static final /* synthetic */ u0c[] d;

    static {
        u0c u0cVar = new u0c("CLAIMED", 0);
        a = u0cVar;
        u0c u0cVar2 = new u0c("UNCLAIMED", 1);
        b = u0cVar2;
        u0c u0cVar3 = new u0c("UNAVAILABLE", 2);
        c = u0cVar3;
        d = new u0c[]{u0cVar, u0cVar2, u0cVar3};
    }

    public static u0c valueOf(String str) {
        return (u0c) Enum.valueOf(u0c.class, str);
    }

    public static u0c[] values() {
        return (u0c[]) d.clone();
    }
}
