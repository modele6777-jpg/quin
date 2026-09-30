package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ghe implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ihe b;

    public /* synthetic */ ghe(ihe iheVar, int i) {
        this.a = i;
        this.b = iheVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Object obj;
        int i = this.a;
        wef wefVar = wef.a;
        ihe iheVar = this.b;
        switch (i) {
            case 0:
                psd psdVar = lhe.a;
                Object obj2 = iheVar.c;
                psdVar.getClass();
                a26 a26Var = (a26) ((LinkedHashMap) psdVar.d).remove(obj2);
                if (a26Var != null && (obj = psdVar.c) != null) {
                    a26Var.d(obj);
                }
                break;
            default:
                lhe.a.C();
                iheVar.f = false;
                break;
        }
        return wefVar;
    }
}
