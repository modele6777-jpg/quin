package defpackage;

import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.PatternData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fm8 implements i2a {
    @Override // defpackage.i2a
    public final e2a a(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        String string = null;
        int i = 0;
        boolean z = true;
        for (String str2 : v4e.U(str)) {
            if (v4e.e0(str2, '-')) {
                if (i == 1) {
                    string = v4e.o0(v4e.H(1, str2)).toString();
                }
                i++;
            }
            if (v4e.e0(str2, '#')) {
                z = false;
            }
            if (z) {
                sb.append(str2);
                sb.append("\n");
            }
            if (c5e.C(str2, "##", false) || new rob("^#?[0-9]+.*").g(str2)) {
                String strH = new rob("^[#:：0-9 ]+").h(str2, "");
                List listJ = new rob("[.。\\-]").j(strH);
                if (listJ.size() > 1) {
                    String str3 = (String) listJ.get(0);
                    arrayList.add(new PatternData(str3, new rob("[.。 ]+$").h(new rob("^[.。：:\\- ]+").h(strH.substring(str3.length()), ""), "")));
                }
            }
        }
        if (sb.length() == 0 || arrayList.isEmpty() || i < 2) {
            return null;
        }
        return new e2a(v4e.o0(sb.toString()).toString(), (string == null || nk8.u(string)) ? string : null, arrayList);
    }
}
