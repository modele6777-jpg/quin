package defpackage;

import ai.askquin.data.SeasonalReadingStore$Snapshot;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class epc implements hf8 {
    public final t7 a;

    public epc(t7 t7Var) {
        this.a = t7Var;
    }

    public final Map a(String str) {
        Object dzbVar;
        iy9 iy9Var;
        if (!v4e.Q(str)) {
            try {
                Object objE = fzc.a.e(str);
                dzbVar = objE instanceof ti7 ? (ti7) objE : null;
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            ti7 ti7Var = (ti7) dzbVar;
            if (ti7Var != null) {
                Set<Map.Entry> setEntrySet = ti7Var.a.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : setEntrySet) {
                    String str2 = (String) entry.getKey();
                    try {
                        iy9Var = new iy9(str2, fzc.a.a(SeasonalReadingStore$Snapshot.Companion.serializer(), (nh7) entry.getValue()));
                    } catch (yyc e) {
                        d().g("skip unparseable seasonal snapshot for " + str2 + ": " + e.getMessage());
                        iy9Var = null;
                    }
                    if (iy9Var != null) {
                        arrayList.add(iy9Var);
                    }
                }
                return bm8.W(arrayList);
            }
        }
        return qu4.a;
    }

    public final String b(int i, SolarTerm solarTerm) {
        return ((mo3) this.a).a() + "#" + i + "#" + solarTerm.getWireValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, SolarTerm solarTerm, SeasonalReadingStore$Snapshot seasonalReadingStore$Snapshot, zn2 zn2Var) {
        bpc bpcVar;
        if (zn2Var instanceof bpc) {
            bpcVar = (bpc) zn2Var;
            int i2 = bpcVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bpcVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bpcVar = new bpc(this, zn2Var);
            }
        } else {
            bpcVar = new bpc(this, zn2Var);
        }
        Object objB = bpcVar.result;
        int i3 = bpcVar.label;
        bw2 bw2Var = bw2.a;
        if (i3 == 0) {
            jzb.q(objB);
            dpc dpcVar = new dpc(2, null);
            bpcVar.L$0 = solarTerm;
            bpcVar.L$1 = seasonalReadingStore$Snapshot;
            bpcVar.I$0 = i;
            bpcVar.label = 1;
            objB = lw2.b(dpcVar, bpcVar);
            if (objB != bw2Var) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
            return objB;
        }
        i = bpcVar.I$0;
        seasonalReadingStore$Snapshot = (SeasonalReadingStore$Snapshot) bpcVar.L$1;
        solarTerm = (SolarTerm) bpcVar.L$0;
        jzb.q(objB);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a((String) objB));
        linkedHashMap.put(b(i, solarTerm), seasonalReadingStore$Snapshot);
        hs3 hs3Var = xqa.u0;
        xh7 xh7Var = fzc.a;
        xh7Var.getClass();
        String strD = xh7Var.d(new qh6(p4e.a, SeasonalReadingStore$Snapshot.Companion.serializer(), 1), linkedHashMap);
        isa isaVar = hs3Var.a;
        bpcVar.L$0 = null;
        bpcVar.L$1 = null;
        bpcVar.L$2 = null;
        bpcVar.L$3 = null;
        bpcVar.L$4 = null;
        bpcVar.L$5 = null;
        bpcVar.I$0 = i;
        bpcVar.label = 2;
        Object objN = bsa.n(isaVar, strD, bpcVar);
        return objN == bw2Var ? bw2Var : objN;
    }
}
