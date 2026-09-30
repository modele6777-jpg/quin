package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m1f {
    public static final m1f a;
    public static final m1f b;
    public static final m1f c;
    public static final /* synthetic */ m1f[] d;

    static {
        m1f m1fVar = new m1f("Mixpanel", 0);
        a = m1fVar;
        m1f m1fVar2 = new m1f("Firebase", 1);
        b = m1fVar2;
        m1f m1fVar3 = new m1f("All", 2);
        c = m1fVar3;
        d = new m1f[]{m1fVar, m1fVar2, m1fVar3};
    }

    public static m1f valueOf(String str) {
        return (m1f) Enum.valueOf(m1f.class, str);
    }

    public static m1f[] values() {
        return (m1f[]) d.clone();
    }
}
