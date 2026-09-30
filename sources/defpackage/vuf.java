package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vuf {
    public static final g3e a;
    public static final vuf b;
    public static final vuf c;
    public static final vuf d;
    public static final vuf e;
    public static final /* synthetic */ vuf[] f;

    static {
        vuf vufVar = new vuf("UNSPECIFIED", 0);
        b = vufVar;
        vuf vufVar2 = new vuf("OFF", 1);
        c = vufVar2;
        vuf vufVar3 = new vuf("ON", 2);
        d = vufVar3;
        vuf vufVar4 = new vuf("PREVIEW", 3);
        e = vufVar4;
        f = new vuf[]{vufVar, vufVar2, vufVar3, vufVar4};
        a = new g3e(9);
    }

    public static vuf valueOf(String str) {
        return (vuf) Enum.valueOf(vuf.class, str);
    }

    public static vuf[] values() {
        return (vuf[]) f.clone();
    }
}
