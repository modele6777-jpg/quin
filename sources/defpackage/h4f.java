package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h4f {
    public static final h4f a;
    public static final h4f b;
    public static final h4f c;
    public static final /* synthetic */ h4f[] d;

    static {
        h4f h4fVar = new h4f("ContinueTraversal", 0);
        a = h4fVar;
        h4f h4fVar2 = new h4f("SkipSubtreeAndContinueTraversal", 1);
        b = h4fVar2;
        h4f h4fVar3 = new h4f("CancelTraversal", 2);
        c = h4fVar3;
        d = new h4f[]{h4fVar, h4fVar2, h4fVar3};
    }

    public static h4f valueOf(String str) {
        return (h4f) Enum.valueOf(h4f.class, str);
    }

    public static h4f[] values() {
        return (h4f[]) d.clone();
    }
}
