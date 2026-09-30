package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nid {
    public final String a;
    public final ArrayList b = new ArrayList();
    public iy9 c = new iy9("V", null);

    public nid(vea veaVar, String str, String str2) {
        this.a = str2;
    }

    public final void a(String str, wf7... wf7VarArr) {
        q7f q7fVar;
        str.getClass();
        if (wf7VarArr.length == 0) {
            q7fVar = null;
        } else {
            sd0 sd0Var = new sd0(1, new p(8, wf7VarArr));
            int iF = bm8.F(t72.u(sd0Var, 10));
            if (iF < 16) {
                iF = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
            Iterator it = sd0Var.iterator();
            while (true) {
                iq4 iq4Var = (iq4) it;
                if (!iq4Var.b.hasNext()) {
                    break;
                }
                n17 n17Var = (n17) iq4Var.next();
                linkedHashMap.put(Integer.valueOf(n17Var.a), (wf7) n17Var.b);
            }
            q7fVar = new q7f(linkedHashMap);
        }
        this.b.add(new iy9(str, q7fVar));
    }

    public final void b(al7 al7Var) {
        al7Var.getClass();
        this.c = new iy9(al7Var.c(), null);
    }

    public final void c(String str, wf7... wf7VarArr) {
        str.getClass();
        sd0 sd0Var = new sd0(1, new p(8, wf7VarArr));
        int iF = bm8.F(t72.u(sd0Var, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        Iterator it = sd0Var.iterator();
        while (true) {
            iq4 iq4Var = (iq4) it;
            if (!iq4Var.b.hasNext()) {
                this.c = new iy9(str, new q7f(linkedHashMap));
                return;
            } else {
                n17 n17Var = (n17) iq4Var.next();
                linkedHashMap.put(Integer.valueOf(n17Var.a), (wf7) n17Var.b);
            }
        }
    }
}
