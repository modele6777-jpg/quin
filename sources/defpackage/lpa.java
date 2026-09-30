package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lpa {
    public final q7f a;
    public final List b;
    public final String c;
    public final lpa d;

    public lpa(q7f q7fVar, List list, String str) {
        list.getClass();
        this.a = q7fVar;
        this.b = list;
        this.c = str;
        lpa lpaVar = null;
        if (str != null) {
            q7f q7fVarA = q7fVar != null ? q7fVar.a() : null;
            ArrayList arrayList = new ArrayList(t72.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q7f q7fVar2 = (q7f) it.next();
                arrayList.add(q7fVar2 != null ? q7fVar2.a() : null);
            }
            lpaVar = new lpa(q7fVarA, arrayList, null);
        }
        this.d = lpaVar;
    }
}
