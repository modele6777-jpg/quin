package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q3d {
    public static final q3d a;
    public static final /* synthetic */ q3d[] b;

    /* JADX INFO: Fake field, exist only in values array */
    q3d EF0;

    static {
        q3d q3dVar = new q3d("None", 0);
        q3d q3dVar2 = new q3d("Navigate", 1);
        a = q3dVar2;
        b = new q3d[]{q3dVar, q3dVar2};
    }

    public static q3d valueOf(String str) {
        return (q3d) Enum.valueOf(q3d.class, str);
    }

    public static q3d[] values() {
        return (q3d[]) b.clone();
    }
}
