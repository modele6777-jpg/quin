package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bhe {
    public final ihe a;
    public final x16 b;
    public long i;
    public boolean k;
    public boolean l;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final lsd d = new lsd();
    public final jsd e = new jsd();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public Map h = qu4.a;
    public long j = 1000;
    public final m45 m = new m45(26, this);

    public bhe(ihe iheVar, x16 x16Var) {
        this.a = iheVar;
        this.b = x16Var;
    }

    public final boolean a(TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        return this.a == null || this.e.contains(tarotSkinIdentify);
    }

    public final void b() {
        Set setKeySet = this.h.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return;
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            if (!this.d.containsKey((TarotSkinIdentify) it.next())) {
                e();
                return;
            }
        }
    }

    public final void c(ArrayList arrayList) {
        HashMap map;
        int iF = bm8.F(t72.u(arrayList, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mhe mheVar = (mhe) it.next();
            iy9 iy9Var = new iy9(mheVar.a, Boolean.valueOf(mheVar.b));
            linkedHashMap.put(iy9Var.d(), iy9Var.e());
        }
        this.h = linkedHashMap;
        lsd lsdVar = this.d;
        Iterator it2 = s72.j1(lsdVar.c).iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            map = this.f;
            if (!zHasNext) {
                break;
            }
            TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) it2.next();
            if (!this.h.containsKey(tarotSkinIdentify)) {
                lsdVar.remove(tarotSkinIdentify);
                map.remove(tarotSkinIdentify);
                this.g.remove(tarotSkinIdentify);
            }
        }
        this.e.retainAll(this.h.keySet());
        map.keySet().retainAll(this.h.keySet());
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            mhe mheVar2 = (mhe) it3.next();
            d(mheVar2.a, mheVar2.b);
        }
    }

    public final void d(TarotSkinIdentify tarotSkinIdentify, boolean z) {
        ihe iheVar = this.a;
        if (iheVar == null || this.l || !pa7.t(this.h.get(tarotSkinIdentify), Boolean.valueOf(z)) || pa7.t(this.f.get(tarotSkinIdentify), Boolean.valueOf(z))) {
            return;
        }
        if (!((Boolean) this.b.invoke()).booleanValue()) {
            e();
            return;
        }
        long j = this.i + 1;
        this.i = j;
        this.f.put(tarotSkinIdentify, Boolean.valueOf(z));
        this.g.put(tarotSkinIdentify, Long.valueOf(j));
        zge zgeVar = new zge(this, tarotSkinIdentify, z, j);
        tarotSkinIdentify.getClass();
        if (iheVar.g) {
            return;
        }
        Handler handler = nhe.a;
        nhe.a(iheVar.c, new nt5(zgeVar, iheVar, tarotSkinIdentify, z, 7));
    }

    public final void e() {
        if (this.l || this.k) {
            return;
        }
        this.k = true;
        this.c.postDelayed(this.m, this.j);
        long j = this.j * 2;
        if (j > 8000) {
            j = 8000;
        }
        this.j = j;
    }

    public final yge f(TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        return (yge) this.d.get(tarotSkinIdentify);
    }
}
