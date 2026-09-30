package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b8f {
    public static final b8f a;
    public static final b8f b;
    public static final b8f c;
    public static final /* synthetic */ b8f[] d;

    static {
        b8f b8fVar = new b8f("NOT_NULL", 0);
        a = b8fVar;
        b8f b8fVar2 = new b8f("NULLABLE", 1);
        b = b8fVar2;
        b8f b8fVar3 = new b8f("FLEXIBLE", 2);
        c = b8fVar3;
        d = new b8f[]{b8fVar, b8fVar2, b8fVar3};
    }

    public static b8f valueOf(String str) {
        return (b8f) Enum.valueOf(b8f.class, str);
    }

    public static b8f[] values() {
        return (b8f[]) d.clone();
    }
}
