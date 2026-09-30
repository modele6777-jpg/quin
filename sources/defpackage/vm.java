package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vm implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ go b;
    public final /* synthetic */ jmb c;

    public /* synthetic */ vm(go goVar, jmb jmbVar, int i) {
        this.a = i;
        this.b = goVar;
        this.c = jmbVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        jmb jmbVar = this.c;
        go goVar = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                lo loVar = goVar.a;
                loVar.i.k(fFloatValue);
                loVar.j.k(fFloatValue2);
                jmbVar.element = fFloatValue;
                break;
            default:
                lo loVar2 = goVar.a;
                loVar2.i.k(fFloatValue);
                loVar2.j.k(fFloatValue2);
                jmbVar.element = fFloatValue;
                break;
        }
        return wefVar;
    }
}
