package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kk4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jmb b;

    public /* synthetic */ kk4(jmb jmbVar, int i) {
        this.a = i;
        this.b = jmbVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        jmb jmbVar = this.b;
        oia oiaVar = (oia) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                oiaVar.a();
                jmbVar.element = fFloatValue;
                break;
            case 1:
                oiaVar.a();
                jmbVar.element = fFloatValue;
                break;
            default:
                oiaVar.getClass();
                jmbVar.element += fFloatValue;
                break;
        }
        return wefVar;
    }
}
