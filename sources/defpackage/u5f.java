package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u5f {
    public static final u5f a;
    public static final u5f b;
    public static final u5f c;
    public static final u5f d;
    public static final /* synthetic */ u5f[] e;

    static {
        u5f u5fVar = new u5f("SUCCESSFUL", 0);
        a = u5fVar;
        u5f u5fVar2 = new u5f("REREGISTER", 1);
        b = u5fVar2;
        u5f u5fVar3 = new u5f("CANCELLED", 2);
        c = u5fVar3;
        u5f u5fVar4 = new u5f("ALREADY_SELECTED", 3);
        d = u5fVar4;
        e = new u5f[]{u5fVar, u5fVar2, u5fVar3, u5fVar4};
    }

    public static u5f valueOf(String str) {
        return (u5f) Enum.valueOf(u5f.class, str);
    }

    public static u5f[] values() {
        return (u5f[]) e.clone();
    }
}
