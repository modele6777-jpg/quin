package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zge implements a26 {
    public final /* synthetic */ bhe a;
    public final /* synthetic */ TarotSkinIdentify b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ zge(bhe bheVar, TarotSkinIdentify tarotSkinIdentify, boolean z, long j) {
        this.a = bheVar;
        this.b = tarotSkinIdentify;
        this.c = z;
        this.d = j;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        final xfe xfeVar = (xfe) obj;
        final bhe bheVar = this.a;
        Handler handler = bheVar.c;
        final TarotSkinIdentify tarotSkinIdentify = this.b;
        final boolean z = this.c;
        final long j = this.d;
        handler.post(new Runnable() { // from class: ahe
            @Override // java.lang.Runnable
            public final void run() {
                Long l;
                bhe bheVar2 = bheVar;
                boolean z2 = bheVar2.l;
                jsd jsdVar = bheVar2.e;
                HashMap map = bheVar2.g;
                xfe xfeVar2 = xfeVar;
                if (!z2) {
                    Map map2 = bheVar2.h;
                    TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                    if (pa7.t(map2.get(tarotSkinIdentify2), Boolean.valueOf(z)) && (l = (Long) map.get(tarotSkinIdentify2)) != null) {
                        long jLongValue = l.longValue();
                        long j2 = j;
                        if (jLongValue == j2) {
                            map.remove(tarotSkinIdentify2, Long.valueOf(j2));
                            if (xfeVar2 == null) {
                                jsdVar.add(tarotSkinIdentify2);
                                return;
                            }
                            bheVar2.j = 1000L;
                            jsdVar.remove(tarotSkinIdentify2);
                            bheVar2.d.put(tarotSkinIdentify2, new yge(new ks(xfeVar2.a), abg.c(xfeVar2.b)));
                            return;
                        }
                    }
                }
                if (xfeVar2 != null) {
                    xfeVar2.a.recycle();
                }
            }
        });
        return wef.a;
    }
}
