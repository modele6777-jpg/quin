package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x7d {
    public static final x7d a;
    public static final x7d b;
    public static final x7d c;
    public static final /* synthetic */ x7d[] d;

    static {
        x7d x7dVar = new x7d("None", 0);
        a = x7dVar;
        x7d x7dVar2 = new x7d("ReleaseInteraction", 1);
        b = x7dVar2;
        x7d x7dVar3 = new x7d("ReleaseOperation", 2);
        c = x7dVar3;
        d = new x7d[]{x7dVar, x7dVar2, x7dVar3};
    }

    public static x7d valueOf(String str) {
        return (x7d) Enum.valueOf(x7d.class, str);
    }

    public static x7d[] values() {
        return (x7d[]) d.clone();
    }
}
