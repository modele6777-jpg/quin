package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import tech.chatmind.api.PatternData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y37 implements i2a {
    public final List a;
    public final a90 b;

    public y37(List list) {
        a90 a90Var = new a90(27);
        this.a = list;
        this.b = a90Var;
    }

    @Override // defpackage.i2a
    public final e2a a(String str) {
        int iO;
        String str2;
        String lowerCase;
        str.getClass();
        Iterator it = ((List) this.b.c).iterator();
        do {
            if (!it.hasNext()) {
                iO = -1;
                break;
            }
            iO = v4e.O(str, (String) it.next(), 0, false, 6);
        } while (iO == -1);
        if (iO != -1) {
            String string = v4e.o0(v4e.m0(iO, str)).toString();
            String string2 = v4e.o0(str.substring(iO)).toString();
            String lowerCase2 = string.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Iterator it2 = this.a.iterator();
            do {
                if (!it2.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = (String) it2.next();
                lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } while (!v4e.F(lowerCase2, lowerCase, false));
            ArrayList arrayList = new ArrayList();
            for (String str3 : v4e.U(string2)) {
                if (c5e.C(str3, "##", false) || new rob("^#?[0-9]+.*").g(str3)) {
                    String strH = new rob("^[#:：0-9 ]+").h(str3, "");
                    List listJ = new rob("[.。\\-]").j(strH);
                    if (listJ.size() > 1) {
                        String str4 = (String) listJ.get(0);
                        arrayList.add(new PatternData(str4, new rob("[.。 ]+$").h(new rob("^[.。：:\\- ]+").h(strH.substring(str4.length()), ""), "")));
                    }
                }
            }
            if (string.length() != 0 && !arrayList.isEmpty()) {
                return new e2a(string, (str2 == null || nk8.u(str2)) ? str2 : null, arrayList);
            }
        }
        return null;
    }
}
