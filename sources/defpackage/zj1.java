package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zj1 implements w87 {
    public final Context a;
    public final n23 b;
    public final Object c;
    public Map d;

    public zj1(Context context, n23 n23Var, Set set) throws a37 {
        context.getClass();
        this.a = context;
        n23Var.getClass();
        this.b = n23Var;
        this.c = new Object();
        this.d = qu4.a;
        try {
            a(s72.j1(set));
        } catch (dk1 e) {
            throw new a37(e);
        }
    }

    @Override // defpackage.w87
    public final void a(List list) throws dk1 {
        List<String> listN0;
        bb5 db5Var;
        synchronized (this.c) {
            listN0 = s72.N0(list, this.d.keySet());
        }
        if (!listN0.isEmpty() && b21.F(3, "CXCP")) {
            Log.d("CXCP", "Creating new surface combinations for: " + listN0);
        }
        n23 n23Var = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!listN0.isEmpty()) {
            try {
                for (String str : listN0) {
                    mf1 mf1VarA = n23Var.a();
                    ig1.a(str);
                    yg1 yg1VarB = mf1.b(mf1VarA, str);
                    CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                    key.getClass();
                    ui1 ui1Var = new ui1(yg1VarB, new w2e((StreamConfigurationMap) ((nc1) yg1VarB).c(key), new ut9(yg1VarB)));
                    Context context = this.a;
                    iv4 iv4Var = new iv4(str, ui1Var.a());
                    if (Build.VERSION.SDK_INT >= 35) {
                        hh1 hh1Var = (hh1) n23Var.a.c;
                        nk8.o(hh1Var);
                        db5Var = new db5(yg1VarB, hh1Var, ui1Var);
                    } else {
                        db5Var = bb5.B;
                    }
                    linkedHashMap.put(str, new t9e(context, yg1VarB, iv4Var, db5Var));
                }
            } catch (ag4 e) {
                throw new dk1("Failed to query camera metadata", e);
            } catch (Exception e2) {
                throw new dk1("Failed to build surface combinations", e2);
            }
        }
        synchronized (this.c) {
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (this.d.containsKey(str2)) {
                        Object obj = this.d.get(str2);
                        obj.getClass();
                        linkedHashMap2.put(str2, obj);
                    }
                }
                linkedHashMap2.putAll(linkedHashMap);
                this.d = linkedHashMap2;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Committed new surface combination map. Total cameras: " + linkedHashMap2.size());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
