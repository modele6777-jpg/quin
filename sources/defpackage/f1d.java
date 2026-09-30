package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f1d {
    public static final f1d a;
    public static final f1d b;
    public static final f1d c;
    public static final /* synthetic */ f1d[] d;

    static {
        f1d f1dVar = new f1d("UserQuestion", 0);
        a = f1dVar;
        f1d f1dVar2 = new f1d("EventDaily", 1);
        b = f1dVar2;
        f1d f1dVar3 = new f1d("EventMonthly", 2);
        f1d f1dVar4 = new f1d("SceneCategory", 3);
        c = f1dVar4;
        d = new f1d[]{f1dVar, f1dVar2, f1dVar3, f1dVar4};
    }

    public static f1d valueOf(String str) {
        return (f1d) Enum.valueOf(f1d.class, str);
    }

    public static f1d[] values() {
        return (f1d[]) d.clone();
    }
}
