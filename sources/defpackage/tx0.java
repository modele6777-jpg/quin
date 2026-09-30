package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tx0 {
    public int a;
    public int b;
    public String c;

    public static i a() {
        i iVar = new i();
        iVar.b = 0;
        iVar.c = "";
        return iVar;
    }

    public final String toString() {
        int i = this.a;
        int i2 = zsg.a;
        lug lugVar = org.b;
        Integer numValueOf = Integer.valueOf(i);
        return ub3.k("Response Code: ", (!lugVar.containsKey(numValueOf) ? org.RESPONSE_CODE_UNSPECIFIED : (org) lugVar.get(numValueOf)).toString(), ", Debug Message: ", this.c);
    }
}
