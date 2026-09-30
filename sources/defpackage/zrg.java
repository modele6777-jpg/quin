package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zrg implements csg {
    public final /* synthetic */ int a;
    public final kxa b;
    public final String c;

    public /* synthetic */ zrg(kxa kxaVar, String str, int i) {
        this.a = i;
        this.b = kxaVar;
        this.c = str;
    }

    @Override // defpackage.csg
    public final kxa f(vqg vqgVar) {
        int i = this.a;
        String str = this.c;
        kxa kxaVar = this.b;
        switch (i) {
            case 0:
                kxa kxaVarV = kxaVar.v();
                kxaVarV.y(str, vqgVar);
                ((HashMap) kxaVarV.d).put(str, Boolean.TRUE);
                return kxaVarV;
            default:
                kxaVar.y(str, vqgVar);
                return kxaVar;
        }
    }
}
