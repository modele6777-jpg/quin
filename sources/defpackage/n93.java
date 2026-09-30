package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n93 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ dba c;

    public /* synthetic */ n93(String str, dba dbaVar, int i) {
        this.a = i;
        this.b = str;
        this.c = dbaVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        dba dbaVar = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                xfb.e(0, str, (6 & 2) != 0 ? null : "reading_done");
                dbaVar.invoke();
                break;
            default:
                str.getClass();
                xfb.e(0, str, (6 & 2) != 0 ? null : "reading_done");
                dbaVar.invoke();
                break;
        }
        return wefVar;
    }
}
