package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x7f {
    public static final v7f a;
    public static final t7f b;
    public static final w7f c;
    public static final u7f d;
    public static final /* synthetic */ x7f[] e;

    static {
        v7f v7fVar = new v7f();
        a = v7fVar;
        t7f t7fVar = new t7f();
        b = t7fVar;
        w7f w7fVar = new w7f();
        c = w7fVar;
        u7f u7fVar = new u7f();
        d = u7fVar;
        e = new x7f[]{v7fVar, t7fVar, w7fVar, u7fVar};
    }

    public static x7f b(jgf jgfVar) {
        jgfVar.getClass();
        if (jgfVar.i0()) {
            return b;
        }
        return vfh.x(qfc.d.M0(), pa7.Z(jgfVar), g7f.b) ? d : c;
    }

    public static x7f valueOf(String str) {
        return (x7f) Enum.valueOf(x7f.class, str);
    }

    public static x7f[] values() {
        return (x7f[]) e.clone();
    }

    public abstract x7f a(jgf jgfVar);
}
