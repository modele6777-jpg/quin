package defpackage;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v99 implements u99 {
    public final qza a;
    public final oza b;

    public v99(qza qzaVar, oza ozaVar) {
        this.a = qzaVar;
        this.b = ozaVar;
    }

    @Override // defpackage.u99
    public final String a(int i) throws IOException {
        m5f m5fVarC = c(i);
        List list = (List) m5fVarC.a();
        String strD0 = s72.D0((List) m5fVarC.b(), ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strD0;
        }
        return s72.D0(list, "/", null, null, null, 62) + '/' + strD0;
    }

    @Override // defpackage.u99
    public final boolean b(int i) {
        return ((Boolean) c(i).g()).booleanValue();
    }

    public final m5f c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            nza nzaVarM = this.b.m(i);
            String strM = this.a.m(nzaVarM.q());
            mza mzaVarO = nzaVarM.o();
            mzaVarO.getClass();
            int iOrdinal = mzaVarO.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(strM);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(strM);
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return null;
                }
                linkedList2.addFirst(strM);
                z = true;
            }
            i = nzaVarM.p();
        }
        return new m5f(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // defpackage.u99
    public final String getString(int i) {
        String strM = this.a.m(i);
        strM.getClass();
        return strM;
    }
}
