package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xq2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ xq2(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        boolean z = true;
        boolean z2 = true;
        wef wefVar = wef.a;
        Map map = this.b;
        switch (i) {
            case 0:
                map.forEach(new al(new gl(2, (l1f) obj, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 3), z2 ? 1 : 0));
                return wefVar;
            case 1:
                es esVar = (es) obj;
                esVar.getClass();
                for (Map.Entry entry : map.entrySet()) {
                    CaptureResult.Key key = (CaptureResult.Key) entry.getKey();
                    List list = (List) entry.getValue();
                    key.getClass();
                    if (!s72.o0(list, esVar.a.get(key))) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                return Boolean.valueOf(z);
            default:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                map.forEach(new al(new v5c(2, l1fVar, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 2), 11));
                return wefVar;
        }
    }
}
