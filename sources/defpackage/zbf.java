package defpackage;

import java.util.List;
import tech.chatmind.api.PatternData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zbf implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rcf b;

    public /* synthetic */ zbf(rcf rcfVar, int i) {
        this.a = i;
        this.b = rcfVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        String name;
        String desc;
        String strP0;
        int i = this.a;
        wef wefVar = wef.a;
        rcf rcfVar = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    List listI = rcfVar.i();
                    jsd jsdVar = rcfVar.f;
                    PatternData patternData = (PatternData) s72.y0(jsdVar.size(), listI);
                    boolean zK = rcfVar.k();
                    int size = jsdVar.size();
                    name = patternData != null ? patternData.getName() : null;
                    String str = name == null ? "" : name;
                    PatternData patternData2 = (PatternData) s72.y0(jsdVar.size(), rcfVar.i());
                    tm7.f(zK, size, str, (patternData2 == null || (desc = patternData2.getDesc()) == null || (strP0 = v4e.p0(desc, ',', '.', 12290, ' ')) == null) ? "" : strP0, l46Var, 0);
                }
                break;
            case 1:
                jsd jsdVar2 = rcfVar.f;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    int size2 = jsdVar2.size() + 1;
                    PatternData patternData3 = (PatternData) s72.y0(jsdVar2.size(), rcfVar.i());
                    Integer numValueOf = Integer.valueOf(size2);
                    name = patternData3 != null ? patternData3.getName() : null;
                    kn2.i(numValueOf, name != null ? name : "", l46Var2, 0, 0);
                }
                break;
            default:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    an1.h(ynb.d0(0.0f, 0.0f, 0.0f, 72.0f, 7, g09.a), rcfVar.d, l46Var3, 6);
                }
                break;
        }
        return wefVar;
    }
}
