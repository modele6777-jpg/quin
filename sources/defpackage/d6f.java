package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d6f {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;
    public static final d6f d;
    public static final /* synthetic */ d6f[] e;

    static {
        d6f d6fVar = new d6f("IDLE", 0);
        a = d6fVar;
        d6f d6fVar2 = new d6f("LOADING", 1);
        b = d6fVar2;
        d6f d6fVar3 = new d6f("PLAYING", 2);
        c = d6fVar3;
        d6f d6fVar4 = new d6f("PAUSED", 3);
        d = d6fVar4;
        e = new d6f[]{d6fVar, d6fVar2, d6fVar3, d6fVar4};
    }

    public static d6f valueOf(String str) {
        return (d6f) Enum.valueOf(d6f.class, str);
    }

    public static d6f[] values() {
        return (d6f[]) e.clone();
    }
}
