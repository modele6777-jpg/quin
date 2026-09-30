package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gbd {
    public static final gbd a;
    public static final gbd b;
    public static final gbd c;
    public static final gbd d;
    public static final gbd e;
    public static final /* synthetic */ gbd[] f;

    static {
        gbd gbdVar = new gbd("QQ", 0);
        a = gbdVar;
        gbd gbdVar2 = new gbd("QQ_ZONE", 1);
        b = gbdVar2;
        gbd gbdVar3 = new gbd("WeChat", 2);
        c = gbdVar3;
        gbd gbdVar4 = new gbd("WeChatMoments", 3);
        d = gbdVar4;
        gbd gbdVar5 = new gbd("Normal", 4);
        e = gbdVar5;
        f = new gbd[]{gbdVar, gbdVar2, gbdVar3, gbdVar4, gbdVar5};
    }

    public static gbd valueOf(String str) {
        return (gbd) Enum.valueOf(gbd.class, str);
    }

    public static gbd[] values() {
        return (gbd[]) f.clone();
    }
}
