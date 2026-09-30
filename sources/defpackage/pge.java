package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pge {
    public static lge b;
    public static boolean d;
    public static final pge a = new pge();
    public static final LinkedHashSet c = new LinkedHashSet();

    public static void a(boolean z) {
        for (lge lgeVar : c) {
            ArrayList arrayList = lgeVar.m;
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                age ageVar = ((dge) it.next()).d;
                TarotSkinIdentify tarotSkinIdentify = ageVar != null ? ageVar.a : null;
                if (tarotSkinIdentify != null) {
                    hashSet.add(tarotSkinIdentify);
                }
            }
            jgb.I((qn2) lgeVar.k.a.b, null);
            wge wgeVar = xge.a;
            wgeVar.getClass();
            lgeVar.k = new ege(new vea(wgeVar, jgb.k(i7h.I(iqf.d(), wgeVar.b)), false, 15), new LinkedHashSet(), new LinkedHashMap());
            if (lgeVar.i(0, hashSet)) {
                lgeVar.b.w();
            }
            if (z) {
                lgeVar.h();
            } else {
                lgeVar.b();
            }
        }
        lge lgeVar2 = b;
        if (lgeVar2 != null) {
            lgeVar2.d();
        }
        b = null;
    }
}
