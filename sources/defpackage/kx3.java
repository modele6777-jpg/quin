package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kx3(cea[] ceaVarArr, t7c t7cVar, int i, int[] iArr) {
        this.a = 2;
        this.c = ceaVarArr;
        this.d = t7cVar;
        this.b = i;
        this.e = iArr;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        int i2 = 0;
        wef wefVar = wef.a;
        Object obj2 = this.e;
        int i3 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                b77 b77Var = (b77) obj3;
                e79 e79Var = (e79) obj2;
                if (obj == ((mx3) obj4)) {
                    qc0.p("A derived state calculation cannot read itself");
                    return null;
                }
                if (!(obj instanceof c1e)) {
                    return wefVar;
                }
                int i4 = b77Var.a - i3;
                int iD = e79Var.d(obj);
                e79Var.g(Math.min(i4, iD >= 0 ? e79Var.c[iD] : Integer.MAX_VALUE), obj);
                return wefVar;
            case 1:
                sq6 sq6Var = (sq6) obj4;
                zn8 zn8Var = (zn8) obj3;
                cea ceaVar = (cea) obj2;
                bea beaVar = (bea) obj;
                int i5 = sq6Var.b;
                pqe pqeVar = sq6Var.a;
                w2f w2fVar = sq6Var.c;
                tte tteVar = (tte) sq6Var.d.invoke();
                pqeVar.a(ks9.b, tgc.g(beaVar, i5, w2fVar, tteVar != null ? tteVar.a : null, zn8Var.getLayoutDirection() == cv7.b, ceaVar.a), i3, ceaVar.a);
                beaVar.k(ceaVar, Math.round(-pqeVar.a.j()), 0, 0.0f);
                return wefVar;
            default:
                cea[] ceaVarArr = (cea[]) obj4;
                t7c t7cVar = (t7c) obj3;
                int[] iArr = (int[]) obj2;
                bea beaVar2 = (bea) obj;
                int length = ceaVarArr.length;
                int i6 = 0;
                while (i2 < length) {
                    cea ceaVar2 = ceaVarArr[i2];
                    int i7 = i6 + 1;
                    ceaVar2.getClass();
                    Object objE = ceaVar2.E();
                    r7c r7cVar = objE instanceof r7c ? (r7c) objE : null;
                    an1 an1Var = r7cVar != null ? r7cVar.c : null;
                    beaVar2.g(ceaVar2, iArr[i6], an1Var != null ? an1Var.j(i3, ceaVar2.b, cv7.a) : t7cVar.b.a(ceaVar2.b, i3), 0.0f);
                    i2++;
                    i6 = i7;
                }
                return wefVar;
        }
    }

    public /* synthetic */ kx3(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
