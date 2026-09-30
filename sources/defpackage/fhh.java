package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fhh {
    public static final dhh d = new dhh();
    public static final ehh e = new ehh(0);
    public final HashMap a;
    public final HashMap b;
    public ehh c;

    public fhh(fhh fhhVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(fhhVar.a);
        map2.putAll(fhhVar.b);
        this.c = fhhVar.c;
    }

    public void a(ngh nghVar, Object obj, ahh ahhVar) {
        dhh dhhVar = (dhh) this.a.get(nghVar);
        if (dhhVar == null) {
            if (!nghVar.d || ((hlg) hlg.b.get()).a <= 20) {
                nghVar.b(obj, ahhVar);
                return;
            } else {
                ahhVar.a(obj, nghVar.a);
                return;
            }
        }
        switch (dhhVar.a) {
            case 0:
                break;
            default:
                if (nghVar.d && ((hlg) hlg.b.get()).a > 20) {
                    ahhVar.a(obj, nghVar.a);
                } else {
                    nghVar.b(obj, ahhVar);
                }
                break;
        }
    }

    public void b(ngh nghVar, Iterator it, ahh ahhVar) {
        ehh ehhVar = (ehh) this.b.get(nghVar);
        if (ehhVar != null) {
            ehhVar.a(nghVar, it, ahhVar);
            return;
        }
        ehh ehhVar2 = this.c;
        if (ehhVar2 != null && !this.a.containsKey(nghVar)) {
            ehhVar2.a(nghVar, it, ahhVar);
        } else {
            while (it.hasNext()) {
                a(nghVar, it.next(), ahhVar);
            }
        }
    }

    public /* synthetic */ fhh() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = null;
    }
}
