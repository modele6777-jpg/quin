package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nmd {
    public static final nmd a;
    public static final nmd b;
    public static final nmd c;
    public static final nmd d;
    public static final nmd e;
    public static final /* synthetic */ nmd[] f;

    static {
        nmd nmdVar = new nmd("SELECTED", 0);
        a = nmdVar;
        nmd nmdVar2 = new nmd("AVAILABLE", 1);
        b = nmdVar2;
        nmd nmdVar3 = new nmd("NEEDS_DOWNLOAD", 2);
        c = nmdVar3;
        nmd nmdVar4 = new nmd("DOWNLOADING", 3);
        d = nmdVar4;
        nmd nmdVar5 = new nmd("LOCKED", 4);
        e = nmdVar5;
        f = new nmd[]{nmdVar, nmdVar2, nmdVar3, nmdVar4, nmdVar5};
    }

    public static nmd valueOf(String str) {
        return (nmd) Enum.valueOf(nmd.class, str);
    }

    public static nmd[] values() {
        return (nmd[]) f.clone();
    }
}
