package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zif {
    public static final zif a;
    public static final zif b;
    public static final zif c;
    public static final /* synthetic */ zif[] d;
    public static final /* synthetic */ mx4 e;

    static {
        zif zifVar = new zif("SESSION_CONFIG", 0);
        a = zifVar;
        zif zifVar2 = new zif("DEFAULT", 1);
        b = zifVar2;
        zif zifVar3 = new zif("CAMERA2_CAMERA_CONTROL", 2);
        c = zifVar3;
        zif[] zifVarArr = {zifVar, zifVar2, zifVar3};
        d = zifVarArr;
        e = new mx4(zifVarArr);
    }

    public static zif valueOf(String str) {
        return (zif) Enum.valueOf(zif.class, str);
    }

    public static zif[] values() {
        return (zif[]) d.clone();
    }
}
