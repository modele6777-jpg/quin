package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q22 {
    public final String a;
    public List b = pu4.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public q22(String str) {
        this.a = str;
    }

    public final void a(String str, nyc nycVar, boolean z) {
        str.getClass();
        nycVar.getClass();
        if (!this.d.add(str)) {
            StringBuilder sbP = tec.p("Element with name '", str, "' is already registered in ");
            sbP.append(this.a);
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        this.c.add(str);
        this.e.add(nycVar);
        this.f.add(pu4.a);
        this.g.add(Boolean.valueOf(z));
    }
}
