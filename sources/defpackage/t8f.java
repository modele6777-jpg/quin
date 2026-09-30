package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t8f {
    public static final t8f a;
    public static final t8f b;
    public static final /* synthetic */ t8f[] c;

    static {
        t8f t8fVar = new t8f("SUPERTYPE", 0);
        a = t8fVar;
        t8f t8fVar2 = new t8f("COMMON", 1);
        b = t8fVar2;
        c = new t8f[]{t8fVar, t8fVar2};
    }

    public static t8f valueOf(String str) {
        return (t8f) Enum.valueOf(t8f.class, str);
    }

    public static t8f[] values() {
        return (t8f[]) c.clone();
    }
}
