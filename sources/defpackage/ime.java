package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ime extends sf9 {
    public String g;

    public ime(String str) {
        this.g = str;
    }

    @Override // defpackage.sf9
    public final void a(sug sugVar) {
        if (sugVar.b == 0) {
            ar0 ar0Var = (ar0) sugVar.c;
            String str = this.g;
            List listD = d();
            vtd vtdVar = listD.size() == 1 ? (vtd) listD.get(0) : null;
            gg7 gg7Var = ar0Var.a;
            gg7Var.getClass();
            if (str == null) {
                r82.g("input must not be null");
                return;
            }
            n68 n68Var = new n68(str, new m68(gg7Var, str));
            sf9 sf9Var = this;
            while (n68Var.hasNext()) {
                wtd wtdVar = (wtd) n68Var.next();
                if (sf9Var == this && !n68Var.hasNext() && !(wtdVar instanceof q68)) {
                    return;
                }
                int beginIndex = wtdVar.getBeginIndex();
                int endIndex = wtdVar.getEndIndex();
                ime imeVar = new ime(str.substring(beginIndex, endIndex));
                if (vtdVar != null) {
                    imeVar.b(vtdVar.a(beginIndex, endIndex));
                }
                if (wtdVar instanceof q68) {
                    String strI = imeVar.g;
                    if (((q68) wtdVar).a == s68.b) {
                        strI = ub3.i("mailto:", strI);
                    }
                    i68 i68Var = new i68(strI, null);
                    i68Var.c(imeVar);
                    i68Var.g(imeVar.d());
                    sf9Var.e(i68Var);
                    sf9Var = i68Var;
                } else {
                    sf9Var.e(imeVar);
                    sf9Var = imeVar;
                }
            }
            i();
        }
    }

    @Override // defpackage.sf9
    public final String h() {
        return ub3.i("literal=", this.g);
    }
}
