package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vag {
    public static final vag a;
    public static final vag b;
    public static final vag c;
    public static final vag d;
    public static final vag e;
    public static final vag f;
    public static final /* synthetic */ vag[] g;

    static {
        vag vagVar = new vag("ENQUEUED", 0);
        a = vagVar;
        vag vagVar2 = new vag("RUNNING", 1);
        b = vagVar2;
        vag vagVar3 = new vag("SUCCEEDED", 2);
        c = vagVar3;
        vag vagVar4 = new vag("FAILED", 3);
        d = vagVar4;
        vag vagVar5 = new vag("BLOCKED", 4);
        e = vagVar5;
        vag vagVar6 = new vag("CANCELLED", 5);
        f = vagVar6;
        g = new vag[]{vagVar, vagVar2, vagVar3, vagVar4, vagVar5, vagVar6};
    }

    public static vag valueOf(String str) {
        return (vag) Enum.valueOf(vag.class, str);
    }

    public static vag[] values() {
        return (vag[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
