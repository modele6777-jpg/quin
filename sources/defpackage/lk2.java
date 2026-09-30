package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lk2 extends ej8 {
    public final /* synthetic */ int g = 0;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk2(y2h y2hVar) {
        super(20);
        this.h = y2hVar;
    }

    @Override // defpackage.ej8
    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((mk2) this.h).a.W0(str);
            default:
                String str2 = (String) obj;
                oa7.x(str2);
                y2h y2hVar = (y2h) this.h;
                y2hVar.B0();
                oa7.x(str2);
                krg krgVar = y2hVar.c.c;
                ich.S(krgVar);
                psd psdVarI1 = krgVar.I1(str2);
                if (psdVarI1 == null) {
                    return null;
                }
                w0h w0hVar = ((w3h) y2hVar.b).f;
                w3h.h(w0hVar);
                w0hVar.Z.b(str2, "Populate EES config from database on cache miss. appId");
                y2hVar.I0(str2, y2hVar.J0(str2, (byte[]) psdVarI1.b));
                lk2 lk2Var = y2hVar.z;
                synchronized (lk2Var.c) {
                    Set setEntrySet = lk2Var.b.a.entrySet();
                    setEntrySet.getClass();
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = lk2Var.b.a.entrySet();
                    setEntrySet2.getClass();
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (ktg) linkedHashMap.get(str2);
        }
    }

    @Override // defpackage.ej8
    public void b(Object obj, Object obj2, Object obj3) throws Exception {
        switch (this.g) {
            case 0:
                ((String) obj).getClass();
                ((x8c) obj2).close();
                break;
            default:
                super.b(obj, obj2, obj3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk2(mk2 mk2Var) {
        super(25);
        this.h = mk2Var;
    }
}
