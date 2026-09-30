package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fde extends b0 {
    public final dde a = new dde();
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;

    public fde(ArrayList arrayList, std stdVar) {
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.d = true;
        this.c = arrayList;
        arrayList2.add(stdVar);
    }

    public static ArrayList l(std stdVar) {
        CharSequence charSequence = stdVar.a;
        int iO = vfh.O(charSequence, 0, charSequence.length());
        int length = charSequence.length();
        if (charSequence.charAt(iO) == '|') {
            iO++;
            length = vfh.P(charSequence, charSequence.length() - 1, iO) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = iO;
        while (iO < length) {
            char cCharAt = charSequence.charAt(iO);
            if (cCharAt == '\\') {
                int i2 = iO + 1;
                if (i2 >= length || charSequence.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    iO = i2;
                }
            } else if (cCharAt != '|') {
                sb.append(cCharAt);
            } else {
                arrayList.add(new std(sb.toString(), stdVar.a(i, iO).b));
                sb.setLength(0);
                i = iO + 1;
            }
            iO++;
        }
        if (sb.length() > 0) {
            arrayList.add(new std(sb.toString(), stdVar.a(i, stdVar.a.length()).b));
        }
        return arrayList;
    }

    @Override // defpackage.b0
    public final void a(std stdVar) {
        this.b.add(stdVar);
    }

    @Override // defpackage.b0
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.b0
    public final yz0 f() {
        return this.a;
    }

    @Override // defpackage.b0
    public final void i(t37 t37Var) {
        dde ddeVar = this.a;
        List listD = ddeVar.d();
        vtd vtdVar = !listD.isEmpty() ? (vtd) listD.get(0) : null;
        jde jdeVar = new jde();
        if (vtdVar != null) {
            jdeVar.b(vtdVar);
        }
        ddeVar.c(jdeVar);
        sde sdeVar = new sde();
        sdeVar.g(jdeVar.d());
        jdeVar.c(sdeVar);
        ArrayList arrayList = this.b;
        ArrayList arrayListL = l((std) arrayList.get(0));
        int size = arrayListL.size();
        for (int i = 0; i < size; i++) {
            ide ideVarK = k((std) arrayListL.get(i), i, t37Var);
            ideVarK.g = true;
            sdeVar.c(ideVarK);
        }
        int i2 = 2;
        gde gdeVar = null;
        while (i2 < arrayList.size()) {
            std stdVar = (std) arrayList.get(i2);
            vtd vtdVar2 = i2 < listD.size() ? (vtd) listD.get(i2) : null;
            ArrayList arrayListL2 = l(stdVar);
            sde sdeVar2 = new sde();
            if (vtdVar2 != null) {
                sdeVar2.b(vtdVar2);
            }
            int i3 = 0;
            while (i3 < size) {
                sdeVar2.c(k(i3 < arrayListL2.size() ? (std) arrayListL2.get(i3) : new std("", null), i3, t37Var));
                i3++;
            }
            if (gdeVar == null) {
                gdeVar = new gde();
                ddeVar.c(gdeVar);
            }
            gdeVar.c(sdeVar2);
            gdeVar.b(vtdVar2);
            i2++;
        }
    }

    @Override // defpackage.b0
    public final c72 j(hg4 hg4Var) {
        CharSequence charSequence = hg4Var.a.a;
        int iS = vfh.s('|', charSequence, hg4Var.f);
        if (iS == -1) {
            return null;
        }
        if (iS != hg4Var.f || vfh.O(charSequence, iS + 1, charSequence.length()) != charSequence.length()) {
            return c72.a(hg4Var.c);
        }
        this.d = false;
        return null;
    }

    public final ide k(std stdVar, int i, t37 t37Var) {
        ide ideVar = new ide();
        vtd vtdVar = stdVar.b;
        if (vtdVar != null) {
            ideVar.b(vtdVar);
        }
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            ideVar.h = ((ede) arrayList.get(i)).a;
        }
        CharSequence charSequence = stdVar.a;
        int iO = vfh.O(charSequence, 0, charSequence.length());
        std stdVarA = stdVar.a(iO, vfh.P(charSequence, charSequence.length() - 1, iO) + 1);
        mx mxVar = new mx(3, false);
        mxVar.a.add(stdVarA);
        t37Var.a(mxVar, ideVar);
        return ideVar;
    }
}
