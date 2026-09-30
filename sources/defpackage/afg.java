package defpackage;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.a;
import com.google.android.play.core.assetpacks.bs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class afg extends weg {
    public final /* synthetic */ int g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afg(a aVar, gle gleVar, int i) {
        super(aVar, gleVar);
        this.g = i;
        this.h = aVar;
    }

    @Override // defpackage.weg
    public void M(Bundle bundle) {
        switch (this.g) {
            case 1:
                khg khgVar = this.h.e;
                gle gleVar = this.e;
                khgVar.d(gleVar);
                int i = bundle.getInt("error_code");
                a.g.b("onError(%d)", Integer.valueOf(i));
                gleVar.b(new se0(i));
                break;
            default:
                super.M(bundle);
                break;
        }
    }

    @Override // defpackage.weg
    public void O(List list) {
        switch (this.g) {
            case 0:
                super.O(list);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Bundle bundle = (Bundle) it.next();
                    a aVar = this.h;
                    egg eggVar = aVar.b;
                    vgg vggVar = aVar.c;
                    w1e w1eVar = new w1e(13);
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
                    HashMap map = new HashMap();
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        map.put(str, bs.a(bundle, str, eggVar, vggVar, w1eVar));
                    }
                    bundle.getLong("total_bytes_to_download");
                    bs bsVar = (bs) map.values().iterator().next();
                    if (bsVar == null) {
                        a.g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
                    }
                    int i2 = bsVar.b;
                    if (i2 == 1 || i2 == 7 || i2 == 2 || i2 == 9 || i2 == 3) {
                        arrayList.add(bsVar.a);
                    }
                }
                this.e.c(arrayList);
                break;
            default:
                super.O(list);
                break;
        }
    }

    @Override // defpackage.weg
    public void P(Bundle bundle, Bundle bundle2) {
        switch (this.g) {
            case 1:
                super.P(bundle, bundle2);
                a aVar = this.h;
                if (!aVar.f.compareAndSet(true, false)) {
                    a.g.f("Expected keepingAlive to be true, but was false.", new Object[0]);
                }
                if (bundle.getBoolean("keep_alive")) {
                    aVar.f();
                }
                break;
            default:
                super.P(bundle, bundle2);
                break;
        }
    }
}
