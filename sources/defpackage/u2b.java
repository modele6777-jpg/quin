package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u2b {
    public static final u2b a;
    public static final /* synthetic */ u2b[] b;

    /* JADX INFO: Fake field, exist only in values array */
    u2b EF0;

    static {
        u2b u2bVar = new u2b("AliCloud", 0);
        u2b u2bVar2 = new u2b("Firebase", 1);
        a = u2bVar2;
        b = new u2b[]{u2bVar, u2bVar2};
    }

    public static u2b valueOf(String str) {
        return (u2b) Enum.valueOf(u2b.class, str);
    }

    public static u2b[] values() {
        return (u2b[]) b.clone();
    }
}
