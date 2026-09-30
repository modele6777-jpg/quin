package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ngc {
    public String a;
    public final a26 b;
    public final x16 c;
    public final LinkedHashMap d;
    public n25 e;
    public Long f;

    public ngc(String str) {
        pdc pdcVar = new pdc(12);
        mgc mgcVar = mgc.a;
        this.a = str;
        this.b = pdcVar;
        this.c = mgcVar;
        this.d = new LinkedHashMap();
    }

    public final void a(boolean z) {
        Collection collectionValues = this.d.values();
        collectionValues.getClass();
        Object obj = null;
        for (Object obj2 : collectionValues) {
            if (((a58) ((jgc) obj2).a.k()).i.compareTo(g48.e) >= 0) {
                obj = obj2;
            }
        }
        jgc jgcVar = (jgc) obj;
        if (z) {
            this.b.d(bm8.H(new iy9("page_name", jgcVar != null ? jgcVar.b : this.a), new iy9("pathway", jgcVar != null ? jgcVar.c : "app")));
        }
        long jLongValue = ((Number) this.c.invoke()).longValue();
        if (jgcVar != null) {
            Long l = this.f;
            if (l == null || jLongValue - l.longValue() >= 3000) {
                this.f = Long.valueOf(jLongValue);
                jgcVar.d.invoke();
            }
        }
    }
}
