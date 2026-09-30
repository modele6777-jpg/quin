package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class omd {
    public static final omd a;
    public static final omd b;
    public static final omd c;
    public static final omd d;
    public static final omd e;
    public static final /* synthetic */ omd[] f;

    static {
        omd omdVar = new omd("SELECTED", 0);
        a = omdVar;
        omd omdVar2 = new omd("AVAILABLE", 1);
        b = omdVar2;
        omd omdVar3 = new omd("NEEDS_DOWNLOAD", 2);
        c = omdVar3;
        omd omdVar4 = new omd("DOWNLOADING", 3);
        d = omdVar4;
        omd omdVar5 = new omd("LOCKED", 4);
        e = omdVar5;
        f = new omd[]{omdVar, omdVar2, omdVar3, omdVar4, omdVar5};
    }

    public static omd valueOf(String str) {
        return (omd) Enum.valueOf(omd.class, str);
    }

    public static omd[] values() {
        return (omd[]) f.clone();
    }
}
