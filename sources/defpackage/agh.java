package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class agh extends ngh {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ agh(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f = i;
    }

    @Override // defpackage.ngh
    public void a(Iterator it, ahh ahhVar) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.a;
                    if (!zHasNext) {
                        ahhVar.a(next, str);
                    } else {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        ahhVar.a(sb.toString(), str);
                    }
                }
                break;
            default:
                super.a(it, ahhVar);
                break;
        }
    }

    @Override // defpackage.ngh
    public void b(Object obj, ahh ahhVar) {
        switch (this.f) {
            case 1:
                ykg ykgVar = (ykg) obj;
                if (ykgVar != null) {
                    vkg vkgVar = ykgVar.a.c;
                    vkgVar.getClass();
                    int i = 0;
                    while (true) {
                        if (!(i < vkgVar.c() - vkgVar.a())) {
                            break;
                        } else if (i >= vkgVar.c() - vkgVar.a()) {
                            s8f.c();
                            break;
                        } else {
                            wkg wkgVar = vkgVar.b;
                            int iA = vkgVar.a() + i;
                            i++;
                            Map.Entry entry = (Map.Entry) wkgVar.a[iA];
                            if (((Set) entry.getValue()).isEmpty()) {
                                ahhVar.a(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    ahhVar.a(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.b(obj, ahhVar);
                break;
        }
    }
}
