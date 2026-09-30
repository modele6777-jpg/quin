package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ube {
    public static final ube a;
    public static final ube b;
    public static final /* synthetic */ ube[] c;

    static {
        ube ubeVar = new ube("Resting", 0);
        a = ubeVar;
        ube ubeVar2 = new ube("Delete", 1);
        b = ubeVar2;
        c = new ube[]{ubeVar, ubeVar2};
    }

    public static ube valueOf(String str) {
        return (ube) Enum.valueOf(ube.class, str);
    }

    public static ube[] values() {
        return (ube[]) c.clone();
    }
}
