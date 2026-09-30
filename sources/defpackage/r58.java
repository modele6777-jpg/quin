package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r58 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r58(float f, eud eudVar, float f2, j09 j09Var, int i) {
        this.b = f;
        this.d = eudVar;
        this.c = f2;
        this.e = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(24577);
                feg.o((String) obj4, (t58) obj3, g09.a, this.b, this.c, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(1);
                q8b.b(this.b, (eud) obj4, this.c, (j09) obj3, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ r58(String str, t58 t58Var, float f, float f2, int i) {
        this.d = str;
        this.e = t58Var;
        this.b = f;
        this.c = f2;
    }
}
