package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y9e {
    public static final y9e a;
    public static final y9e b;
    public static final y9e c;
    public static final y9e d;
    public static final y9e e;
    public static final /* synthetic */ y9e[] f;

    static {
        y9e y9eVar = new y9e("PRIV", 0);
        a = y9eVar;
        y9e y9eVar2 = new y9e("YUV", 1);
        b = y9eVar2;
        y9e y9eVar3 = new y9e("JPEG", 2);
        c = y9eVar3;
        y9e y9eVar4 = new y9e("JPEG_R", 3);
        d = y9eVar4;
        y9e y9eVar5 = new y9e("RAW", 4);
        e = y9eVar5;
        f = new y9e[]{y9eVar, y9eVar2, y9eVar3, y9eVar4, y9eVar5};
    }

    public static y9e valueOf(String str) {
        return (y9e) Enum.valueOf(y9e.class, str);
    }

    public static y9e[] values() {
        return (y9e[]) f.clone();
    }
}
