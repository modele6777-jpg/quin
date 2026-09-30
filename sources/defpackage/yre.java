package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yre implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jse b;

    public /* synthetic */ yre(jse jseVar, int i) {
        this.a = i;
        this.b = jseVar;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        lyd lydVar;
        int i = this.a;
        jse jseVar = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                jseVar.w(false);
                jseVar.x(sue.a);
                break;
            default:
                if (((hkb) obj) == null) {
                    lne lneVar = jseVar.d.a;
                    if (lneVar != null && (lydVar = lneVar.J0) != null) {
                        lydVar.h(null);
                        lneVar.J0 = null;
                    }
                } else {
                    jseVar.d.a();
                }
                break;
        }
        return wefVar;
    }
}
