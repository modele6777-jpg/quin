package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rzb {
    public static final oq8 a;
    public static final ace b;
    public static final ace c;
    public static final ace d;

    static {
        rob robVar = oq8.e;
        a = kj0.c0("application/json; charset=UTF-8");
        b = new ace(new zib(13));
        c = new ace(new zib(14));
        d = new ace(new zib(15));
    }

    public static qzb a(hm9 hm9Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Objects.requireNonNull(hm9Var, "client == null");
        bt6 bt6Var = new bt6();
        bt6Var.d(null, "https://quin.love");
        ct6 ct6VarA = bt6Var.a();
        ArrayList arrayList3 = ct6VarA.f;
        if (!"".equals(arrayList3.get(arrayList3.size() - 1))) {
            yg5.l(ct6VarA, "baseUrl must end in /: ");
            return null;
        }
        xh7 xh7Var = fzc.a;
        xh7Var.getClass();
        oq8 oq8Var = a;
        oq8Var.getClass();
        arrayList.add(new d84(new v95(oq8Var, new kb6(28, xh7Var))));
        ft ftVar = tea.a;
        qfc qfcVar = tea.c;
        ArrayList arrayList4 = new ArrayList(arrayList2);
        List listG0 = qfcVar.G0(ftVar);
        arrayList4.addAll(listG0);
        List listH0 = qfcVar.H0();
        ArrayList arrayList5 = new ArrayList(arrayList.size() + 1 + listH0.size());
        arrayList5.add(new b51(0));
        arrayList5.addAll(arrayList);
        arrayList5.addAll(listH0);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList4);
        listG0.size();
        return new qzb(hm9Var, ct6VarA, listUnmodifiableList, listUnmodifiableList2, ftVar);
    }

    public static final qzb b() {
        return (qzb) b.getValue();
    }
}
