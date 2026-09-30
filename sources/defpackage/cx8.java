package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cx8 {
    public final cmd a;
    public final s0e b;
    public final whb c;

    public cx8(cmd cmdVar) {
        this.a = cmdVar;
        s0e s0eVarA = t0e.a(new sw8((gmd) null, 0.0f, 7));
        this.b = s0eVarA;
        this.c = if9.n(s0eVarA);
    }

    public final LinkedHashSet a(Set set) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
            if (tarotSkinIdentify.getRequiresDownload() && ((ys3) this.a).a(tarotSkinIdentify) != gmd.e) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public final void b(Set set) {
        set.getClass();
        s0e s0eVar = this.b;
        gmd gmdVar = ((sw8) s0eVar.getValue()).a;
        gmd gmdVar2 = gmd.c;
        if (gmdVar == gmdVar2) {
            return;
        }
        List listJ1 = s72.j1(a(set));
        if (listJ1.isEmpty()) {
            s0eVar.n(null, new sw8(gmd.e, 1.0f, 4));
            return;
        }
        s0eVar.n(null, new sw8(gmdVar2, 0.0f, 6));
        qn2 qn2Var = lw2.a;
        js3 js3Var = ga4.a;
        ynb.V(qn2Var, mk8.a.f, null, new bx8(this, listJ1, null), 2);
    }
}
