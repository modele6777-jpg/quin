package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hgd {
    public static final hgd a;
    public static final hgd b;
    public static final hgd c;
    public static final hgd d;
    public static final hgd e;
    public static final /* synthetic */ hgd[] f;

    static {
        hgd hgdVar = new hgd("Initial", 0);
        a = hgdVar;
        hgd hgdVar2 = new hgd("Entry", 1);
        b = hgdVar2;
        hgd hgdVar3 = new hgd("Shuffling", 2);
        c = hgdVar3;
        hgd hgdVar4 = new hgd("ReadyToCut", 3);
        d = hgdVar4;
        hgd hgdVar5 = new hgd("Cut", 4);
        e = hgdVar5;
        f = new hgd[]{hgdVar, hgdVar2, hgdVar3, hgdVar4, hgdVar5};
    }

    public static hgd valueOf(String str) {
        return (hgd) Enum.valueOf(hgd.class, str);
    }

    public static hgd[] values() {
        return (hgd[]) f.clone();
    }
}
