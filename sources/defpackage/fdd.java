package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fdd {
    public static final fdd a;
    public static final fdd b;
    public static final /* synthetic */ fdd[] c;

    static {
        fdd fddVar = new fdd("GENERAL", 0);
        a = fddVar;
        fdd fddVar2 = new fdd("FALLBACK", 1);
        b = fddVar2;
        c = new fdd[]{fddVar, fddVar2};
    }

    public static fdd valueOf(String str) {
        return (fdd) Enum.valueOf(fdd.class, str);
    }

    public static fdd[] values() {
        return (fdd[]) c.clone();
    }
}
