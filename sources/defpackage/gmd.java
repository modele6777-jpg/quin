package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gmd {
    public static final gmd a;
    public static final gmd b;
    public static final gmd c;
    public static final gmd d;
    public static final gmd e;
    public static final /* synthetic */ gmd[] f;

    static {
        gmd gmdVar = new gmd("NOT_APPLICABLE", 0);
        a = gmdVar;
        gmd gmdVar2 = new gmd("PENDING", 1);
        b = gmdVar2;
        gmd gmdVar3 = new gmd("DOWNLOADING", 2);
        c = gmdVar3;
        gmd gmdVar4 = new gmd("FAILED", 3);
        d = gmdVar4;
        gmd gmdVar5 = new gmd("COMPLETED", 4);
        e = gmdVar5;
        f = new gmd[]{gmdVar, gmdVar2, gmdVar3, gmdVar4, gmdVar5};
    }

    public static gmd valueOf(String str) {
        return (gmd) Enum.valueOf(gmd.class, str);
    }

    public static gmd[] values() {
        return (gmd[]) f.clone();
    }
}
