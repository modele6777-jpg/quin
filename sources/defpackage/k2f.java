package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k2f {
    public static final k2f a;
    public static final k2f b;
    public static final /* synthetic */ k2f[] c;

    static {
        k2f k2fVar = new k2f("DEFERRED", 0);
        a = k2fVar;
        k2f k2fVar2 = new k2f("IMMEDIATE", 1);
        b = k2fVar2;
        c = new k2f[]{k2fVar, k2fVar2, new k2f("EXCLUSIVE", 2)};
    }

    public static k2f valueOf(String str) {
        return (k2f) Enum.valueOf(k2f.class, str);
    }

    public static k2f[] values() {
        return (k2f[]) c.clone();
    }
}
