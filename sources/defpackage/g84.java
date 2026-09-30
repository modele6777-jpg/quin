package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g84 {
    public static final String a = ff8.n("DiagnosticsWrkr");

    public static final String a(dbg dbgVar, pbg pbgVar, mce mceVar, List list) throws IOException {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lbg lbgVar = (lbg) it.next();
            tag tagVarH = fbc.h(lbgVar);
            String str = lbgVar.a;
            mceVar.getClass();
            String str2 = tagVarH.a;
            int i = tagVarH.b;
            str2.getClass();
            kce kceVar = (kce) urg.I(mceVar.a, true, false, new lce(str2, i, 0));
            Integer numValueOf = kceVar != null ? Integer.valueOf(kceVar.c) : null;
            dbgVar.getClass();
            str.getClass();
            String strD0 = s72.D0((List) urg.I(dbgVar.a, true, false, new alc(str, 17)), ",", null, null, null, 62);
            pbgVar.getClass();
            String strD1 = s72.D0((List) urg.I(pbgVar.a, true, false, new alc(str, 29)), ",", null, null, null, 62);
            StringBuilder sbP = tec.p("\n", str, "\t ");
            sbP.append(lbgVar.c);
            sbP.append("\t ");
            sbP.append(numValueOf);
            sbP.append("\t ");
            sbP.append(lbgVar.b.name());
            sbP.append("\t ");
            sbP.append(strD0);
            sbP.append("\t ");
            sbP.append(strD1);
            sbP.append('\t');
            sb.append(sbP.toString());
        }
        return sb.toString();
    }
}
