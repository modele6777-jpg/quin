package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e4d {
    public static final e4d a;
    public static final e4d b;
    public static final /* synthetic */ e4d[] c;

    static {
        e4d e4dVar = new e4d("Subscribe", 0);
        a = e4dVar;
        e4d e4dVar2 = new e4d("Upgrade", 1);
        b = e4dVar2;
        c = new e4d[]{e4dVar, e4dVar2};
    }

    public static e4d valueOf(String str) {
        return (e4d) Enum.valueOf(e4d.class, str);
    }

    public static e4d[] values() {
        return (e4d[]) c.clone();
    }
}
