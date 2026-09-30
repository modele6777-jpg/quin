package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sy9 extends b0 {
    public final ny9 a = new ny9();
    public final p68 b = new p68();

    @Override // defpackage.b0
    public final void a(std stdVar) {
        String str;
        p68 p68Var = this.b;
        ArrayList arrayList = p68Var.b;
        arrayList.add(stdVar);
        if (p68Var.a == 6) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(stdVar);
        xg3 xg3Var = new xg3(arrayList2);
        while (xg3Var.f()) {
            int iB = kv2.B(p68Var.a);
            if (iB == 0) {
                p68Var.a();
                xg3Var.p();
                if (!xg3Var.k('[')) {
                    p68Var.a = 6;
                    p68Var.a();
                    return;
                } else {
                    p68Var.a = 2;
                    p68Var.e = new StringBuilder();
                    if (!xg3Var.f()) {
                        p68Var.e.append('\n');
                    }
                }
            } else {
                if (iB == 1) {
                    una unaVarN = xg3Var.n();
                    if (cgg.M(xg3Var)) {
                        p68Var.e.append(xg3Var.e(unaVarN, xg3Var.n()).e());
                        if (!xg3Var.f()) {
                            p68Var.e.append('\n');
                        } else if (xg3Var.k(']') && xg3Var.k(':') && p68Var.e.length() <= 999 && !uy4.a(p68Var.e.toString()).isEmpty()) {
                            p68Var.a = 3;
                            xg3Var.p();
                        }
                    }
                    p68Var.a = 6;
                    p68Var.a();
                    return;
                }
                if (iB == 2) {
                    xg3Var.p();
                    una unaVarN2 = xg3Var.n();
                    if (cgg.L(xg3Var)) {
                        String strE = xg3Var.e(unaVarN2, xg3Var.n()).e();
                        if (strE.startsWith("<")) {
                            strE = strE.substring(1, strE.length() - 1);
                        }
                        p68Var.f = strE;
                        int iP = xg3Var.p();
                        if (!xg3Var.f()) {
                            p68Var.i = true;
                            arrayList.clear();
                        } else if (iP == 0) {
                        }
                        p68Var.a = 4;
                    }
                    p68Var.a = 6;
                    p68Var.a();
                    return;
                }
                if (iB != 3) {
                    if (iB == 4) {
                        una unaVarN3 = xg3Var.n();
                        if (cgg.N(xg3Var, p68Var.g)) {
                            p68Var.h.append(xg3Var.e(unaVarN3, xg3Var.n()).e());
                            if (xg3Var.f()) {
                                xg3Var.j();
                                xg3Var.p();
                                if (xg3Var.f()) {
                                    p68Var.h = null;
                                } else {
                                    p68Var.i = true;
                                    arrayList.clear();
                                    p68Var.a = 1;
                                }
                            } else {
                                p68Var.h.append('\n');
                            }
                        } else {
                            p68Var.h = null;
                        }
                        p68Var.a = 6;
                        p68Var.a();
                        return;
                    }
                    switch (p68Var.a) {
                        case 1:
                            str = "START_DEFINITION";
                            break;
                        case 2:
                            str = "LABEL";
                            break;
                        case 3:
                            str = "DESTINATION";
                            break;
                        case 4:
                            str = "START_TITLE";
                            break;
                        case 5:
                            str = "TITLE";
                            break;
                        case 6:
                            str = "PARAGRAPH";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    qc0.p("Unknown parsing state: ".concat(str));
                    return;
                }
                xg3Var.p();
                if (xg3Var.f()) {
                    p68Var.g = (char) 0;
                    char cM = xg3Var.m();
                    if (cM == '\"' || cM == '\'') {
                        p68Var.g = cM;
                    } else if (cM == '(') {
                        p68Var.g = ')';
                    }
                    if (p68Var.g != 0) {
                        p68Var.a = 5;
                        p68Var.h = new StringBuilder();
                        xg3Var.j();
                        if (!xg3Var.f()) {
                            p68Var.h.append('\n');
                        }
                    } else {
                        p68Var.a = 1;
                    }
                } else {
                    p68Var.a = 1;
                }
            }
        }
    }

    @Override // defpackage.b0
    public final void b(vtd vtdVar) {
        this.b.d.add(vtdVar);
    }

    @Override // defpackage.b0
    public final void e() {
        ny9 ny9Var;
        p68 p68Var = this.b;
        p68Var.a();
        Iterator it = p68Var.c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ny9Var = this.a;
            if (!zHasNext) {
                break;
            }
            o68 o68Var = (o68) it.next();
            o68Var.i();
            sf9 sf9Var = ny9Var.d;
            o68Var.d = sf9Var;
            if (sf9Var != null) {
                sf9Var.e = o68Var;
            }
            o68Var.e = ny9Var;
            ny9Var.d = o68Var;
            sf9 sf9Var2 = ny9Var.a;
            o68Var.a = sf9Var2;
            if (o68Var.d == null) {
                sf9Var2.b = o68Var;
            }
        }
        ArrayList arrayList = p68Var.b;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            ny9Var.i();
        } else {
            ny9Var.g(p68Var.d);
        }
    }

    @Override // defpackage.b0
    public final yz0 f() {
        return this.a;
    }

    @Override // defpackage.b0
    public final List g() {
        mv3 mv3Var = new mv3();
        p68 p68Var = this.b;
        p68Var.a();
        for (o68 o68Var : p68Var.c) {
            mv3Var.a.putIfAbsent(uy4.a(o68Var.g), o68Var);
        }
        Object[] objArr = {mv3Var};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.b0
    public final void i(t37 t37Var) {
        ArrayList arrayList = this.b.b;
        mx mxVar = new mx(3, false);
        ArrayList arrayList2 = mxVar.a;
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        t37Var.a(mxVar, this.a);
    }

    @Override // defpackage.b0
    public final c72 j(hg4 hg4Var) {
        if (hg4Var.i) {
            return null;
        }
        return c72.a(hg4Var.c);
    }
}
