package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zjf {
    public static final zjf a;
    public static final zjf b;
    public static final zjf c;
    public static final zjf d;
    public static final zjf e;
    public static final zjf f;
    public static final /* synthetic */ zjf[] g;

    static {
        zjf zjfVar = new zjf("IMAGE_CAPTURE", 0);
        a = zjfVar;
        zjf zjfVar2 = new zjf("PREVIEW", 1);
        b = zjfVar2;
        zjf zjfVar3 = new zjf("IMAGE_ANALYSIS", 2);
        c = zjfVar3;
        zjf zjfVar4 = new zjf("VIDEO_CAPTURE", 3);
        d = zjfVar4;
        zjf zjfVar5 = new zjf("STREAM_SHARING", 4);
        e = zjfVar5;
        zjf zjfVar6 = new zjf("METERING_REPEATING", 5);
        f = zjfVar6;
        g = new zjf[]{zjfVar, zjfVar2, zjfVar3, zjfVar4, zjfVar5, zjfVar6};
    }

    public static zjf valueOf(String str) {
        return (zjf) Enum.valueOf(zjf.class, str);
    }

    public static zjf[] values() {
        return (zjf[]) g.clone();
    }
}
