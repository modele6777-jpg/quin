package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ir9 extends ni5 {
    public static final ir9 d = new ir9(0, 1, 1);

    @Override // defpackage.ni5
    public final void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        ojb ojbVar = (ojb) k01Var.c(0);
        w79 w79Var = (w79) bwVar.w;
        q2a q2aVar = w79Var != null ? (q2a) w79Var.g(ojbVar) : null;
        if (q2aVar != null) {
            ArrayList arrayList = (ArrayList) bwVar.x;
            if (arrayList == null) {
                arrayList = new ArrayList();
                bwVar.x = arrayList;
            }
            arrayList.add((p89) bwVar.e);
            bwVar.e = q2aVar.b;
        }
    }
}
