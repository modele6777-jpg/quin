package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u8f {
    public static final u8f a;
    public static final u8f b;
    public static final /* synthetic */ u8f[] c;

    static {
        u8f u8fVar = new u8f("SUPERTYPE", 0);
        a = u8fVar;
        u8f u8fVar2 = new u8f("COMMON", 1);
        b = u8fVar2;
        c = new u8f[]{u8fVar, u8fVar2};
    }

    public static u8f valueOf(String str) {
        return (u8f) Enum.valueOf(u8f.class, str);
    }

    public static u8f[] values() {
        return (u8f[]) c.clone();
    }
}
