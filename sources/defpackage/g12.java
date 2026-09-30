package defpackage;

import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.PatternData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g12 implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public g12(a26 a26Var, int i) {
        this.a = 0;
        this.c = a26Var;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        s0e s0eVar;
        Object value;
        dda ddaVarA;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                ((a26) obj2).d(new Integer(((Number) obj).intValue() % i2));
                break;
            case 1:
                List list = (List) obj;
                if (list != null && list.size() == i2) {
                    if (list.isEmpty()) {
                        eda edaVar = (eda) obj2;
                        edaVar.getClass();
                        s0eVar = edaVar.b;
                        do {
                            value = s0eVar.getValue();
                            ddaVarA = (dda) value;
                            if (ddaVarA.a.size() == list.size()) {
                                ddaVarA = dda.a(ddaVarA, list, null, false, 6);
                            }
                        } while (!s0eVar.l(value, ddaVarA));
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String desc = ((PatternData) it.next()).getDesc();
                            if (desc == null || desc.length() == 0) {
                                break;
                            }
                        }
                        eda edaVar2 = (eda) obj2;
                        edaVar2.getClass();
                        s0eVar = edaVar2.b;
                        do {
                            value = s0eVar.getValue();
                            ddaVarA = (dda) value;
                            if (ddaVarA.a.size() == list.size()) {
                                ddaVarA = dda.a(ddaVarA, list, null, false, 6);
                            }
                        } while (!s0eVar.l(value, ddaVarA));
                    }
                }
                break;
            default:
                String str = (String) obj;
                if (str.length() == i2) {
                    ((a26) ((h0e) obj2).getValue()).d(str);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ g12(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }
}
