package defpackage;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class alg extends h72 {
    public final zkg c;

    public alg(ygh yghVar, int i, zkg zkgVar) {
        super(yghVar, i);
        this.c = zkgVar;
        StringBuilder sb = new StringBuilder("%");
        yghVar.d(sb);
        sb.append(true != yghVar.c() ? 't' : 'T');
        sb.append(zkgVar.a());
    }

    @Override // defpackage.h72
    public final void E(wt4 wt4Var, Object obj) {
        ygh yghVar = (ygh) this.b;
        StringBuilder sb = (StringBuilder) wt4Var.g;
        boolean z = obj instanceof Date;
        zkg zkgVar = this.c;
        if (z || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            yghVar.d(sb2);
            sb2.append(true != yghVar.c() ? 't' : 'T');
            sb2.append(zkgVar.a());
            sb.append(String.format(bhh.a, sb2.toString(), obj));
            return;
        }
        char cA = zkgVar.a();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cA).length() + 2);
        sb3.append("%t");
        sb3.append(cA);
        wt4.h(sb, obj, sb3.toString());
    }
}
