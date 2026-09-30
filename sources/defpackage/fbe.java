package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fbe {
    public static final i69 a;

    static {
        sy4 sy4Var = sy4.a;
        su4 su4Var = new su4(sy4.b, tyd.f, 0);
        t99 t99VarG = tyd.g.a.g();
        yd8 yd8Var = ge8.e;
        i69 i69Var = new i69(su4Var, t99VarG, yd8Var);
        i69Var.v = e09.e;
        rz3 rz3Var = sz3.e;
        if (rz3Var == null) {
            i69.s0(9);
            throw null;
        }
        i69Var.w = rz3Var;
        List listH = t72.H(d8f.G0(i69Var, dsf.IN_VARIANCE, t99.e("T"), 0, yd8Var));
        if (i69Var.y != null) {
            s8f.h(i69Var.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listH);
        i69Var.y = arrayList;
        i69Var.x = new r22(i69Var, arrayList, i69Var.z, i69Var.X);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            i69.s0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((z12) ((c36) it.next())).v = i69Var.S();
        }
        a = i69Var;
    }
}
