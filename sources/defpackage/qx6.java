package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qx6 implements a26 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qx6(int i, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        une uneVar = (une) obj;
        eue eueVar = uneVar.v;
        String str = this.a;
        if (eueVar != null) {
            long j = eueVar.a;
            vfh.z(uneVar, (int) (j >> 32), (int) (j & 4294967295L), str);
        } else {
            vfh.z(uneVar, eue.g(uneVar.g), eue.f(uneVar.g), str);
        }
        int iG = eue.g(uneVar.g);
        int i = this.b;
        int length = i > 0 ? (iG + i) - 1 : (iG + i) - str.length();
        uneVar.e = this.c;
        int iO = mh3.o(length, 0, uneVar.c.length());
        uneVar.h(u3c.b(iO, iO));
        return wef.a;
    }
}
