package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class snd {
    public static final pr4 a = new pr4(0, new ond(1));
    public static final pr4 b = new pr4(0, new ond(2));

    public static final void a(MixedDeckSnapshot mixedDeckSnapshot, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        MixedDeckSnapshot mixedDeckSnapshot2;
        Object objCopy$default;
        String strName;
        l46Var.h0(-127041875);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(mixedDeckSnapshot) : l46Var.i(mixedDeckSnapshot) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        boolean z = false;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            mfc mfcVar = ((e8b) l46Var.k(l8b.a)).C;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && l46Var.g(mixedDeckSnapshot))) {
                z = true;
            }
            boolean zE = l46Var.e(mfcVar.ordinal()) | z;
            Object objR = l46Var.R();
            if (zE || objR == sf2.a) {
                if (mixedDeckSnapshot != null) {
                    Map<String, String> skinsByCard = mixedDeckSnapshot.getSkinsByCard();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(skinsByCard.size()));
                    Iterator<T> it = skinsByCard.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        String str = (String) entry.getValue();
                        TarotSkinIdentify tarotSkinIdentifyQ = eb3.Q(str);
                        if (tarotSkinIdentifyQ != null) {
                            if (r8c.k(tarotSkinIdentifyQ)) {
                                tarotSkinIdentifyQ = r8c.e(mfcVar);
                            }
                            if (tarotSkinIdentifyQ != null && (strName = tarotSkinIdentifyQ.name()) != null) {
                                str = strName;
                            }
                        }
                        linkedHashMap.put(key, str);
                    }
                    mixedDeckSnapshot2 = mixedDeckSnapshot;
                    objCopy$default = MixedDeckSnapshot.copy$default(mixedDeckSnapshot2, null, linkedHashMap, null, 0, 13, null);
                } else {
                    mixedDeckSnapshot2 = mixedDeckSnapshot;
                    objCopy$default = null;
                }
                l46Var.p0(objCopy$default);
            } else {
                mixedDeckSnapshot2 = mixedDeckSnapshot;
                objCopy$default = objR;
            }
            mh3.a(b.a((MixedDeckSnapshot) objCopy$default), dd2Var, l46Var, (i2 & 112) | MixedDeckSnapshot.$stable | 8);
        } else {
            mixedDeckSnapshot2 = mixedDeckSnapshot;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(mixedDeckSnapshot2, dd2Var, i);
        }
    }

    public static final float b(TarotSkinIdentify tarotSkinIdentify, l46 l46Var, int i) {
        if ((i & 1) != 0) {
            tarotSkinIdentify = ((die) l46Var.k(a)).a;
        }
        if ((l46Var.k(b) != null) || tarotSkinIdentify == null) {
            return 0.5714286f;
        }
        return tarotSkinIdentify.getAspectRatio();
    }

    public static final TarotSkinIdentify c(String str, TarotSkinIdentify tarotSkinIdentify, l46 l46Var, int i) {
        str.getClass();
        if ((i & 2) != 0) {
            tarotSkinIdentify = ((die) l46Var.k(a)).a;
        }
        MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(b);
        return mixedDeckSnapshot != null ? mixedDeckSnapshot.skinFor(str) : tarotSkinIdentify;
    }
}
