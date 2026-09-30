package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ngf {
    public static final ngf a;
    public static final ngf b;
    public static final ngf c;
    public static final ngf d;
    public static final /* synthetic */ ngf[] e;

    static {
        ngf ngfVar = new ngf("NickName", 0);
        a = ngfVar;
        ngf ngfVar2 = new ngf("Gender", 1);
        b = ngfVar2;
        ngf ngfVar3 = new ngf("Birthday", 2);
        c = ngfVar3;
        ngf ngfVar4 = new ngf("Bios", 3);
        d = ngfVar4;
        e = new ngf[]{ngfVar, ngfVar2, ngfVar3, ngfVar4};
    }

    public static ngf valueOf(String str) {
        return (ngf) Enum.valueOf(ngf.class, str);
    }

    public static ngf[] values() {
        return (ngf[]) e.clone();
    }
}
