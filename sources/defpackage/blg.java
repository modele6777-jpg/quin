package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class blg extends h72 {
    public static final Map d;
    public final xgh c;

    static {
        EnumMap enumMap = new EnumMap(xgh.class);
        for (xgh xghVar : xgh.values()) {
            blg[] blgVarArr = new blg[10];
            for (int i = 0; i < 10; i++) {
                blgVarArr[i] = new blg(i, xghVar, ygh.e);
            }
            enumMap.put(xghVar, blgVarArr);
        }
        d = Collections.unmodifiableMap(enumMap);
    }

    public blg(int i, xgh xghVar, ygh yghVar) {
        super(yghVar, i);
        drb.n(xghVar, "format char");
        this.c = xghVar;
        if (yghVar.a()) {
            return;
        }
        int iB = xghVar.b();
        iB = yghVar.c() ? iB & 65503 : iB;
        StringBuilder sb = new StringBuilder("%");
        yghVar.d(sb);
        sb.append((char) iB);
    }

    @Override // defpackage.h72
    public final void E(wt4 wt4Var, Object obj) {
        wt4Var.e(obj, this.c, (ygh) this.b);
    }
}
