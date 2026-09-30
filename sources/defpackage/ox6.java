package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ox6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ mx6 d;

    public /* synthetic */ ox6(mx6 mx6Var, int i, int i2) {
        this.a = 0;
        this.d = mx6Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        mx6 mx6Var = this.d;
        int i2 = this.c;
        int i3 = this.b;
        une uneVar = (une) obj;
        switch (i) {
            case 0:
                long jC = mx6Var.c(u3c.b(0, uneVar.c.length()));
                int iG = eue.g(jC);
                int iF = eue.f(jC);
                if (i3 < iG) {
                    i3 = iG;
                }
                if (i3 <= iF) {
                    iF = i3;
                }
                int iG2 = eue.g(jC);
                int iF2 = eue.f(jC);
                if (i2 < iG2) {
                    i2 = iG2;
                }
                if (i2 <= iF2) {
                    iF2 = i2;
                }
                uneVar.h(mx6Var.b(u3c.b(iF, iF2)));
                break;
            case 1:
                if (i3 < 0 || i2 < 0) {
                    l37.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i2 + " respectively.");
                }
                long jC2 = mx6Var.c(uneVar.g);
                int iF3 = eue.f(jC2);
                int iA = iF3 + i2;
                if (((iF3 ^ iA) & (i2 ^ iA)) < 0) {
                    iA = mx6Var.a();
                }
                long jB = mx6Var.b(u3c.b(eue.f(jC2), Math.min(iA, mx6Var.a())));
                vfh.y(uneVar, eue.g(jB), eue.f(jB));
                int iG3 = eue.g(jC2);
                int i4 = iG3 - i3;
                if (((i3 ^ iG3) & (iG3 ^ i4)) < 0) {
                    i4 = 0;
                }
                long jB2 = mx6Var.b(u3c.b(Math.max(0, i4), eue.g(jC2)));
                vfh.y(uneVar, eue.g(jB2), eue.f(jB2));
                break;
            default:
                eue eueVar = uneVar.v;
                q0a q0aVar = uneVar.c;
                if (eueVar != null) {
                    uneVar.g(null);
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                long jB3 = mx6Var.b(u3c.b(i3, i2));
                int iO = mh3.o(eue.g(jB3), 0, q0aVar.length());
                int iO2 = mh3.o(eue.f(jB3), 0, q0aVar.length());
                if (iO != iO2) {
                    if (iO >= iO2) {
                        uneVar.f(iO2, iO, null);
                    } else {
                        uneVar.f(iO, iO2, null);
                    }
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ox6(int i, int i2, mx6 mx6Var, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = mx6Var;
    }
}
